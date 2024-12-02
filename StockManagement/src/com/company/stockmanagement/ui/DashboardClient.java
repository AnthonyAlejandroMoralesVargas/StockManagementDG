/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.company.stockmanagement.ui;

import com.company.stockmanagement.AlphaVantageAPI;
import com.company.stockmanagement.StockController;
import com.company.stockmanagement.StockValue;
import com.company.stockmanagement.User;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * DashboardClient class that manages the user interface for displaying and
 * managing stock data. It interacts with the StockController and
 * AlphaVantageAPI to process and update stock information.
 *
 * @author Said
 */
public class DashboardClient extends javax.swing.JFrame {
    private StockController controller;
    private AlphaVantageAPI api;
    private DefaultTableModel model;
    private static final String API_KEY = "70QX4UDI1NSM2LKD";
    private User user;


    public DashboardClient(User usuario) {
        initComponents();
        this.user = usuario;
        controller = new StockController(this, API_KEY);
        this.api = new AlphaVantageAPI(API_KEY);
        model = (DefaultTableModel) jTable1.getModel();
        model.insertRow(0, new Object[]{"AMZN", 1, "26/11/2024", 207.82, getCurrentDate(), 205.79, 5.79, 2.895, 207.86, 7.86});
        model.insertRow(1, new Object[]{"AAPL", 1, "26/11/2024", 235.10, getCurrentDate(), 234.80, 7.86, 3.93, 207.86, 7.86});
        model.insertRow(2, new Object[]{"MSFT", 1, "26/11/2024", 427.67, getCurrentDate(), 422.91, 7.86, 3.93, 207.86, 7.86});
    }

    private String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(new Date());
    }


    public void updateTable(String symbol, int quantity, String purchaseDate, double purchasePrice,
            double currentPrice, StockValue stockValues) {

        String currentDate = getCurrentDate();
        Object[] newRow = new Object[]{
            symbol,
            quantity,
            purchaseDate,
            purchasePrice,
            currentDate,
            currentPrice,
            stockValues.getUnitGain(),
            stockValues.getUnitPercentage(),
            stockValues.getTotalBalance(),
            stockValues.getTotalGain()
        };

        model.insertRow(0, newRow);
        jTable1.setModel(model);
        javax.swing.JOptionPane.showMessageDialog(this, "Successfully saved");
    }

    public void showError(String message) {
        javax.swing.JOptionPane.showMessageDialog(this, message);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        txtStockManager = new javax.swing.JLabel();
        actionInfo = new javax.swing.JPanel();
        txtWelcome = new javax.swing.JLabel();
        txtRegister = new javax.swing.JLabel();
        txtSymnol = new javax.swing.JLabel();
        comboBoxSymbol = new javax.swing.JComboBox<>();
        txtPurchasePrice = new javax.swing.JLabel();
        txtFPurchasePrice = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JLabel();
        txtFQuantity = new javax.swing.JTextField();
        txtPurchaseDate = new javax.swing.JLabel();
        txtFPurchaseDate = new javax.swing.JTextField();
        btnSaveAction = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 102, 255));

        panelHeader.setBackground(new java.awt.Color(255, 255, 255));

        txtStockManager.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        txtStockManager.setText("STOCK MANAGER");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtStockManager, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(txtStockManager, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        actionInfo.setBackground(new java.awt.Color(255, 255, 255));

        txtWelcome.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtWelcome.setText("Welcome");

        txtRegister.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtRegister.setText("Stock register");

        txtSymnol.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtSymnol.setText("Symbol:");

        comboBoxSymbol.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        comboBoxSymbol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AAPL", "AMZN", "MSFT" }));
        comboBoxSymbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSymbolActionPerformed(evt);
            }
        });

        txtPurchasePrice.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtPurchasePrice.setText("Purchase price:");

        txtFPurchasePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFPurchasePriceActionPerformed(evt);
            }
        });

        txtQuantity.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtQuantity.setText("Quantity:");

        txtPurchaseDate.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtPurchaseDate.setText("Purchase date:");

        txtFPurchaseDate.setText("dd/mm/yyyy");

        btnSaveAction.setBackground(new java.awt.Color(0, 153, 255));
        btnSaveAction.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnSaveAction.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveAction.setText("Save");
        btnSaveAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("My Stock");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Stock Name", "Quantity", "Purchase Date", "Purchase Price", "Current Date", "Current Price", "Unit Gain", "Unit Percentage", "Total Balance", "Total Gain"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout actionInfoLayout = new javax.swing.GroupLayout(actionInfo);
        actionInfo.setLayout(actionInfoLayout);
        actionInfoLayout.setHorizontalGroup(
            actionInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionInfoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(actionInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionInfoLayout.createSequentialGroup()
                        .addGroup(actionInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSaveAction, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRegister)
                            .addComponent(txtWelcome)
                            .addGroup(actionInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(actionInfoLayout.createSequentialGroup()
                                    .addComponent(txtPurchasePrice)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(actionInfoLayout.createSequentialGroup()
                                    .addComponent(txtSymnol)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBoxSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(actionInfoLayout.createSequentialGroup()
                                    .addGroup(actionInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(actionInfoLayout.createSequentialGroup()
                                            .addComponent(txtQuantity)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionInfoLayout.createSequentialGroup()
                                            .addComponent(txtPurchaseDate)
                                            .addGap(48, 48, 48)))
                                    .addGroup(actionInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtFQuantity)
                                        .addComponent(txtFPurchaseDate, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(actionInfoLayout.createSequentialGroup()
                        .addGroup(actionInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(actionInfoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(785, 785, 785)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 44, Short.MAX_VALUE))))
        );
        actionInfoLayout.setVerticalGroup(
            actionInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionInfoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtWelcome)
                .addGap(18, 18, 18)
                .addComponent(txtRegister)
                .addGap(18, 18, 18)
                .addGroup(actionInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSymnol)
                    .addComponent(comboBoxSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(actionInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPurchasePrice)
                    .addComponent(txtFPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(actionInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantity)
                    .addComponent(txtFQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(actionInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPurchaseDate)
                    .addComponent(txtFPurchaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSaveAction)
                .addGap(26, 26, 26)
                .addGroup(actionInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(actionInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actionInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFPurchasePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFPurchasePriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFPurchasePriceActionPerformed

   
    private void btnSaveActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionActionPerformed
        String symbol = comboBoxSymbol.getSelectedItem().toString();
        String purchasePriceText = txtFPurchasePrice.getText();
        String quantityText = txtFQuantity.getText();
        String purchaseDateText = txtFPurchaseDate.getText();

        controller.handleSave(symbol, purchasePriceText, quantityText, purchaseDateText, user);
    }//GEN-LAST:event_btnSaveActionActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StockDataUpdater updater = new StockDataUpdater(model);
        updater.processStockData(getCurrentDate(), api);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboBoxSymbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSymbolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSymbolActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionInfo;
    private javax.swing.JButton btnSaveAction;
    private javax.swing.JComboBox<String> comboBoxSymbol;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTextField txtFPurchaseDate;
    private javax.swing.JTextField txtFPurchasePrice;
    private javax.swing.JTextField txtFQuantity;
    private javax.swing.JLabel txtPurchaseDate;
    private javax.swing.JLabel txtPurchasePrice;
    private javax.swing.JLabel txtQuantity;
    private javax.swing.JLabel txtRegister;
    private javax.swing.JLabel txtStockManager;
    private javax.swing.JLabel txtSymnol;
    private javax.swing.JLabel txtWelcome;
    // End of variables declaration//GEN-END:variables

}
