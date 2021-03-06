package Formatki;

import Beany.AdresBean;
import Beany.DokumentBean;
import Beany.KontaktBean;
import Beany.UzytkownikBean;
import Narzedzia.Uzytkownicy;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
public class Rejestracja extends javax.swing.JFrame {
    public static final Pattern WZORZEC_WALIDACJI_ADRESU_EMAIL = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE); 
    public static final Pattern WZORZEC_WALIDACJI_LICZBY = Pattern.compile("^[0-9]{1,11}$", Pattern.CASE_INSENSITIVE); 
    Uzytkownicy uzytkownicy;
    UzytkownikBean uzytkownikBean;
    AdresBean adresBean;
    KontaktBean kontaktBean;
    DokumentBean dokumentBean;
    JFrame parentFrame;
    /**
     * Creates new form Rejestracja
     */
    public Rejestracja() {
        initComponents();
        uzytkownicy = new Uzytkownicy();
        uzytkownikBean = new UzytkownikBean();
        adresBean = new AdresBean();
        kontaktBean = new KontaktBean();
        dokumentBean = new DokumentBean();
        parentFrame = (JFrame)SwingUtilities.getRoot(jPanel1);
    }
    
    public static boolean walidacjaAdresuEmail(String adresEmail) 
    {
        Matcher matcher = WZORZEC_WALIDACJI_ADRESU_EMAIL .matcher(adresEmail);
        return matcher.find();
    }
    public static boolean walidacjaLiczby(String liczba) 
    {
        Matcher matcher = WZORZEC_WALIDACJI_LICZBY .matcher(liczba);
        return matcher.find();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        loginTF = new javax.swing.JTextField();
        hasloPF = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        imieTF = new javax.swing.JTextField();
        kobietaRB = new javax.swing.JRadioButton();
        mezczyznaRB = new javax.swing.JRadioButton();
        nazwiskoTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        peselTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nrDokumentuTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ulicaTF = new javax.swing.JTextField();
        nrDomuTF = new javax.swing.JTextField();
        adresEmailTF = new javax.swing.JTextField();
        krajTF = new javax.swing.JTextField();
        miejscowoscTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        telefonTF = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        nrMieszkaniaTF = new javax.swing.JTextField();
        zarejestrujB = new javax.swing.JButton();
        zasadyCB = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        dowodRB = new javax.swing.JRadioButton();
        paszportRB = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        powtorzHasloPF = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        errorL = new javax.swing.JLabel();
        logowanieB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel1.setText("Zarejestruj się w serwie Leć z wiatrem i odkrywaj świat w łatwy i przyjemny sposób! ");

        jLabel11.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        jLabel11.setText("Login:");

        jLabel12.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        jLabel12.setText("Hasło:");

        loginTF.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        loginTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTFActionPerformed(evt);
            }
        });

        kobietaRB.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        kobietaRB.setText("Kobieta");
        kobietaRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kobietaRBActionPerformed(evt);
            }
        });

        mezczyznaRB.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        mezczyznaRB.setText("Mężczyzna");
        mezczyznaRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mezczyznaRBActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        jLabel2.setText("Imię:");

        jLabel3.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        jLabel3.setText("Nazwisko:");

        jLabel4.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        jLabel4.setText("Pesel:");

        jLabel5.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        jLabel5.setText("Płeć:");

        jLabel6.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        jLabel6.setText("Numer dokumentu:");

        jLabel7.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        jLabel7.setText("Ulica:");

        jLabel8.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        jLabel8.setText("Nr domu:");

        jLabel9.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        jLabel9.setText("Miejscowość:");

        jLabel10.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        jLabel10.setText("Kraj:");

        jLabel14.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        jLabel14.setText("Adres email:");

        jLabel15.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        jLabel15.setText("Telefon:");

        jLabel16.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        jLabel16.setText("Nr mieszkania:");

        zarejestrujB.setText("Zarejestruj");
        zarejestrujB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zarejestrujBActionPerformed(evt);
            }
        });

        zasadyCB.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        zasadyCB.setText("Wyrażam zgodę na prztewarzanie moich danych osobowych");

        jLabel17.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        jLabel17.setText("Rodzaj dokumentu:");

        dowodRB.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        dowodRB.setText("Dowód");
        dowodRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dowodRBActionPerformed(evt);
            }
        });

        paszportRB.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        paszportRB.setText("Paszport");
        paszportRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paszportRBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(zasadyCB, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(zarejestrujB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ulicaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nrDokumentuTF, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nazwiskoTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imieTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(peselTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dowodRB)
                                    .addComponent(kobietaRB))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mezczyznaRB)
                                    .addComponent(paszportRB))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(nrDomuTF, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel16)
                            .addGap(18, 18, 18)
                            .addComponent(nrMieszkaniaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(miejscowoscTF, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(krajTF, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(adresEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telefonTF, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(imieTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nazwiskoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peselTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(kobietaRB)
                    .addComponent(mezczyznaRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(dowodRB)
                    .addComponent(paszportRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nrDokumentuTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ulicaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nrDomuTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(nrMieszkaniaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(miejscowoscTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(krajTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adresEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zarejestrujB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zasadyCB)))
        );

        jLabel13.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        jLabel13.setText("Powtórz hasło:");

        logowanieB.setText("Powrót do logowania");
        logowanieB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logowanieBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(powtorzHasloPF, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(hasloPF)
                            .addComponent(loginTF)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(errorL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logowanieB)
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hasloPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(powtorzHasloPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(errorL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logowanieB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginTFActionPerformed

    private void dowodRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dowodRBActionPerformed
        paszportRB.setSelected(false);
    }//GEN-LAST:event_dowodRBActionPerformed

    private void kobietaRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kobietaRBActionPerformed
        mezczyznaRB.setSelected(false);
    }//GEN-LAST:event_kobietaRBActionPerformed

    private void mezczyznaRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mezczyznaRBActionPerformed
        kobietaRB.setSelected(false);
    }//GEN-LAST:event_mezczyznaRBActionPerformed

    private void paszportRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paszportRBActionPerformed
        dowodRB.setSelected(false);
    }//GEN-LAST:event_paszportRBActionPerformed

    private void zarejestrujBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zarejestrujBActionPerformed
        String komunikatBledu = "";
        if(
            !loginTF.getText().equals("") &&
            !imieTF.getText().equals("") &&    
            !nazwiskoTF.getText().equals("") &&
            walidacjaAdresuEmail(adresEmailTF.getText()) &&
            (kobietaRB.isSelected() || mezczyznaRB.isSelected()) &&
            !peselTF.getText().equals("") &&
            new String(hasloPF.getPassword()).equals(new String(powtorzHasloPF.getPassword())) &&
            !krajTF.getText().equals("") &&
            !miejscowoscTF.getText().equals("") &&
            !ulicaTF.getText().equals("") &&
            walidacjaLiczby(nrDomuTF.getText()) &&
            walidacjaLiczby(nrMieszkaniaTF.getText()) &&
            walidacjaAdresuEmail(adresEmailTF.getText()) &&
            !telefonTF.getText().equals("") &&
            (paszportRB.isSelected() || dowodRB.isSelected()) &&
            !nrDokumentuTF.getText().equals("") &&
            zasadyCB.isSelected()
        ) 
        {
            uzytkownikBean.setUzytkownikLogin(loginTF.getText());
            uzytkownikBean.setUzytkownikImie(imieTF.getText());
            uzytkownikBean.setUzytkownikNazwisko(nazwiskoTF.getText());
            uzytkownikBean.setUzytkownikAdresEmail(adresEmailTF.getText());
            if(kobietaRB.isSelected()) {
                uzytkownikBean.setUzytkownikPlec("K");   
            }
            if(mezczyznaRB.isSelected()) {
                uzytkownikBean.setUzytkownikPlec("M");   
            }
            uzytkownikBean.setUzytkownikPESEL(peselTF.getText());
            uzytkownikBean.setUzytkownikCzyAdministrator(false);
            uzytkownikBean.setUzytkownikCzyZablokowany(false);
            uzytkownikBean.setUzytkownikHaslo(new String(hasloPF.getPassword()));
            uzytkownikBean.setUzytkownikSaldo(5000);
            
            adresBean.setAdresKraj(krajTF.getText());
            adresBean.setAdresMiasto(miejscowoscTF.getText());
            adresBean.setAdresUlica(ulicaTF.getText());
            adresBean.setAdresNrDomu(Integer.parseInt(nrDomuTF.getText()));
            adresBean.setAdresNrMieszkania(Integer.parseInt(nrMieszkaniaTF.getText()));
            
            kontaktBean.setKontaktEmail(adresEmailTF.getText());
            kontaktBean.setKontaktTelefon(telefonTF.getText());
            
            if(dowodRB.isSelected()) {
                dokumentBean.setDokumentTyp("D");
            }
            if(paszportRB.isSelected()) {
                dokumentBean.setDokumentTyp("P");
            }
            dokumentBean.setDokumentNumer(nrDokumentuTF.getText());
        } else {
            komunikatBledu = "Prosze wypelnic wszystkie pola!";
        }   
        try {
            if(uzytkownicy.czyIstniejeUzytkownik(uzytkownikBean.getUzytkownikLogin(), uzytkownikBean.getUzytkownikAdresEmail()))
            {
                komunikatBledu = "Taki użytkownik istnieje!";
            }
        } catch (SQLException ex) {
            Logger.getLogger(Rejestracja.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if(komunikatBledu.equals("")) {
                if(uzytkownicy.rejestracja(uzytkownikBean, adresBean, kontaktBean, dokumentBean) > 0) 
                {
                    new Logowanie().setVisible(true);
                    parentFrame.dispose();
                }
            } else {
                errorL.setForeground(Color.red);
                errorL.setText(komunikatBledu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Rejestracja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_zarejestrujBActionPerformed

    private void logowanieBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logowanieBActionPerformed
        new Logowanie().setVisible(true);
        parentFrame.dispose();
    }//GEN-LAST:event_logowanieBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresEmailTF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton dowodRB;
    private javax.swing.JLabel errorL;
    private javax.swing.JPasswordField hasloPF;
    private javax.swing.JTextField imieTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton kobietaRB;
    private javax.swing.JTextField krajTF;
    private javax.swing.JTextField loginTF;
    private javax.swing.JButton logowanieB;
    private javax.swing.JRadioButton mezczyznaRB;
    private javax.swing.JTextField miejscowoscTF;
    private javax.swing.JTextField nazwiskoTF;
    private javax.swing.JTextField nrDokumentuTF;
    private javax.swing.JTextField nrDomuTF;
    private javax.swing.JTextField nrMieszkaniaTF;
    private javax.swing.JRadioButton paszportRB;
    private javax.swing.JTextField peselTF;
    private javax.swing.JPasswordField powtorzHasloPF;
    private javax.swing.JTextField telefonTF;
    private javax.swing.JTextField ulicaTF;
    private javax.swing.JButton zarejestrujB;
    private javax.swing.JCheckBox zasadyCB;
    // End of variables declaration//GEN-END:variables
}
