package Formatki;

import Narzedzia.Loty;
import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Beata
 */
public class AktualneLotyAdministrator extends javax.swing.JFrame {

    Loty loty;
    List<Object[]> listaLotow;
    ButtonGroup modyfikacje;
    List<AbstractButton> listCheckBoxes;
    /**
     * Creates new form AktualneLotyAdministrator
     */
    public AktualneLotyAdministrator() {
        initComponents();
        loty = new Loty();
        modyfikacje = new ButtonGroup();
        listCheckBoxes = new ArrayList<AbstractButton>();
        pokazAktualneLoty();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaWszystkichLotow = new javax.swing.JTable();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        panelModyfikacji = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));

        jButton3.setText("Dodaj");

        listaWszystkichLotow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Miasto", "Lotnisko", "Linia Lotnicza", "Klasa", "Cena"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaWszystkichLotow.setRowHeight(30);
        jScrollPane2.setViewportView(listaWszystkichLotow);

        jButton32.setLabel("Edytuj");

        jButton33.setLabel("Usuń");

        jLabel4.setText("Modyfikuj");

        javax.swing.GroupLayout panelModyfikacjiLayout = new javax.swing.GroupLayout(panelModyfikacji);
        panelModyfikacji.setLayout(panelModyfikacjiLayout);
        panelModyfikacjiLayout.setHorizontalGroup(
            panelModyfikacjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModyfikacjiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelModyfikacjiLayout.setVerticalGroup(
            panelModyfikacjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModyfikacjiLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 448, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(647, 647, 647)
                    .addComponent(panelModyfikacji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(238, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton32)
                .addGap(18, 18, 18)
                .addComponent(jButton33)
                .addGap(131, 131, 131))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(panelModyfikacji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(70, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listaWszystkichLotow;
    private javax.swing.JPanel panelModyfikacji;
    // End of variables declaration//GEN-END:variables

    private void pokazAktualneLoty() {

        try
        {   
            listaLotow = loty.pokazLotyAdmin();
            DefaultTableModel model = (DefaultTableModel) listaWszystkichLotow.getModel();
            
            int rekordy = model.getRowCount();
            for( int i=0; i < rekordy; i++ )
            {
                model.removeRow(0);
            }
            
            for( AbstractButton checkBox : listCheckBoxes )
            {
                modyfikacje.remove(checkBox);
                panelModyfikacji.remove(checkBox);
            }
            
            listCheckBoxes.clear();
            
            if( listaLotow!= null )
            {
                panelModyfikacji.setLayout(new GridLayout(0, 1, 10, 10));
                Object[] mojaNowaLista = new Object[listaLotow.size()];
                for( int i=0; i<listaLotow.size(); i++ )
                { 
                    Object[] lot = listaLotow.get(i);
                    model.addRow(lot);
                    JCheckBox modyfikuj = new JCheckBox();
                    modyfikuj.setName("modyfikuj"+i);
                    listCheckBoxes.add(modyfikuj);
                    panelModyfikacji.add(modyfikuj);
                    modyfikacje.add(modyfikuj);
                }
                //jLabel4.setVisible(true);
                //jLabel5.setVisible(true);
                panelModyfikacji.revalidate();
                panelModyfikacji.repaint();
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AktualneLoty.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
