/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TIK_TAK_TAO;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/**
 *
 * @author marju
 */
public class GAME extends javax.swing.JFrame {

    /**
     * Creates new form GAMEE
     */
    public GAME() {
        initComponents();
    }
   
    
    
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        result = new javax.swing.JButton();
        show = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLocation(new java.awt.Point(400, 150));

        jPanel1.setLayout(null);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 153, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Introduction: \nOne player choose X.\n                   &\nOne player choose O.");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 340, 130);

        t1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel1.add(t1);
        t1.setBounds(10, 160, 110, 70);

        t2.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        t2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        jPanel1.add(t2);
        t2.setBounds(130, 160, 110, 70);

        t3.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        t3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        jPanel1.add(t3);
        t3.setBounds(250, 160, 110, 70);

        t4.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        t4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        jPanel1.add(t4);
        t4.setBounds(10, 250, 110, 70);

        t5.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        t5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        jPanel1.add(t5);
        t5.setBounds(130, 250, 110, 70);

        t6.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        t6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        jPanel1.add(t6);
        t6.setBounds(250, 250, 110, 70);

        t7.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        t7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });
        jPanel1.add(t7);
        t7.setBounds(10, 340, 110, 70);

        t8.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        t8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(t8);
        t8.setBounds(130, 340, 110, 70);

        t9.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        t9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        t9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t9ActionPerformed(evt);
            }
        });
        jPanel1.add(t9);
        t9.setBounds(250, 340, 110, 70);

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(0, 0, 153));
        jTextField11.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setText("1st Player's Choice");
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField11);
        jTextField11.setBounds(440, 170, 190, 70);

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(0, 0, 153));
        jTextField10.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setText("2nd Player's Choice");
        jPanel1.add(jTextField10);
        jTextField10.setBounds(440, 240, 190, 70);

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(0, 153, 51));
        jTextField12.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("O");
        jPanel1.add(jTextField12);
        jTextField12.setBounds(390, 240, 50, 70);

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(0, 153, 51));
        jTextField13.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("X");
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField13);
        jTextField13.setBounds(390, 170, 50, 70);

        result.setBackground(new java.awt.Color(255, 0, 102));
        result.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        result.setForeground(new java.awt.Color(255, 255, 255));
        result.setText("RESULT");
        result.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });
        jPanel1.add(result);
        result.setBounds(460, 110, 170, 60);

        show.setEditable(false);
        show.setBackground(new java.awt.Color(0, 255, 255));
        show.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        show.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        show.setBorder(null);
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        jPanel1.add(show);
        show.setBounds(390, 10, 240, 100);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(460, 370, 100, 40);

        jButton2.setBackground(new java.awt.Color(255, 255, 51));
        jButton2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(390, 320, 100, 40);

        jButton3.setBackground(new java.awt.Color(255, 0, 51));
        jButton3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(530, 320, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TIK_TAK_TAO/5357e8dd7774c11.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t6ActionPerformed

    private void t9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t9ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t7ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        // TODO add your handling code here:
        String a = (t1.getText());
        String b = (t2.getText());
        String c = (t3.getText());
        String d = (t4.getText());
        String e = (t5.getText());
        String f = (t6.getText());
        String g = (t7.getText());
        String h = (t8.getText());
        String i = (t9.getText());
        
        String j = "Win First Player";
        String k = "Win Second Player";
        String l = "Please Enter X or O";
        
        
            

            if(a.equals("x")||a.equals("X")){
                if(a.equals(b)){
                    if(a.equals(c)){
                        show.setText(""+j);
                        t1.setBackground(Color.green);
                        t2.setBackground(Color.green);
                        t3.setBackground(Color.green);
                    }
                }
            }
            
            if(d.equals("x")||d.equals("X")){
                if(d.equals(e)){
                    if(d.equals(f)){
                        show.setText(""+j);
                        t4.setBackground(Color.green);
                        t5.setBackground(Color.green);
                        t6.setBackground(Color.green);
                    }
                }
            }
            
            if(g.equals("x")||g.equals("X")){
                if(g.equals(h)){
                    if(g.equals(i)){
                        show.setText(""+j);
                        t7.setBackground(Color.green);
                        t8.setBackground(Color.green);
                        t9.setBackground(Color.green);
                    }
                }
            }
            
            if(a.equals("x")||a.equals("X")){
                if(a.equals(d)){
                    if(a.equals(g)){
                        show.setText(""+j);
                        t1.setBackground(Color.green);
                        t4.setBackground(Color.green);
                        t7.setBackground(Color.green);
                    }
                }
            }
            
            if(a.equals("x")||a.equals("X")){
                if(a.equals(e)){
                    if(a.equals(i)){
                        show.setText(""+j);
                        t1.setBackground(Color.green);
                        t5.setBackground(Color.green);
                        t9.setBackground(Color.green);
                    }
                }
            }
            
            if(c.equals("x")||c.equals("X")){
                if(c.equals(e)){
                    if(c.equals(g)){
                        show.setText(""+j);
                        t3.setBackground(Color.green);
                        t5.setBackground(Color.green);
                        t7.setBackground(Color.green);
                    }
                }
            }
            
            if(c.equals("x")||c.equals("X")){
                if(c.equals(f)){
                    if(c.equals(i)){
                        show.setText(""+j);
                        t3.setBackground(Color.green);
                        t6.setBackground(Color.green);
                        t9.setBackground(Color.green);
                    }
                }
            }
            
            if(b.equals("x")||b.equals("X")){
                if(b.equals(e)){
                    if(b.equals(h)){
                        show.setText(""+j);
                        t2.setBackground(Color.green);
                        t5.setBackground(Color.green);
                        t8.setBackground(Color.green);
                    }
                }
            }
            
            
            
            
            
            
            
            
            
            
            
            if(a.equals("o")||a.equals("O")){
                if((a.equals(b))||a.equals(e)||a.equals(d)){
                    if(a.equals(c)||a.equals(i)||a.equals(g)){ 
                        show.setText(""+k);
                        t1.setBackground(Color.GREEN);
                    }
                }
            }

            if(a.equals("o")||a.equals("O")){
                if(a.equals(b)){
                    if(a.equals(c)){
                        show.setText(""+k);
                        t1.setBackground(Color.green);
                        t2.setBackground(Color.green);
                        t3.setBackground(Color.green);
                    }
                }
            }
            
            if(d.equals("o")||d.equals("O")){
                if(d.equals(e)){
                    if(d.equals(f)){
                        show.setText(""+k);
                        t4.setBackground(Color.green);
                        t5.setBackground(Color.green);
                        t6.setBackground(Color.green);
                    }
                }
            }
            
            if(g.equals("o")||g.equals("O")){
                if(g.equals(h)){
                    if(g.equals(i)){
                        show.setText(""+k);
                        t7.setBackground(Color.green);
                        t8.setBackground(Color.green);
                        t9.setBackground(Color.green);
                    }
                }
            }
            
            if(a.equals("o")||a.equals("O")){
                if(a.equals(d)){
                    if(a.equals(g)){
                        show.setText(""+k);
                        t1.setBackground(Color.green);
                        t4.setBackground(Color.green);
                        t7.setBackground(Color.green);
                    }
                }
            }
            
            if(a.equals("o")||a.equals("O")){
                if(a.equals(e)){
                    if(a.equals(i)){
                        show.setText(""+k);
                        t1.setBackground(Color.green);
                        t5.setBackground(Color.green);
                        t9.setBackground(Color.green);
                    }
                }
            }
            
            if(c.equals("o")||c.equals("O")){
                if(c.equals(e)){
                    if(c.equals(g)){
                        show.setText(""+k);
                        t3.setBackground(Color.green);
                        t5.setBackground(Color.green);
                        t7.setBackground(Color.green);
                    }
                }
            }
            
            if(c.equals("o")||c.equals("O")){
                if(c.equals(f)){
                    if(c.equals(i)){
                        show.setText(""+k);
                        t3.setBackground(Color.green);
                        t6.setBackground(Color.green);
                        t9.setBackground(Color.green);
                    }
                }
            }
            
            if(b.equals("o")||b.equals("O")){
                if(b.equals(e)){
                    if(b.equals(h)){
                        show.setText(""+k);
                        t2.setBackground(Color.green);
                        t5.setBackground(Color.green);
                        t8.setBackground(Color.green);
                    }
                }
            }
           
    }//GEN-LAST:event_resultActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new TIK_TAK().setVisible(true);
        close();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        t8.setText("");
        t9.setText("");
        
        t1.setBackground(Color.WHITE);
        t2.setBackground(Color.WHITE);
        t3.setBackground(Color.WHITE);
        t4.setBackground(Color.WHITE);
        t5.setBackground(Color.WHITE);
        t6.setBackground(Color.WHITE);
        t7.setBackground(Color.WHITE);
        t8.setBackground(Color.WHITE);
        t9.setBackground(Color.WHITE);
        
        show.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JButton result;
    private javax.swing.JTextField show;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
}
