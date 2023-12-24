package com.cefetmg.tictactoeclient;

import java.util.Random;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        name_description = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        send_button = new javax.swing.JButton();
        guest_button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        header1 = new javax.swing.JLabel();
        X_Bet = new javax.swing.JRadioButton();
        O_Bet = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("loginScreen");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(63, 63, 63));
        jPanel1.setPreferredSize(new java.awt.Dimension(853, 480));

        header.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        header.setForeground(new java.awt.Color(200, 255, 200));
        header.setText("Login - Campeonato de jogo da velha ");

        name_description.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        name_description.setForeground(new java.awt.Color(200, 255, 200));
        name_description.setText("Nome:");

        name.setBackground(new java.awt.Color(200, 255, 200));
        name.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N

        send_button.setBackground(new java.awt.Color(200, 255, 200));
        send_button.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        send_button.setText("Enviar");
        send_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        send_button.setFocusPainted(false);
        send_button.setRequestFocusEnabled(false);
        send_button.setRolloverEnabled(false);
        send_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_buttonActionPerformed(evt);
            }
        });

        guest_button.setBackground(new java.awt.Color(255, 200, 200));
        guest_button.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        guest_button.setText("Assistir");
        guest_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guest_button.setFocusPainted(false);
        guest_button.setRequestFocusEnabled(false);
        guest_button.setRolloverEnabled(false);
        guest_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guest_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 764, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        header1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        header1.setForeground(new java.awt.Color(255, 200, 200));
        header1.setText("Escolha um jogador para apostar:");

        X_Bet.setBackground(new java.awt.Color(63, 63, 63));
        X_Bet.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        X_Bet.setForeground(new java.awt.Color(255, 200, 200));
        X_Bet.setText("X");
        X_Bet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        X_Bet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X_BetActionPerformed(evt);
            }
        });

        O_Bet.setBackground(new java.awt.Color(63, 63, 63));
        O_Bet.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        O_Bet.setForeground(new java.awt.Color(255, 200, 200));
        O_Bet.setText("O");
        O_Bet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        O_Bet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                O_BetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(header)
                .addGap(222, 222, 222))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(name_description)
                        .addGap(18, 18, 18)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(send_button)
                        .addGap(385, 385, 385))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(header1)
                .addGap(27, 27, 27)
                .addComponent(X_Bet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(O_Bet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guest_button, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_description)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(send_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guest_button)
                    .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(X_Bet, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(O_Bet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void send_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_buttonActionPerformed

        Random random = new Random();

        ThreadInput input = new ThreadInput(2000 + random.nextInt(7999), this);
        input.start();

        ThreadOutput output = new ThreadOutput("{\"port\": " + input.getPort() + ",\"type\": \"playerEntry\",\"value\": \"" + name.getText() + "\"}");
        output.start();
    }//GEN-LAST:event_send_buttonActionPerformed

    private void guest_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guest_buttonActionPerformed
        Random random = new Random();

        ThreadInput input = new ThreadInput(2000 + random.nextInt(7999), this);
        input.start();

        String bet = "";

        if (X_Bet.isSelected()) {
            bet = "X";
        } else if (O_Bet.isSelected()) {
            bet = "O";
        }

        ThreadOutput output = new ThreadOutput("{\"port\": " + input.getPort() + ",\"type\": \"guestEntry\",\"value\": \"" + bet + "\"}");
        output.start();
    }//GEN-LAST:event_guest_buttonActionPerformed

    private void X_BetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X_BetActionPerformed
        if (X_Bet.isSelected()) {
            O_Bet.setSelected(false);
        }
    }//GEN-LAST:event_X_BetActionPerformed

    private void O_BetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_O_BetActionPerformed
        if (O_Bet.isSelected()) {
            X_Bet.setSelected(false);
        }
    }//GEN-LAST:event_O_BetActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton O_Bet;
    private javax.swing.JRadioButton X_Bet;
    private javax.swing.JButton guest_button;
    private javax.swing.JLabel header;
    private javax.swing.JLabel header1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField name;
    private javax.swing.JLabel name_description;
    private javax.swing.JButton send_button;
    // End of variables declaration//GEN-END:variables
}
