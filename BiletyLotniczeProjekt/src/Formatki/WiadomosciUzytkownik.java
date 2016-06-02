package Formatki;

import Beany.UzytkownikBean;
import Beany.WiadomoscBean;
import Narzedzia.Uzytkownicy;
import Narzedzia.Wiadomosci;
import Wzorce.SingletonUzytkownik;
import java.awt.Color;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Beata
 */
public class WiadomosciUzytkownik extends javax.swing.JFrame {
    
    JFrame parentFrame;
    UzytkownikBean uzytkownikBean;
    Wiadomosci wiadomosci;
    Uzytkownicy uzytkownicy;
    List<UzytkownikBean> listaAdministratorzyBean;
    List<UzytkownikBean> listaUzytkownikowBean;
    List<WiadomoscBean> listaWiadomosciBean;
    String[] tabAdministratorzy;
    Object[][] tabWiadomosci;
    /**
     * Creates new form Wiadomosci
     */
    public WiadomosciUzytkownik() throws SQLException {
        initComponents();
        parentFrame = (JFrame)SwingUtilities.getRoot(jPanel1);
        uzytkownikBean = SingletonUzytkownik.pobierzInstancje().pobierzUzytkownik();
        wiadomosciT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
            },
            new String [] {
                "Od", "Do", "Temat", "Treść", "Data"
            }
        ));
        wiadomosci = new Wiadomosci();
        uzytkownicy = new Uzytkownicy();
        
        // lista administratorow
        listaAdministratorzyBean = uzytkownicy.pobierzAdministratorow();
        ustawAdministratorow(listaAdministratorzyBean);
        
        // tabela z wiadomosciami
        listaUzytkownikowBean = uzytkownicy.pobierzUzytkownikow();
        listaWiadomosciBean = wiadomosci.pobierzWiadomosci(uzytkownikBean.getUzytkownikID());
        ustawTabeleWiadomosci(listaUzytkownikowBean, listaWiadomosciBean);   
    }
    
    private void ustawAdministratorow(List<UzytkownikBean> listaAdministratorzyBean) {
        tabAdministratorzy = new String[listaAdministratorzyBean.size()];
        for( int i = 0; i < listaAdministratorzyBean.size(); i++ ) {
            tabAdministratorzy[i] = listaAdministratorzyBean.get(i).getUzytkownikImie() + " " + listaAdministratorzyBean.get(i).getUzytkownikNazwisko();
        }
        administratorzyL.setModel(new javax.swing.AbstractListModel() {
            public int getSize() { return tabAdministratorzy.length; }
            public Object getElementAt(int i) { return tabAdministratorzy[i]; }
        });
    }
    
    private void ustawTabeleWiadomosci(List<UzytkownikBean> listaUzytkownikowBean, List<WiadomoscBean> listaWiadomosciBean) {
        tabWiadomosci = new Object[listaWiadomosciBean.size()][5];
        System.out.println(listaWiadomosciBean.size());
        for( int i = 0; i < listaWiadomosciBean.size(); i++ ) {
            for( UzytkownikBean user : listaUzytkownikowBean )
            {
                if(user.getUzytkownikID() == listaWiadomosciBean.get(i).getWiadomoscIDNadawcy()) {
                    tabWiadomosci[i][0] = user.getUzytkownikImie() + " " + user.getUzytkownikNazwisko();
                }
                if(user.getUzytkownikID() == listaWiadomosciBean.get(i).getWiadomoscIDOdbiorcy()) {
                    tabWiadomosci[i][1] = user.getUzytkownikImie() + " " + user.getUzytkownikNazwisko();
                }
            }
            tabWiadomosci[i][2] = listaWiadomosciBean.get(i).getWiadomoscTemat();
            if(listaWiadomosciBean.get(i).getWiadomoscTyp().equals("0")) {
                tabWiadomosci[i][3] = listaWiadomosciBean.get(i).getWiadomoscTresc();
            } else {
                tabWiadomosci[i][3] = wiadomosci.pobierzWiadomoscPoTypie(listaWiadomosciBean.get(i).getWiadomoscTyp());
            }
            tabWiadomosci[i][4] = listaWiadomosciBean.get(i).getWiadomoscData();
        }
        wiadomosciT.setModel(new javax.swing.table.DefaultTableModel(
            tabWiadomosci,
            new String [] {
                "Od", "Do", "Temat", "Treść", "Data"
            }
        ));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        wiadomosciT = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        administratorzyL = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        trescTA = new javax.swing.JTextArea();
        wyslijB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tematTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        infoL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        wiadomosciT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
            },
            new String [] {
                "Od", "Do", "Temat", "Treść", "Data"
            }
        ));
        jScrollPane4.setViewportView(wiadomosciT);

        administratorzyL.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Osoba 1" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(administratorzyL);

        trescTA.setColumns(20);
        trescTA.setRows(5);
        jScrollPane1.setViewportView(trescTA);

        wyslijB.setText("Wyślij");
        wyslijB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wyslijBActionPerformed(evt);
            }
        });

        jLabel2.setText("Treść wiadomości");

        jLabel3.setText("Temat");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(wyslijB, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tematTF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(infoL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tematTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(wyslijB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(infoL)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel1.setText("Administratorzy");

        jLabel4.setText("Wiadomości");

        jMenu1.setText("Szukaj");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Moje konto");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Wiadomości");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Wyloguj");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Wyjście");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        new Logowanie().setVisible(true);
        parentFrame.dispose();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        parentFrame.dispose();
    }//GEN-LAST:event_jMenu5MouseClicked

    private void wyslijBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wyslijBActionPerformed
        if(!tematTF.getText().equals("") && !trescTA.equals("") && !administratorzyL.isSelectionEmpty()) {
            int idAdmina = 0;
            infoL.setForeground(Color.green);
            infoL.setText("Wiadomosc została wysłana.");
            for( UzytkownikBean admin : listaAdministratorzyBean )
            {
                if((admin.getUzytkownikImie() + " " + admin.getUzytkownikNazwisko()).equals(administratorzyL.getSelectedValue())) {
                    idAdmina = admin.getUzytkownikID();
                }
            }
            try {
                wiadomosci.wyslijWiadomosc(uzytkownikBean.getUzytkownikID(), idAdmina, tematTF.getText(), trescTA.getText(), "0");
            } catch (SQLException ex) {
                Logger.getLogger(WiadomosciUzytkownik.class.getName()).log(Level.SEVERE, null, ex);
            }
            tematTF.setText("");
            trescTA.setText("");
        } else {
            infoL.setForeground(Color.red);
            infoL.setText("Nie zostały spełnione wszystkie warunki do wysłania wiadomosci.");
        }
    }//GEN-LAST:event_wyslijBActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        try {
            // TODO add your handling code here:
            if (uzytkownikBean.isUzytkownikCzyAdministrator()) {
                new WiadomosciAdministrator().setVisible(true);
            } else {
                new WiadomosciUzytkownik().setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Konto.class.getName()).log(Level.SEVERE, null, ex);
        }
        parentFrame.dispose();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        if( SingletonUzytkownik.pobierzInstancje().pobierzUzytkownik().isUzytkownikCzyAdministrator() )
        {
            new AktualneLotyAdministrator().setVisible(true);
        }
        else
        {
            new AktualneLoty().setVisible(true);
        }
        parentFrame.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        if( SingletonUzytkownik.pobierzInstancje().pobierzUzytkownik().isUzytkownikCzyAdministrator() )
                {
            try {
                new UzytkownicyAdministrator().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(AktualneLoty.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
                else
                {      
                    try {
                        new Konto().setVisible(true);
                    } catch (Exception ex) {
                        Logger.getLogger(Logowanie.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
        parentFrame.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> administratorzyL;
    private javax.swing.JLabel infoL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField tematTF;
    private javax.swing.JTextArea trescTA;
    private javax.swing.JTable wiadomosciT;
    private javax.swing.JButton wyslijB;
    // End of variables declaration//GEN-END:variables
}
