package com.cefetmg.tictactoeserver;

import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

public class ThreadOutput extends Thread {

    private final String msg;
    private final String clientIp;
    private final int clientPort;

    public ThreadOutput(String msg,String clientIp,int clientPort) {
        this.msg = msg;
        this.clientIp = clientIp;
        this.clientPort = clientPort;
    }

    @Override
    public void run() {

        try {
            Socket client = new Socket(this.clientIp, this.clientPort);

            ObjectOutputStream writer = new ObjectOutputStream(client.getOutputStream());
            writer.writeUTF(msg);

            writer.close();
            client.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro threadOutput - Server: " + e.getMessage());
        }
    }

}

