package com.cefetmg.tictactoeserver;

import com.google.gson.Gson;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ThreadInput extends Thread {

    private static boolean allowGuests;

    private final player p1;
    private final player p2;

    private player playerTurn;
    private final JLabel XPlayerName;
    private final JLabel YPlayerName;
    private final JLabel nextPlayerLabel;
    private final char board[];
    private static ArrayList<Bet> bet;
// <editor-fold defaultstate="collapsed" desc="Métodos básicos">  

    public ThreadInput(JLabel XPlayerName, JLabel YPlayerName, JLabel nextPlayerLabel) {
        ThreadInput.allowGuests = false;
        this.XPlayerName = XPlayerName;
        this.YPlayerName = YPlayerName;
        this.nextPlayerLabel = nextPlayerLabel;

        this.p1 = new player();
        this.p2 = new player();

        this.playerTurn = p1;
        this.bet = new ArrayList<Bet>();

        board = new char[9];

        for (int i = 0; i < 9; i++) {
            this.board[i] = '-';
        }
    }

    public static void setAllowGuests(boolean state) {
        ThreadInput.allowGuests = state;
    }

    public static boolean getAllowGuests() {
        return ThreadInput.allowGuests;
    }

    public void setP1(String ip, int port, char draw) {
        this.p1.ip = ip;
        this.p1.port = port;
        this.p1.draw = draw;
    }

    public player getP1() {
        return this.p1;
    }

    public void setP2(String ip, int port, char draw) {
        this.p2.ip = ip;
        this.p2.port = port;
        this.p2.draw = draw;
    }

    public player getP2() {
        return this.p2;
    }

    public char[] getBoard() {
        return this.board;
    }

    public void setBoard(char c, int position) {
        this.board[position] = c;
    }

    public JLabel getXPlayerName() {
        return this.XPlayerName;
    }

    public JLabel getYPlayerName() {
        return this.YPlayerName;
    }

    public void togglePlayerTurn() {

        if (this.playerTurn == this.p1) {
            this.playerTurn = this.p2;
        } else {
            this.playerTurn = this.p1;
        }
    }

    public player getPlayerTurn() {
        return this.playerTurn;
    }

    public ArrayList<Bet> getBets() {
        return this.bet;
    }

    public void addToBet(Bet bet) {
        this.bet.add(bet);
    }

    public String evaluateBoard() {
        String output = "continue";

        char[] draws = {'X', 'O'};

        String boardString = String.valueOf(this.board);
        String boardStringAux = String.valueOf(this.board);

        for (char draw : draws) {

            //Rows
            if (this.board[0] == draw && this.board[1] == draw && this.board[2] == draw) {
                output = draw + " venceu";
            }

            if (this.board[3] == draw && this.board[4] == draw && this.board[5] == draw) {
                output = draw + " venceu";
            }
            if (this.board[6] == draw && this.board[7] == draw && this.board[8] == draw) {
                output = draw + " venceu";
            }

            //Columns
            if (this.board[0] == draw && this.board[3] == draw && this.board[6] == draw) {
                output = draw + " venceu";
            }

            if (this.board[1] == draw && this.board[4] == draw && this.board[7] == draw) {
                output = draw + " venceu";
            }
            if (this.board[2] == draw && this.board[5] == draw && this.board[8] == draw) {
                output = draw + " venceu";
            }

            //Crossed
            if (this.board[0] == draw && this.board[4] == draw && this.board[8] == draw) {
                output = draw + " venceu";
            }

            if (this.board[2] == draw && this.board[4] == draw && this.board[6] == draw) {
                output = draw + " venceu";
            }

        }

        if (((boardString.length() - boardStringAux.replace("-", "").length()) == 0) && (output.equals("continue"))) {
            output = "Empate";
        }

        return output;
    }
// </editor-fold> 

    @Override
    public void run() {
        try {
            ServerSocket server = new ServerSocket(2222);
            String msg;

            while (true) {

                Socket client = server.accept();
                ObjectInputStream reader = new ObjectInputStream(client.getInputStream());
                msg = reader.readUTF();

                Gson g = new Gson();
                Request request = g.fromJson(msg, Request.class);

                HandleInput handler = new HandleInput(msg, XPlayerName, YPlayerName);
                boolean result;

                ThreadOutput output;

                switch (request.type) {

                    case "playerEntry":
                        result = handler.validatePlayer(request, this, client);
                        output = new ThreadOutput("{\"type\": \"playerValidated\",\"result\":" + Boolean.toString(result) + "}", client.getInetAddress().getHostAddress(), request.port);
                        output.start();

                        if (handler.getPlayersCounter() == 2) {

                            Random random = new Random();

                            if (random.nextInt(2) == 1) {
                                this.togglePlayerTurn();
                            }
                            ThreadInput.allowGuests = false;

                            this.nextPlayerLabel.setText("Próxima jogada: " + this.getPlayerTurn().draw);

                            output = new ThreadOutput("{\"type\": \"namePlayers\",\"result\": \"" + this.XPlayerName.getText() + "/" + this.YPlayerName.getText() + "\"}", this.p1.ip, this.p1.port);
                            output.start();

                            output = new ThreadOutput("{\"type\": \"namePlayers\",\"result\": \"" + this.XPlayerName.getText() + "/" + this.YPlayerName.getText() + "\"}", this.p2.ip, this.p2.port);
                            output.start();

                            output = new ThreadOutput("{\"type\": \"updatePlayersTurn\",\"result\": \"" + this.getPlayerTurn().draw + "\"}", this.getP1().ip, this.getP1().port);
                            output.start();

                            output = new ThreadOutput("{\"type\": \"updatePlayersTurn\",\"result\": \"" + this.getPlayerTurn().draw + "\"}", this.getP2().ip, this.getP2().port);
                            output.start();

                            GuestTransmission entryUDP = new GuestTransmission("{\"type\": \"namePlayersGuest\",\"result\":\"" + this.XPlayerName.getText() + "/" + this.YPlayerName.getText() + "/" + this.getPlayerTurn().draw + "\"}");
                            entryUDP.start();
                        }
                        break;

                    case "move":
                        result = handler.validateMove(request, this.getPlayerTurn(), client, this);
                        output = new ThreadOutput("{\"type\": \"moveValidated\",\"result\":" + Boolean.toString(result) + "}", client.getInetAddress().getHostAddress(), request.port);
                        output.start();

                        if (result) {

                            this.nextPlayerLabel.setText("Próxima jogada: " + this.getPlayerTurn().draw);

                            output = new ThreadOutput("{\"type\": \"updateUI\",\"result\":" + String.valueOf(this.board) + "}", p1.ip, p1.port);
                            output.start();

                            output = new ThreadOutput("{\"type\": \"updateUI\",\"result\":" + String.valueOf(this.board) + "}", p2.ip, p2.port);
                            output.start();

                            String gameState = this.evaluateBoard();

                            if (!gameState.equals("continue")) {
                                this.nextPlayerLabel.setText(gameState);

                                String betsResult = "";

                                for (Bet localBet : this.getBets()) {
                                    betsResult += localBet.guest + "&" + localBet.bet + "/";
                                }

                                GuestTransmission finalUDP = new GuestTransmission("{\"type\": \"betsResult\",\"result\":\"" + betsResult + String.valueOf(this.board) + "/" + gameState + "\"}");
                                finalUDP.start();

                            } else {
                                GuestTransmission UDP = new GuestTransmission("{\"type\": \"updateGuestUI\",\"result\":\"" + String.valueOf(this.board) + "\"}");
                                UDP.start();
                            }

                            output = new ThreadOutput("{\"type\": \"verifyEnd\",\"result\":\"" + gameState + "\"}", p1.ip, p1.port);
                            output.start();

                            output = new ThreadOutput("{\"type\": \"verifyEnd\",\"result\":\"" + gameState + "\"}", p2.ip, p2.port);
                            output.start();
                        }
                        break;

                    case "guestEntry":
                        output = new ThreadOutput("{\"type\": \"guestAllowed\",\"result\":" + ThreadInput.getAllowGuests() + "}", client.getInetAddress().getHostAddress(), request.port);
                        output.start();

                        String id = UUID.randomUUID().toString();

                        output = new ThreadOutput("{\"type\": \"createdId\",\"result\":" + id + "}", client.getInetAddress().getHostAddress(), request.port);
                        output.start();

                        Bet localBet = new Bet();

                        localBet.guest = id;
                        localBet.bet = request.value;

                        this.addToBet(localBet);
                        break;
                    default:
                        output = new ThreadOutput("{\"type\": \"invalidRequest\",\"result\":" + false + "}", client.getInetAddress().getHostAddress(), request.port);
                        output.start();
                        break;
                }

                reader.close();
                client.close();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro threadInput - server: " + e.getMessage());
        }
    }

}

class Request {

    public String type;
    public String value;
    public int port;
}

class player {

    public String ip;
    public int port;
    public char draw;
}

class Bet {

    public String guest;
    public String bet;
}
