package Formatki;

import Beany.UzytkownikBean;
import Narzedzia.Uzytkownicy;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Beata
 */
public class Logowanie extends javax.swing.JFrame {

    private static Logowanie logowanie;
    JFrame parentFrame;
    List<UzytkownikBean> listaUzytkownicy;
    Uzytkownicy uzytkownicy;
    /**
     * Creates new form Logowanie
     */
    public Logowanie() {
        initComponents();
        uzytkownicy = new Uzytkownicy();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Uzytkownik = new javax.swing.JLabel();
        Haslo = new javax.swing.JLabel();
        loginTF = new javax.swing.JTextField();
        Program = new javax.swing.JLabel();
        zalogujB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rejestracjaB = new javax.swing.JButton();
        wyjścieB = new javax.swing.JButton();
        hasloPF = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Uzytkownik.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        Uzytkownik.setText("Użytkownik:");

        Haslo.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        Haslo.setText("Hasło:");

        Program.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        Program.setText("Leć z wiatrem! - system do rezerwacji biletów lotniczych");

        zalogujB.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        zalogujB.setText("Zaloguj");
        zalogujB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zalogujBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel1.setText("Nie masz konta? Zarejestruj się już dziś i lataj z nami gdzie tylko chcesz! ");

        rejestracjaB.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        rejestracjaB.setText("Rejestracja");
        rejestracjaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejestracjaBActionPerformed(evt);
            }
        });

        wyjścieB.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        wyjścieB.setText("Wyjście");
        wyjścieB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wyjścieBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(Program))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Uzytkownik)
                                    .addComponent(Haslo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(zalogujB, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                        .addGap(137, 137, 137))
                                    .addComponent(loginTF)
                                    .addComponent(hasloPF, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(406, 406, 406)
                                .addComponent(wyjścieB, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rejestracjaB, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Program)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Uzytkownik)
                    .addComponent(loginTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Haslo)
                    .addComponent(hasloPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(zalogujB, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rejestracjaB, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(17, 17, 17)
                .addComponent(wyjścieB)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zalogujBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zalogujBActionPerformed
        try {
            // TODO add your handling code here:
            if(uzytkownicy.logowanie(loginTF.getText(), new String(hasloPF.getPassword())))
            {
                try {
                    new Konto().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Logowanie.class.getName()).log(Level.SEVERE, null, ex);
                }
                logowanie.dispose();
            }
            else
            {
                loginTF.setCaretColor(Color.RED);
                loginTF.setDisabledTextColor(Color.RED);
                loginTF.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
                hasloPF.setCaretColor(Color.RED);
                hasloPF.setDisabledTextColor(Color.RED);
                hasloPF.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Logowanie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_zalogujBActionPerformed

    private void rejestracjaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejestracjaBActionPerformed
        // TODO add your handling code here:
        new Rejestracja().setVisible(true);
        logowanie.dispose();
    }//GEN-LAST:event_rejestracjaBActionPerformed

    private void wyjścieBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wyjścieBActionPerformed
        // TODO add your handling code here:
        logowanie.dispose();
    }//GEN-LAST:event_wyjścieBActionPerformed

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
            java.util.logging.Logger.getLogger(Logowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try 
                {
                    logowanie = new Logowanie();
                    logowanie.setVisible(true);
                }  catch (Exception ex) {
                    Logger.getLogger(Logowanie.class.getName()).log(Level.SEVERE, null, ex);
                }
               // new AktualneLoty().setVisible(true);
               // new AktualneLoty().setVisible(true);
               // new AktualneLoty().setVisible(true);
               // new AktualneLoty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Haslo;
    private javax.swing.JLabel Program;
    private javax.swing.JLabel Uzytkownik;
    private javax.swing.JPasswordField hasloPF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField loginTF;
    private javax.swing.JButton rejestracjaB;
    private javax.swing.JButton wyjścieB;
    private javax.swing.JButton zalogujB;
    // End of variables declaration//GEN-END:variables
}
