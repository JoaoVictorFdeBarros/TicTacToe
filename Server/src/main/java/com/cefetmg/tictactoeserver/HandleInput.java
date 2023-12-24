package com.cefetmg.tictactoeserver;

import java.net.Socket;
import javax.swing.JLabel;

public class HandleInput {

    private final String msg;
    private final JLabel XPlayerName;
    private final JLabel YPlayerName;
    private static int playersCounter = 0;

    public HandleInput(String msg, JLabel XPlayerName, JLabel YPlayerName) {
        this.msg = msg;
        this.XPlayerName = XPlayerName;
        this.YPlayerName = YPlayerName;
    }

    public int getPlayersCounter() {
        return this.playersCounter;
    }

    public boolean validatePlayer(Request player, ThreadInput game, Socket client) {

        if (player.type.equals("playerEntry") && playersCounter < 2) {
            if (playersCounter == 0) {
                this.XPlayerName.setText("Jogador 1 (X): " + player.value.replace("/", ""));
                playersCounter++;

                game.setP1(client.getInetAddress().getHostAddress(), player.port, 'X');
            } else if (playersCounter == 1) {
                this.YPlayerName.setText("Jogador 2 (O): " + player.value.replace("/", ""));
                playersCounter++;

                game.setP2(client.getInetAddress().getHostAddress(), player.port, 'O');
            }
        } else {
            return false;
        }

        return true;
    }

    public boolean validateMove(Request playerRequest, player playerTurn, Socket client, ThreadInput game) {

        if (game.getP1().ip == null || game.getP2().ip == null) {
            return false;
        }

        if ((client.getInetAddress().getHostAddress().equals(playerTurn.ip)) && (playerRequest.port == playerTurn.port)) {

            if ((game.getBoard()[Integer.parseInt(playerRequest.value) - 1] == '-') && game.evaluateBoard().equals("continue")) {

                game.setBoard(playerTurn.draw, Integer.parseInt(playerRequest.value) - 1);
                game.togglePlayerTurn();

                ThreadOutput output = new ThreadOutput("{\"type\": \"updatePlayersTurn\",\"result\": \"" + game.getPlayerTurn().draw + "\"}", game.getP1().ip, game.getP1().port);
                output.start();

                output = new ThreadOutput("{\"type\": \"updatePlayersTurn\",\"result\": \"" + game.getPlayerTurn().draw + "\"}", game.getP2().ip, game.getP2().port);
                output.start();

                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}