package com.cefetmg.tictactoeclient;

import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

public class ThreadOutput extends Thread {

    private String msg;

    public ThreadOutput(String msg) {
        this.msg = msg;
    }

    public String getMsg(){
        return this.msg;
    }
    
    @Override
    public void run() {

        try {
            //String ip = JOptionPane.showInputDialog("Digite o IP do host: ");
            Socket client = new Socket("localhost", 2222);
            ObjectOutputStream writer = new ObjectOutputStream(client.getOutputStream());
            writer.writeUTF(msg);

            writer.close();
            client.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro threadOutput - client: " + e.getMessage());
        }
    }
}
