package com.cefetmg.tictactoeserver;

import java.awt.Color;

public class ControlPanel extends javax.swing.JFrame {

    public ControlPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        playersButton = new javax.swing.JToggleButton();
        GuestsButton = new javax.swing.JToggleButton();
        XPlayerName = new javax.swing.JLabel();
        YPlayerName = new javax.swing.JLabel();
        nextPlayer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(63, 63, 63));
        jPanel1.setPreferredSize(new java.awt.Dimension(853, 480));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(200, 200, 255));
        jLabel1.setText("Painel de Controle - Campeonato de jogo da velha");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(200, 200, 255));
        jLabel2.setText("Jogadores:");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(200, 200, 255));
        jLabel3.setText("Expectadores:");

        playersButton.setBackground(new java.awt.Color(255, 127, 127));
        playersButton.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        playersButton.setText("Fechado");
        playersButton.setBorder(null);
        playersButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playersButton.setFocusPainted(false);
        playersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playersButtonActionPerformed(evt);
            }
        });

        GuestsButton.setBackground(new java.awt.Color(255, 127, 127));
        GuestsButton.setText("Fechado");
        GuestsButton.setBorder(null);
        GuestsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GuestsButton.setFocusPainted(false);
        GuestsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuestsButtonActionPerformed(evt);
            }
        });

        XPlayerName.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        XPlayerName.setForeground(new java.awt.Color(200, 200, 255));
        XPlayerName.setText("Jogador 1 (X): ");

        YPlayerName.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        YPlayerName.setForeground(new java.awt.Color(200, 200, 255));
        YPlayerName.setText("Jogador 2 (O): ");

        nextPlayer.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        nextPlayer.setForeground(new java.awt.Color(200, 200, 255));
        nextPlayer.setText("Próxima jogada:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nextPlayer)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(56, 56, 56)
                                        .addComponent(playersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(XPlayerName))
                                .addGap(100, 100, 100)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(56, 56, 56)
                                        .addComponent(GuestsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(YPlayerName)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(playersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GuestsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel3))
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(XPlayerName)
                    .addComponent(YPlayerName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(nextPlayer)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playersButtonActionPerformed

        if (!playersButton.getBackground().equals(Color.GREEN)) {

            playersButton.setBackground(Color.GREEN);
            playersButton.setText("Aberto");
            ThreadInput input = new ThreadInput(XPlayerName, YPlayerName, nextPlayer);
            input.start();
        }
    }//GEN-LAST:event_playersButtonActionPerformed

    private void GuestsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuestsButtonActionPerformed
        if (!GuestsButton.getBackground().equals(Color.GREEN)) {

            GuestsButton.setBackground(Color.GREEN);
            GuestsButton.setText("Aberto");
            ThreadInput.setAllowGuests(true);
        }
    }//GEN-LAST:event_GuestsButtonActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new ControlPanel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton GuestsButton;
    private javax.swing.JLabel XPlayerName;
    private javax.swing.JLabel YPlayerName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nextPlayer;
    private javax.swing.JToggleButton playersButton;
    // End of variables declaration//GEN-END:variables
}
