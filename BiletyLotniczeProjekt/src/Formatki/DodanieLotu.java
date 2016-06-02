package Formatki;

import Narzedzia.Loty;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Beata
 */
public class DodanieLotu extends javax.swing.JFrame {

    Loty loty;
    ButtonGroup przylotOdlot;
    List<Object[]> listaLiniLotniczych;
    List<String> listaLotnisk;
    JFrame parentFrame;
    /**
     * Creates new form DodanieLotu
     */
    public DodanieLotu(JFrame parentF) throws SQLException {
        initComponents();
        przylotOdlot = new ButtonGroup();     
        loty = new Loty();
        przylotOdlot.add(jRadioButtonPrzylot);
        przylotOdlot.add(jRadioButtonOdlot);
        parentFrame = parentF;
        zaladujDane();
    }
    
    private void refresh() throws ParseException, Exception
    {
        new AktualneLotyAdministrator().setVisible(true);
        parentFrame.dispose();
    }

    
    public void zaladujDane() throws SQLException
    {
        //ustawienie Lini lotniczych
        listaLiniLotniczych = loty.pobierzLinieLotniczeIDostepneKlasy();
        if( listaLiniLotniczych!= null )
        {
            for( int i=0; i<listaLiniLotniczych.size(); i++ )
                { 
                    Object[] linia = listaLiniLotniczych.get(i);
                    jComboBoxLiniaLotnicza.addItem((String)linia[0]);
                    
                    if(i==0)
                    {
                        //czy jest klasa ekonomiczna
                        if(!(boolean)linia[1])
                        {
                            jTextFieldE.setEnabled(false);
                        }
                        //czy jest klasa ekonomiczna premium
                        if(!(boolean)linia[2])
                        {
                            jTextFieldEP.setEnabled(false);
                        }
                        //czy jest klasa biznes
                        if(!(boolean)linia[3])
                        {
                            jTextFieldB.setEnabled(false);
                        }
                        //czy jest klasa pierwsza
                        if(!(boolean)linia[4])
                        {
                            jTextFieldP.setEnabled(false);
                        }
                    }
                }
        }
        jComboBoxLiniaLotnicza.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                
                if(e.getStateChange() == ItemEvent.SELECTED)
                {
                    String item = (String) e.getItem();
                    System.out.println(item);
                
                    int selectedItem = 0;
                    
                    for( int i=0; i<listaLiniLotniczych.size(); i++ )
                    { 
                        Object[] linia = listaLiniLotniczych.get(i);
                        if(linia[0] == item)
                        {
                            selectedItem = i;
                            break;    
                        }
                    }
                    Object[] linia = listaLiniLotniczych.get(selectedItem);
                    //czy jest klasa ekonomiczna
                    if(!(boolean)linia[1])
                    {
                        jTextFieldE.setEnabled(false);
                    }
                    else
                    {
                        jTextFieldE.setEnabled(true);
                    }
                    //czy jest klasa ekonomiczna premium
                    if(!(boolean)linia[2] )
                    {
                        jTextFieldEP.setEnabled(false);
                    }
                    else
                    {
                        jTextFieldEP.setEnabled(true);
                    }
                    //czy jest klasa biznes
                    if(!(boolean)linia[3])
                    {
                        jTextFieldB.setEnabled(false);
                    }
                    else
                    {
                        jTextFieldB.setEnabled(true);
                    }
                    //czy jest klasa pierwsza
                    if(!(boolean)linia[4])
                    {
                        jTextFieldP.setEnabled(false);
                    }
                    else
                    {
                        jTextFieldP.setEnabled(true);
                    }
                    
                }
            }    
        });
        
       //zaladowanie miast i nazw lotnisk
       listaLotnisk = loty.pobierzNazwyLotnisk();
       if( listaLotnisk != null )
       {
           for(int i=0; i< listaLotnisk.size(); i++)
           {
                String nazwaLotniska = listaLotnisk.get(i);
                jComboBoxNazwaLotniska.addItem(nazwaLotniska);
           }
       }
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
        jLabel3 = new javax.swing.JLabel();
        jComboBoxNazwaLotniska = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldE = new javax.swing.JTextField();
        jTextFieldEP = new javax.swing.JTextField();
        jTextFieldB = new javax.swing.JTextField();
        jTextFieldP = new javax.swing.JTextField();
        buttonZapisz = new javax.swing.JButton();
        buttonAnuluj = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jRadioButtonPrzylot = new javax.swing.JRadioButton();
        jRadioButtonOdlot = new javax.swing.JRadioButton();
        jComboBoxLiniaLotnicza = new javax.swing.JComboBox<>();
        jTextDataOdlotu = new javax.swing.JTextField();
        jTextDataPrzylotu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(900, 600));

        jLabel3.setText("Data odlotu:");

        jLabel4.setText("Linia lotnicza:");

        jLabel5.setText("Lotnisko:");

        jLabel6.setText("Data przylotu:");

        jLabel7.setText("Ceny:");

        jLabel8.setText("Klasa ekonomiczna:");

        jLabel9.setText("Klasa ekonomiczna premium:");

        jLabel10.setText("Klasa biznes:");

        jLabel11.setText("Klasa pierwsza:");

        jTextFieldE.setText("0.00");

        jTextFieldEP.setText("0.00");

        jTextFieldB.setText("0.00");

        jTextFieldP.setText("0.00");
        jTextFieldP.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldEP, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldE, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldB, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldP, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(0, 67, Short.MAX_VALUE))
        );

        buttonZapisz.setLabel("Zapisz");
        buttonZapisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonZapiszActionPerformed(evt);
            }
        });

        buttonAnuluj.setText("Anuluj");
        buttonAnuluj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAnulujActionPerformed(evt);
            }
        });

        jRadioButtonPrzylot.setText("Przylot");

        jRadioButtonOdlot.setText("Odlot");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonPrzylot)
                .addGap(30, 30, 30)
                .addComponent(jRadioButtonOdlot)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonPrzylot)
                    .addComponent(jRadioButtonOdlot))
                .addContainerGap())
        );

        jTextDataOdlotu.setText("2016-06-15 11:00:00");

        jTextDataPrzylotu.setText("2016-06-15 11:00:00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonAnuluj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonZapisz))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextDataOdlotu, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxNazwaLotniska, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxLiniaLotnicza, javax.swing.GroupLayout.Alignment.LEADING, 0, 119, Short.MAX_VALUE)
                                    .addComponent(jTextDataPrzylotu))
                                .addGap(60, 60, 60))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBoxLiniaLotnicza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBoxNazwaLotniska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextDataOdlotu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextDataPrzylotu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonZapisz)
                    .addComponent(buttonAnuluj))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jLabel4.getAccessibleContext().setAccessibleName("Linia lotnicza:");
        buttonZapisz.getAccessibleContext().setAccessibleName("Zapisz");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAnulujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAnulujActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_buttonAnulujActionPerformed

    private void buttonZapiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonZapiszActionPerformed
        
        String setPrzylotOdlot = "";
        String nazwaLiniLotniczych = "";
        String nazwaLotniska = "";
        String dataOdlotu = "";
        String dataPrzylotu = "";
        float klasaE = 0;
        float klasaEP = 0;
        float klasaB = 0;
        float klasaP = 0;
        int isInserted = 0;
        int IDLotnisko = 0;
        int IDSamolot = 0;
        
        try {
               
            if (jRadioButtonOdlot.isSelected())
            {
                setPrzylotOdlot = "O";
            }
            else if(jRadioButtonPrzylot.isSelected())
            {
                setPrzylotOdlot = "P";
            }
            
            nazwaLiniLotniczych = (String)jComboBoxLiniaLotnicza.getSelectedItem();
            IDSamolot = loty.pobierzIDSamoloty(nazwaLiniLotniczych);
            
            
            nazwaLotniska = (String)jComboBoxNazwaLotniska.getSelectedItem();
            IDLotnisko = loty.pobierzIDLotnisko(nazwaLotniska);
            
            dataOdlotu = jTextDataOdlotu.getText();
            dataPrzylotu = jTextDataPrzylotu.getText();
            
            if(jTextFieldE.isEnabled())
            {
                klasaE = Float.parseFloat(jTextFieldE.getText());
            }
            if(jTextFieldEP.isEnabled())
            {
                klasaEP = Float.parseFloat(jTextFieldEP.getText());
            }
            if(jTextFieldB.isEnabled())
            {
                klasaB = Float.parseFloat(jTextFieldB.getText());
            }
            if(jTextFieldP.isEnabled())
            {
                klasaP = Float.parseFloat(jTextFieldP.getText());
            }
            
            isInserted = loty.dodajNowyLot(setPrzylotOdlot, klasaE, klasaEP, klasaB, klasaP, dataOdlotu, dataPrzylotu, IDLotnisko, IDSamolot);
            if(isInserted == 1)
            {
                this.setVisible(false);
                refresh();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Nie powiodło się dodanie nowego lotu");
                this.setVisible(false);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(DodanieLotu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonZapiszActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAnuluj;
    private javax.swing.JButton buttonZapisz;
    private javax.swing.JComboBox<String> jComboBoxLiniaLotnicza;
    private javax.swing.JComboBox<String> jComboBoxNazwaLotniska;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonOdlot;
    private javax.swing.JRadioButton jRadioButtonPrzylot;
    private javax.swing.JTextField jTextDataOdlotu;
    private javax.swing.JTextField jTextDataPrzylotu;
    private javax.swing.JTextField jTextFieldB;
    private javax.swing.JTextField jTextFieldE;
    private javax.swing.JTextField jTextFieldEP;
    private javax.swing.JTextField jTextFieldP;
    // End of variables declaration//GEN-END:variables
}
