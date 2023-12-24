package com.cefetmg.tictactoeclient;

import com.google.gson.Gson;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ThreadInput extends Thread {

    private final int port;
    private String response;
    private final JFrame loginScreen;
    private Game gameScreen;
    private GuestGame guestGameScreen;

    public ThreadInput(int port, JFrame loginScreen) {
        response = "";
        this.port = port;
        this.loginScreen = loginScreen;
    }

    public String getResponse() {
        return this.response;
    }

    public int getPort() {
        return this.port;
    }

    public JFrame getLoginScreen() {
        return this.loginScreen;
    }
    public void setGameScreen(Game gameScreen) {
        this.gameScreen = gameScreen;
    }

    public Game getGameScreen() {
        return this.gameScreen;
    }

    public void setGuestGameScreen(GuestGame guestGameScreen) {
        this.guestGameScreen = guestGameScreen;
    }

    public GuestGame getGuestGameScreen() {
        return this.guestGameScreen;
    }

    @Override
    public void run() {
        try {
            ServerSocket server = new ServerSocket(this.port);

            while (true) {
                Socket client = server.accept();
                ObjectInputStream reader = new ObjectInputStream(client.getInputStream());
                this.response = reader.readUTF();

                Gson g = new Gson();
                Request request = g.fromJson(this.getResponse(), Request.class);

                HandleInput handler = new HandleInput(this);

                switch (request.type) {

                    case "playerValidated":
                        handler.validatePlayer(request);
                        break;

                    case "moveValidated":
                        break;

                    case "updateUI":
                        handler.updateUI(this, request);
                        break;

                    case "namePlayers":
                        handler.namePlayers(this, request);
                        break;
                    case "updatePlayersTurn":
                        this.gameScreen.getPlayerTurn().setText("Vez de: " + request.result);
                        break;

                    case "verifyEnd":
                        if (!request.result.equals("continue")) {
                            this.gameScreen.getPlayerTurn().setText(request.result);
                        }
                        break;
                    case "guestAllowed":
                        if(handler.validateGuest(request)){
                            TransmissionListener transmission = new TransmissionListener(this.guestGameScreen);
                            transmission.start();
                        }
                        break;
                    case "createdId":{
                        this.guestGameScreen.setId(request.result);
                    }
                    default:
                        break;
                }
                reader.close();
                client.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro threadInput - client: " + e.getMessage());
        }
    }
}

class Request {

    public String type;
    public String result;
}
