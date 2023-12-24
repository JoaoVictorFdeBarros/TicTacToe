package com.cefetmg.tictactoeclient;

import com.google.gson.Gson;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TransmissionListener {

    private GuestGame game;
    private String playersTurn;

    public TransmissionListener(GuestGame game) {
        this.game = game;
        playersTurn = "";
    }

    public void switchPlayers() {
        if (playersTurn.equals("O")) {
            playersTurn = "X";
        } else {
            playersTurn = "O";
        }
        game.getPlayerTurn().setText("Vez de: " + playersTurn);
    }

    public void start() {
        final ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        InetAddress ad = InetAddress.getByName("230.0.0.1");
                        InetSocketAddress group = new InetSocketAddress(ad, 6666);
                        NetworkInterface nif = NetworkInterface.getByName("wlp0s20f3");
                        MulticastSocket socket = new MulticastSocket(group.getPort());
                        socket.joinGroup(group, nif);

                        byte[] msgByte = new byte[256];
                        DatagramPacket pkg = new DatagramPacket(msgByte, msgByte.length);
                        socket.receive(pkg);

                        String msg = new String(pkg.getData()).trim();
                        Gson g = new Gson();
                        TransmisionRequest request = g.fromJson(msg, TransmisionRequest.class);

                        if (request.type.equals("updateGuestUI")) {
                            JLabel squares[] = game.getSquares();

                            char[] board = request.result.toCharArray();

                            switchPlayers();
                            for (int i = 0; i < 9; i++) {
                                squares[i].setText(Character.toString(board[i]).replace("-", "     "));
                            }
                        } else if (request.type.equals("namePlayersGuest")) {
                            String players[] = request.result.split("/");

                            if (players.length == 3) {
                                game.getP1Name().setText(players[0]);
                                game.getP2Name().setText(players[1]);
                                game.getPlayerTurn().setText("Vez de: " + players[2]);
                                playersTurn = request.result;
                            }
                        } else if (request.type.equals("betsResult")) {
                            String requestData[] = request.result.split("/");
                            String screenUpdate = requestData[requestData.length - 2];
                            String gameResult = requestData[requestData.length - 1];;
                            String[] bets = new String[requestData.length - 1];
                            
                            for (int i=0;i<requestData.length - 1;i++){
                                bets[i] = requestData[i];
                            }
                            
                            for (String bet : bets){
                                String betData[] = bet.split("&");
                                
                                if (betData[0].equals(game.getId())){
                                    
                                    if (gameResult.contains(betData[1])){
                                        game.getPlayerTurn().setText("Você venceu a aposta");
                                    }else{
                                       game.getPlayerTurn().setText("Você perdeu a aposta");
                                    }
                                    
                                    
                                }
                            }
                            JLabel squares[] = game.getSquares();

                            char[] board = screenUpdate.toCharArray();

                            for (int i = 0; i < 9; i++) {
                                squares[i].setText(Character.toString(board[i]).replace("-", "     "));
                            }
                        }

                    } catch (Exception e) {

                        e.printStackTrace();
                    }
                }
            }
        });
    }

}

class TransmisionRequest {

    public String type;
    public String result;
}
