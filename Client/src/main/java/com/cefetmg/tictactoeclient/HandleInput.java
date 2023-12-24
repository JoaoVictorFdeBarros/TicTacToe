package com.cefetmg.tictactoeclient;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class HandleInput extends Thread {

    private final ThreadInput input;
    private final JFrame loginScreen;

    public HandleInput(ThreadInput input) {
        this.input = input;
        this.loginScreen = input.getLoginScreen();
    }

    public void validatePlayer(Request player) {

        if (player.result.equals("true")) {
            Game game = new Game(this.input.getPort());
            game.setLocation(this.loginScreen.getLocationOnScreen());
            game.setVisible(true);
            input.setGameScreen(game);
            this.loginScreen.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "A sala já está cheia");
        }
    }
    
    public boolean validateGuest(Request guest) {

        if (guest.result.equals("true")) {
            GuestGame game = new GuestGame();
            game.setLocation(this.loginScreen.getLocationOnScreen());
            game.setVisible(true);
            input.setGuestGameScreen(game);
            this.loginScreen.setVisible(false);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "As apostas estão fechadas.");
            return false;
        }
    }

    public void updateUI(ThreadInput input, Request request) {

        JLabel squares[] = input.getGameScreen().getSquares();

        char[] board = request.result.toCharArray();

        for (int i = 0; i < 9; i++) {
            squares[i].setText(Character.toString(board[i]).replace("-", "     "));
        }
    }

    public void namePlayers(ThreadInput input,Request request) {
        String players[] = request.result.split("/");

        if (players.length == 2) {
            input.getGameScreen().getP1Name().setText(players[0]);
            input.getGameScreen().getP2Name().setText(players[1]);
        }
    }
}
