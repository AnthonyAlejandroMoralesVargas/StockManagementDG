/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.stockmanagement.ui;

import com.company.stockmanagement.AlphaVantageAPI;
import com.company.stockmanagement.StockController;
import com.company.stockmanagement.StockValue;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saidl
 */
public class StockDataUpdater {

    // Instance variable to hold the table model
    private final DefaultTableModel model;


    public StockDataUpdater(DefaultTableModel model) {
        this.model = model;
    }


    public void updateTableRow(int rowIndex, String symbol, int quantity, String purchaseDate, double purchasePrice, double currentPrice, StockValue stockValues, String currentDate) {
        model.setValueAt(symbol, rowIndex, 0);  // Symbol
        model.setValueAt(quantity, rowIndex, 1);  // Quantity
        model.setValueAt(purchaseDate, rowIndex, 2);  // Purchase Date
        model.setValueAt(purchasePrice, rowIndex, 3);  // Purchase Price
        model.setValueAt(currentDate, rowIndex, 4);  // Current Date
        model.setValueAt(currentPrice, rowIndex, 5);  // Current Price
        model.setValueAt(stockValues.getUnitGain(), rowIndex, 6);  // Unit Gain
        model.setValueAt(stockValues.getUnitPercentage(), rowIndex, 7);  // Unit Percentage
        model.setValueAt(stockValues.getTotalBalance(), rowIndex, 8);  // Total Balance
        model.setValueAt(stockValues.getTotalGain(), rowIndex, 9);  // Total Gain
    }


    public void processStockData(String currentDate, AlphaVantageAPI api) {
        // Iterate through all rows in the table and update each one with stock data
        for (int i = 0; i < model.getRowCount(); i++) {
            String symbol = model.getValueAt(i, 0) != null ? model.getValueAt(i, 0).toString() : "";
            if (symbol.isEmpty()) {
                continue;
            }

            double purchasePrice = parseDouble(model.getValueAt(i, 3));
            if (purchasePrice <= 0) {
                continue;
            }

            int quantity = parseInt(model.getValueAt(i, 1));
            if (quantity <= 0) {
                continue;
            }

            String purchaseDate = model.getValueAt(i, 2) != null ? model.getValueAt(i, 2).toString() : "";
            if (purchaseDate.isEmpty()) {
                continue;
            }

            // Fetch current stock price and calculate stock values
            double currentPrice = api.getCurrentPrice(symbol);
            StockValue stockValues = StockController.calculateStockValues(symbol, purchasePrice, quantity, currentPrice, purchaseDate);

            // Update the table with the calculated values
            updateTableRow(i, symbol, quantity, purchaseDate, purchasePrice, currentPrice, stockValues, currentDate);
        }
    }


    private double parseDouble(Object value) {
        try {
            return Double.parseDouble(value.toString());
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }


    private int parseInt(Object value) {
        try {
            return Integer.parseInt(value.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}
