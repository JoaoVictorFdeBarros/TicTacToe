package com.cefetmg.tictactoeclient;
import javax.swing.JLabel;

public class Game extends javax.swing.JFrame {

    private final int inputPort;
    private final JLabel squares[];

    public Game(int inputPort) {
        initComponents();
        this.inputPort = inputPort;
        
        this.squares = new JLabel[9];
        this.squares[0] = square1;
        this.squares[1] = square2;
        this.squares[2] = square3;
        this.squares[3] = square4;
        this.squares[4] = square5;
        this.squares[5] = square6;
        this.squares[6] = square7;
        this.squares[7] = square8;
        this.squares[8] = square9;
    }
    
    public JLabel[] getSquares(){
        return this.squares;
    }
    
    public JLabel getP1Name(){
        return this.p1Name;
    }
    public JLabel getP2Name(){
        return this.p2Name;
    }
    
    public JLabel getPlayerTurn(){
        return this.playersTurn;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        p1Name = new javax.swing.JLabel();
        p2Name = new javax.swing.JLabel();
        playersTurn = new javax.swing.JLabel();
        board = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        square2 = new javax.swing.JLabel();
        square5 = new javax.swing.JLabel();
        square8 = new javax.swing.JLabel();
        square1 = new javax.swing.JLabel();
        square4 = new javax.swing.JLabel();
        square7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        square3 = new javax.swing.JLabel();
        square9 = new javax.swing.JLabel();
        square6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(63, 63, 63));
        jPanel1.setPreferredSize(new java.awt.Dimension(853, 480));

        p1Name.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        p1Name.setForeground(new java.awt.Color(255, 200, 200));
        p1Name.setText("Aguardando");

        p2Name.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        p2Name.setForeground(new java.awt.Color(255, 200, 200));
        p2Name.setText("Oponente");

        playersTurn.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        playersTurn.setForeground(new java.awt.Color(255, 200, 200));
        playersTurn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playersTurn.setText("Vez de:");

        board.setBackground(new java.awt.Color(63, 63, 63));

