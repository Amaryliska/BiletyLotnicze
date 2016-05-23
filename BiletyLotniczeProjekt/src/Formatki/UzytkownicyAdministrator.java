package Formatki;

import Narzedzia.Uzytkownicy;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import net.miginfocom.swing.MigLayout;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Beata
 */
public class UzytkownicyAdministrator extends javax.swing.JFrame {

    ButtonGroup zarzadzanie;
    List<AbstractButton> listCheckBoxes;
    Uzytkownicy uzytkownicy;
    List<Object[]> listaWszystkichuzytkownikow;
    JFrame parentFrame;
    /**
     * Creates new form UzytkownicyAdministrator
     */
    public UzytkownicyAdministrator() throws SQLException {
        initComponents();
        uzytkownicy = new Uzytkownicy();
        zarzadzanie  = new ButtonGroup();
        listCheckBoxes = new ArrayList<>();
        wyswietlUzytkownikowAdministrator();
        parentFrame = (JFrame)SwingUtilities.getRoot(panelZarzadzania);
    }
    
    private void refresh() throws ParseException, Exception
    {
        new UzytkownicyAdministrator().setVisible(true);
        parentFrame.dispose();
    }
    
    private void wyswietlUzytkownikowAdministrator() throws SQLException
    {
        JLabel zmiany = new JLabel("Zmień");
        
        try
        {
        listaWszystkichuzytkownikow = uzytkownicy.pokazUzytkownikowAdmin();
        DefaultTableModel model = (DefaultTableModel) listaUzytkownikow.getModel();
            
        int rekordy = model.getRowCount();
        for( int i=0; i < rekordy; i++ )
        {
            model.removeRow(0);
        }
        
        for( AbstractButton checkBox : listCheckBoxes )
        {
            zarzadzanie.remove(checkBox);
            panelZarzadzania.remove(checkBox);
        }
        
        listCheckBoxes.clear();
        panelZarzadzania.remove(zmiany);
        
         if( listaWszystkichuzytkownikow!= null )
            {
                panelZarzadzania.setLayout(new MigLayout("","","[]12[]"));
                panelZarzadzania.add(zmiany, "wrap");
                
                for( int i=0; i<listaWszystkichuzytkownikow.size(); i++ )
                { 
                    Object[] uzytkownik = listaWszystkichuzytkownikow.get(i);
                    model.addRow(uzytkownik);
                    JCheckBox zmiana = new JCheckBox();
                    zmiana.setName("zmiana"+i);
                    listCheckBoxes.add(zmiana);
                    panelZarzadzania.add(zmiana, "wrap");
                    zarzadzanie.add(zmiana);
                }
                panelZarzadzania.revalidate();
                panelZarzadzania.repaint();
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AktualneLoty.class.getName()).log(Level.SEVERE, null, ex);
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

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        buttonBlokuj = new javax.swing.JButton();
        buttonZmianaHasla = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaUzytkownikow = new javax.swing.JTable();
        panelZarzadzania = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));

