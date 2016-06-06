/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import businesslogic.ConsumptionAdminManager;
import businesslogic.OrderAdminManager;
import datastorage.OrderDAO;
import domain.Consumption;
import domain.Order;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NickB
 */
public class GUI5formunactive extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public GUI5formunactive() {
        initComponents();
        
        JTableOrders.setRowHeight(50);
        
        doOrdersTableRefresh();
    }
    
    private void fillOrdersTable(DefaultTableModel tm) {
        int rowIndex = 0;
        
        for(Order o : orderAdminManager.getOrderLijst() )
        {      
            
            if (o.getStatus().equals("Sent")) continue;
            
            String bID = "" + o.getOrderID();
            String tID = "" + o.getConsumption();
            String oms = "" + o.getConsumptionType();
            String sta = "" + o.getStatus();
            
            Object[] row = new Object[]{bID, tID, oms, sta};
            tm.insertRow(rowIndex, row);
            
            rowIndex += 1;
        }
    }
    
    private void orderTableClearAllRows(DefaultTableModel tm) {    
        int rowCount = tm.getRowCount();
        
        for (int i = 0; i < rowCount; i++)
        {
            tm.removeRow(0);
        }
    }
    
    private void doOrdersTableRefresh()
    {
        // reload orders from database
        orderAdminManager.refreshOrdersList();
        
        DefaultTableModel tm = (DefaultTableModel)JTableOrders.getModel();
        orderTableClearAllRows(tm);
        fillOrdersTable(tm);
     //   jTabbedPane1.setEnabledAt(3, false);
        
    }
    
    private void doReadyButtonPress()
    {
        try
        {
          
         
            int orderId = Integer.parseInt(readyIdTF.getText());
            orderAdminManager.updateOrderStatus("Ready", orderId);
            doOrdersTableRefresh();      
           
        
        }
        catch(NumberFormatException nfe)
        {
            
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

        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        signedInAsField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        usernameEntryField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        passwordEntryField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        refreshButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        readyIdTF = new javax.swing.JTextField();
        readyButton = new javax.swing.JButton();
        sentButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        menuItemRecipeField = new javax.swing.JTextField();
        addToOrderButton = new javax.swing.JButton();
        deleteFromOrderButton = new javax.swing.JButton();
        inputOrderIDField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        JTableOrders = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        menuItemNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        menuItemPriceField = new javax.swing.JTextField();
        menuItemPreptimeField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addMenuItemButton = new javax.swing.JButton();
        searchMenuItemButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        autoRefreshCheck = new javax.swing.JCheckBox();
        fullscreenCheck = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel7.setText("Ingelogd als :");

        signedInAsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signedInAsFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("Gebruikersnaam  ");

        jLabel9.setText(" Wachtwoord");

        passwordEntryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordEntryFieldActionPerformed(evt);
            }
        });

        loginButton.setText("Inloggen");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Uitloggen");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(53, 53, 53)
                        .addComponent(signedInAsField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameEntryField, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(passwordEntryField)))
                    .addComponent(loginButton)
                    .addComponent(logoutButton))
                .addContainerGap(484, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(signedInAsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutButton)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(usernameEntryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(passwordEntryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginButton)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Login", jPanel2);

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        jLabel12.setText("ID");

        readyIdTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readyIdTFActionPerformed(evt);
            }
        });

        readyButton.setText("Klaar");
        readyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readyButtonActionPerformed(evt);
            }
        });

        sentButton.setText("Verstuurd");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(readyButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(refreshButton)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(readyIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sentButton)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refreshButton)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(readyIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(readyButton)
                .addGap(18, 18, 18)
                .addComponent(sentButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setText("Gerecht");

        addToOrderButton.setText("Voeg gerecht toe aan bestelling");

        deleteFromOrderButton.setText("Verwijder uit gerecht uit bestelling");

        jLabel10.setText("ID");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inputOrderIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(menuItemRecipeField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteFromOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(addToOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteFromOrderButton)
                    .addComponent(inputOrderIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(menuItemRecipeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addToOrderButton))
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        JTableOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
            },
            new String [] {
                "ID", "Gerechten", "Gerecht type", "Status"
            }
        ));
        jScrollPane4.setViewportView(JTableOrders);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("Bestelling Lijst", jPanel4);

        jLabel3.setText("Naam gerecht");

        menuItemNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNameFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Recept");

        jLabel5.setText("Prijs");

        menuItemPreptimeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPreptimeFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Bereidingstijd");

        addMenuItemButton.setText("Gerecht toevoegen");
        addMenuItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMenuItemButtonActionPerformed(evt);
            }
        });

        searchMenuItemButton.setText("Zoek gerecht (op naam)");
        searchMenuItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMenuItemButtonActionPerformed(evt);
            }
        });

        outputArea.setColumns(20);
        outputArea.setRows(5);
        jScrollPane1.setViewportView(outputArea);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(menuItemPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(menuItemNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(menuItemPreptimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(72, 72, 72)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addMenuItemButton)
                        .addGap(18, 18, 18)
                        .addComponent(searchMenuItemButton)))
                .addContainerGap(389, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(menuItemPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuItemNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItemPreptimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addMenuItemButton)
                    .addComponent(searchMenuItemButton))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nieuw gerecht invoeren", jPanel5);

        jLabel1.setText("Auto refresh ");

        autoRefreshCheck.setText("jCheckBox1");
        autoRefreshCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoRefreshCheckActionPerformed(evt);
            }
        });

        fullscreenCheck.setText("jCheckBox2");

        jLabel2.setText("Fullscreen");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fullscreenCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(autoRefreshCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(683, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(autoRefreshCheck))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullscreenCheck)
                    .addComponent(jLabel2))
                .addContainerGap(308, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Opties", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void autoRefreshCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoRefreshCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autoRefreshCheckActionPerformed

    private void menuItemNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemNameFieldActionPerformed

    private void menuItemPreptimeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPreptimeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemPreptimeFieldActionPerformed

    private void addMenuItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMenuItemButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addMenuItemButtonActionPerformed

    private void searchMenuItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMenuItemButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchMenuItemButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        doOrdersTableRefresh();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void signedInAsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signedInAsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signedInAsFieldActionPerformed

    private void passwordEntryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordEntryFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordEntryFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void readyIdTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readyIdTFActionPerformed
        // TODO add your handling code here:
        readyButton.addActionListener(a1 -> doReadyButtonPress());
    }//GEN-LAST:event_readyIdTFActionPerformed

    private void readyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_readyButtonActionPerformed

      class addMenuItemButtonActionPerformed implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            
            String naam = menuItemNameField.getText();
            //inputVakNr.getText();
            try
            {
                double prijs = Double.parseDouble(menuItemPriceField.getText());
                int tijd = Integer.parseInt(menuItemPreptimeField.getText());
                String gerecht = menuItemRecipeField.getText(); 

                consumptionAdminManager.saveConsumption(naam, prijs, gerecht, tijd);

                setTextfieldsBlank();
            }
            catch(NumberFormatException nfe)
            {
                System.out.printf("exception");
                setTextfieldsBlank();
            }
            

        }
    }
      
       class searchMenuItemButtonActionPerformed implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            
            String nameInput = menuItemNameField.getText();
            Consumption g = consumptionAdminManager.findConsumption(nameInput);
            
            if (g == null)
            {
                setTextfieldsBlank();
                setTextAreaBlank();
            }
            else
            {
                setTextAreaBlank();
                String txt = String.format(" ConsumptionName: %s,\n ConsumptionID: %d,\n ConsumptionPrice: %f,\n"
                        + " ConsumptionTime: %d,\n Description: %s\n", g.getNaam(), g.getGerechtID(),
                        g.getPrice(), g.getPreparationTime(), g.getRecipe());
                
                appendToOutputTextArea(txt);
            
            }
        }
    }
       
          public void appendToOutputTextArea(String txt)
     {
         outputArea.setText(outputArea.getText() + txt);
     }
    public void setTextAreaBlank(){
    
        outputArea.setText("");
    }
    public void setTextfieldsBlank() {
        setTextFieldsText("","","","");
    }

    public void setTextFieldsText(String Naam, String Nr, String Prijs, 
            String Tijd) {
        menuItemNameField.setText(Naam);
        menuItemRecipeField.setText(Nr);
        menuItemPriceField.setText(Prijs);
        menuItemPreptimeField.setText(Tijd);
    }
     class RefreshHandler implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            
            
      //      orderAdminManager.findOrder();
            
            

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableOrders;
    private javax.swing.JButton addMenuItemButton;
    private javax.swing.JButton addToOrderButton;
    private javax.swing.JCheckBox autoRefreshCheck;
    private javax.swing.JButton deleteFromOrderButton;
    private javax.swing.JCheckBox fullscreenCheck;
    private javax.swing.JTextField inputOrderIDField;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField menuItemNameField;
    private javax.swing.JTextField menuItemPreptimeField;
    private javax.swing.JTextField menuItemPriceField;
    private javax.swing.JTextField menuItemRecipeField;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JPasswordField passwordEntryField;
    private javax.swing.JButton readyButton;
    private javax.swing.JTextField readyIdTF;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton searchMenuItemButton;
    private javax.swing.JButton sentButton;
    private javax.swing.JTextField signedInAsField;
    private javax.swing.JTextField usernameEntryField;
    // End of variables declaration//GEN-END:variables
 private OrderAdminManager orderAdminManager = new OrderAdminManager();
     private ConsumptionAdminManager consumptionAdminManager = new ConsumptionAdminManager();
     private OrderDAO orderDAO = new OrderDAO();
}