        jPanel3.setBackground(new java.awt.Color(255, 200, 200));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 200, 200));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 200, 200));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 200, 200));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 200, 200));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 200, 200));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(255, 200, 200));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        square2.setFont(new java.awt.Font("Liberation Sans", 0, 48)); // NOI18N
        square2.setForeground(new java.awt.Color(255, 200, 200));
        square2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        square2.setText("     ");
        square2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        square2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                square2MouseClicked(evt);
            }
        });

        square5.setFont(new java.awt.Font("Liberation Sans", 0, 48)); // NOI18N
        square5.setForeground(new java.awt.Color(255, 200, 200));
        square5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        square5.setText("     ");
        square5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        square5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                square5MouseClicked(evt);
            }
        });

        square8.setFont(new java.awt.Font("Liberation Sans", 0, 48)); // NOI18N
        square8.setForeground(new java.awt.Color(255, 200, 200));
        square8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        square8.setText("     ");
        square8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        square8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                square8MouseClicked(evt);
            }
        });

        square1.setFont(new java.awt.Font("Liberation Sans", 0, 48)); // NOI18N
        square1.setForeground(new java.awt.Color(255, 200, 200));
        square1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        square1.setText("     ");
        square1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        square1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                square1MouseClicked(evt);
            }
        });

        square4.setFont(new java.awt.Font("Liberation Sans", 0, 48)); // NOI18N
        square4.setForeground(new java.awt.Color(255, 200, 200));
        square4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        square4.setText("     ");
        square4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        square4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                square4MouseClicked(evt);
            }
        });

        square7.setFont(new java.awt.Font("Liberation Sans", 0, 48)); // NOI18N
        square7.setForeground(new java.awt.Color(255, 200, 200));
        square7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        square7.setText("     ");
        square7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        square7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                square7MouseClicked(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(255, 200, 200));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        square3.setFont(new java.awt.Font("Liberation Sans", 0, 48)); // NOI18N
        square3.setForeground(new java.awt.Color(255, 200, 200));
        square3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        square3.setText("     ");
        square3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        square3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                square3MouseClicked(evt);
            }
        });

        square9.setFont(new java.awt.Font("Liberation Sans", 0, 48)); // NOI18N
        square9.setForeground(new java.awt.Color(255, 200, 200));
        square9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        square9.setText("     ");
        square9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        square9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                square9MouseClicked(evt);
            }
        });

        square6.setFont(new java.awt.Font("Liberation Sans", 0, 48)); // NOI18N
        square6.setForeground(new java.awt.Color(255, 200, 200));
        square6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        square6.setText("     ");
        square6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        square6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        square6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                square6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout boardLayout = new javax.swing.GroupLayout(board);
        board.setLayout(boardLayout);
        boardLayout.setHorizontalGroup(
            boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boardLayout.createSequentialGroup()
                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(square7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(square4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(square1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(square2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(square5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(boardLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(square8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(square3, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(square6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(square9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        boardLayout.setVerticalGroup(
            boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardLayout.createSequentialGroup()
                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(boardLayout.createSequentialGroup()
                        .addComponent(square1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(square4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(boardLayout.createSequentialGroup()
                        .addComponent(square3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(square6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boardLayout.createSequentialGroup()
                        .addComponent(square7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(square9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boardLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(square2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(square5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(square8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(p1Name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(p2Name)
                .addGap(106, 106, 106))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(board, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(playersTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(349, 349, 349))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1Name)
                    .addComponent(p2Name))
                .addGap(12, 12, 12)
                .addComponent(playersTurn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(board, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void square3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_square3MouseClicked
        ThreadOutput output = new ThreadOutput("{\"port\": " + this.inputPort + ",\"type\":\"move\",\"value\":3}");
        output.start();
    }//GEN-LAST:event_square3MouseClicked

    private void square6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_square6MouseClicked
        ThreadOutput output = new ThreadOutput("{\"port\": " + this.inputPort + ",\"type\":\"move\",\"value\":6}");
        output.start();
    }//GEN-LAST:event_square6MouseClicked

    private void square9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_square9MouseClicked
        ThreadOutput output = new ThreadOutput("{\"port\": " + this.inputPort + ",\"type\":\"move\",\"value\":9}");
        output.start();
    }//GEN-LAST:event_square9MouseClicked

    private void square7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_square7MouseClicked
        ThreadOutput output = new ThreadOutput("{\"port\": " + this.inputPort + ",\"type\":\"move\",\"value\":7}");
        output.start();
    }//GEN-LAST:event_square7MouseClicked

    private void square4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_square4MouseClicked
        ThreadOutput output = new ThreadOutput("{\"port\": " + this.inputPort + ",\"type\":\"move\",\"value\":4}");
        output.start();
    }//GEN-LAST:event_square4MouseClicked

    private void square1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_square1MouseClicked

        ThreadOutput output = new ThreadOutput("{\"port\": " + this.inputPort + ",\"type\":\"move\",\"value\":1}");
        output.start();
    }//GEN-LAST:event_square1MouseClicked

    private void square8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_square8MouseClicked
        ThreadOutput output = new ThreadOutput("{\"port\": " + this.inputPort + ",\"type\":\"move\",\"value\":8}");
        output.start();
    }//GEN-LAST:event_square8MouseClicked

    private void square5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_square5MouseClicked
        ThreadOutput output = new ThreadOutput("{\"port\": " + this.inputPort + ",\"type\":\"move\",\"value\":5}");
        output.start();
    }//GEN-LAST:event_square5MouseClicked

    private void square2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_square2MouseClicked
        ThreadOutput output = new ThreadOutput("{\"port\": " + this.inputPort + ",\"type\":\"move\",\"value\":2}");
        output.start();
    }//GEN-LAST:event_square2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel board;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel p1Name;
    private javax.swing.JLabel p2Name;
    private javax.swing.JLabel playersTurn;
    private javax.swing.JLabel square1;
    private javax.swing.JLabel square2;
    private javax.swing.JLabel square3;
    private javax.swing.JLabel square4;
    private javax.swing.JLabel square5;
    private javax.swing.JLabel square6;
    private javax.swing.JLabel square7;
    private javax.swing.JLabel square8;
    private javax.swing.JLabel square9;
    // End of variables declaration//GEN-END:variables
}