        buttonBlokuj.setText("Blokuj / Odblokuj");
        buttonBlokuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBlokujActionPerformed(evt);
            }
        });

        buttonZmianaHasla.setText("Wymuś zmianę hasła");
        buttonZmianaHasla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonZmianaHaslaActionPerformed(evt);
            }
        });

        jScrollPane1.setEnabled(false);
        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        listaUzytkownikow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Imie", "Nazwisko", "Czy zablokowany", "Czy zmian hasła"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaUzytkownikow.setMinimumSize(new java.awt.Dimension(60, 320));
        listaUzytkownikow.setRowHeight(30);
        jScrollPane1.setViewportView(listaUzytkownikow);

        javax.swing.GroupLayout panelZarzadzaniaLayout = new javax.swing.GroupLayout(panelZarzadzania);
        panelZarzadzania.setLayout(panelZarzadzaniaLayout);
        panelZarzadzaniaLayout.setHorizontalGroup(
            panelZarzadzaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        panelZarzadzaniaLayout.setVerticalGroup(
            panelZarzadzaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu1.setText("Szukaj");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Moje konto");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Wiadomości");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Wyloguj");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Wyjście");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelZarzadzania, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonBlokuj)
                    .addComponent(buttonZmianaHasla))
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(buttonBlokuj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonZmianaHasla))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                            .addComponent(panelZarzadzania, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBlokujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBlokujActionPerformed
        int isInserted = 0;
        String wybranaOpcja = null;
        Enumeration enumsd = zarzadzanie.getElements();
        while( enumsd.hasMoreElements() )
        {
            JCheckBox jb = (JCheckBox)enumsd.nextElement();
            if(jb.isSelected())
            {
                wybranaOpcja = jb.getName();
                break;
            }
        }
        if( wybranaOpcja == null )
        {
            JOptionPane.showMessageDialog(this, "Proszę wybrać użytkownika.");
        }
        else
        {
            String wiersz = String.valueOf(wybranaOpcja.charAt(wybranaOpcja.length()-1));
            
            Object[] wybranyUzytkownik = listaWszystkichuzytkownikow.get(Integer.parseInt(wiersz));

            if(wybranyUzytkownik[3].equals(true))
            {
                try 
                {
                    isInserted = uzytkownicy.uaktualnijCzyBlokada((int) wybranyUzytkownik[0], false);
                    if( isInserted == 1 )
                    {
                        JOptionPane.showMessageDialog(this, "Użytkownik " + wybranyUzytkownik[1] + " " + wybranyUzytkownik[2]+ " został odblokowany.");
                        refresh();
                    }
                    else if( isInserted == 2 )
                    {
                        JOptionPane.showMessageDialog(panelZarzadzania, "Błąd przy próbie odblokowania użytkownika.");
                    }
                } 
                catch (SQLException ex) 
                {
                    Logger.getLogger(UzytkownicyAdministrator.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(UzytkownicyAdministrator.class.getName()).log(Level.SEVERE, null, ex);
                }   
            }
            else
            {
                try 
                {
                    isInserted = uzytkownicy.uaktualnijCzyBlokada((int) wybranyUzytkownik[0], true);
                    if( isInserted == 1 )
                    {
                         JOptionPane.showMessageDialog(this, "Użytkownik " + wybranyUzytkownik[1] + " " + wybranyUzytkownik[2]+ " został zablokowany.");
                         refresh();
                    }
                    else if( isInserted == 2 )
                    {
                        JOptionPane.showMessageDialog(panelZarzadzania, "Błąd przy próbie blokowania użytkownika.");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(UzytkownicyAdministrator.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(UzytkownicyAdministrator.class.getName()).log(Level.SEVERE, null, ex);
                }   
            }
        }
    }//GEN-LAST:event_buttonBlokujActionPerformed

    private void buttonZmianaHaslaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonZmianaHaslaActionPerformed
        String wybranaOpcja = null;
        int isInserted = 0;
        Enumeration enumsd = zarzadzanie.getElements();
        while( enumsd.hasMoreElements() )
        {
            JCheckBox jb = (JCheckBox)enumsd.nextElement();
            if(jb.isSelected())
            {
                wybranaOpcja = jb.getName();
                break;
            }
        }
        if( wybranaOpcja == null )
        {
            JOptionPane.showMessageDialog(this, "Proszę wybrać użytkownika.");
        }
        else
        {
            String wiersz = String.valueOf(wybranaOpcja.charAt(wybranaOpcja.length()-1));
            
            Object[] wybranyUzytkownik = listaWszystkichuzytkownikow.get(Integer.parseInt(wiersz));

            if(wybranyUzytkownik[4].equals(true))
            {
              JOptionPane.showMessageDialog(this, "Użytkownik " + wybranyUzytkownik[1] + " " + wybranyUzytkownik[2]+ " ma już wymuszoną zmianę hasła.");  
              zarzadzanie.clearSelection();
            }
            else
            {
                try 
                {
                    isInserted = uzytkownicy.uaktualnijCzyZmianaHasla((int) wybranyUzytkownik[0], true);
                    if( isInserted == 1 )
                    {
                        JOptionPane.showMessageDialog(this, "Na użytkowniku " + wybranyUzytkownik[1] + " " + wybranyUzytkownik[2]+ " zostanie wymuszone zmienienie hasła.");
                        refresh();
                    }
                    else if( isInserted == 2 )
                    {
                        JOptionPane.showMessageDialog(panelZarzadzania, "Błąd przy zmieanie prawa uzytkownika.");
                    }
                } catch (SQLException ex) 
                {
                    Logger.getLogger(UzytkownicyAdministrator.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) 
                {
                    Logger.getLogger(UzytkownicyAdministrator.class.getName()).log(Level.SEVERE, null, ex);
                } 
             }
        }
    }//GEN-LAST:event_buttonZmianaHaslaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBlokuj;
    private javax.swing.JButton buttonZmianaHasla;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaUzytkownikow;
    private javax.swing.JPanel panelZarzadzania;
    // End of variables declaration//GEN-END:variables
}


