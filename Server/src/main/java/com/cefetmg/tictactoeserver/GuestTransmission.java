package com.cefetmg.tictactoeserver;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JOptionPane;

public class GuestTransmission {

    private String input;

    public GuestTransmission(String input) {
        this.input = input;
    }

    public void start() {
        final ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {

                    byte[] msg = (input).getBytes();
                    InetAddress ad = InetAddress.getByName("230.0.0.1");
                    DatagramSocket ds = new DatagramSocket();
                    DatagramPacket pkg = new DatagramPacket(msg, msg.length, ad, 6666);

                    ds.send(pkg);
                    ds.close();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro no EMT: " + e.getMessage());
                }
            }
        });
        executorService.shutdown();
    }
}
