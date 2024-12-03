/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.stockmanagement;

public class StockValue {

    // Instance variables for storing stock information and calculated values
    private String symbol;
    private double purchasePrice;
    private int quantity;
    private String purchaseDate;
    private double currentPrice;
    private double unitGain;
    private double unitPercentage;
    private double totalBalance;
    private double totalGain;
    private String currentDate;

    /**
     * Constructor for StockValue.
     * Initializes the stock record with the given symbol, purchase price,
     * quantity, and purchase date.
     *
     * @param symbol the stock symbol.
     * @param purchasePrice the price at which the stock was purchased.
     * @param quantity the number of stocks purchased.
     * @param purchaseDate the date the stock was purchased.
     */
    public StockValue(String symbol, double purchasePrice, int quantity, String purchaseDate) {
        this.symbol = symbol;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.purchaseDate = purchaseDate;
    }

    // Getters for stock information

    /**
     * Gets the stock symbol.
     *
     * @return the stock symbol.
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Gets the purchase price of the stock.
     *
     * @return the purchase price.
     */
    public double getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * Gets the quantity of stocks.
     *
     * @return the quantity of stocks.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Gets the purchase date of the stock.
     *
     * @return the purchase date.
     */
    public String getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Gets the current price of the stock.
     *
     * @return the current price of the stock.
     */
    public double getCurrentPrice() {
        return currentPrice;
    }

    /**
     * Gets the unit gain of the stock.
     *
     * @return the unit gain of the stock.
     */
    public double getUnitGain() {
        return unitGain;
    }

    /**
     * Gets the unit percentage of the stock.
     *
     * @return the unit percentage of the stock.
     */
    public double getUnitPercentage() {
        return unitPercentage;
    }

    /**
     * Gets the total balance of the stock (current price * quantity).
     *
     * @return the total balance of the stock.
     */
    public double getTotalBalance() {
        return totalBalance;
    }

    /**
     * Gets the total gain from the stock (total balance - purchase cost).
     *
     * @return the total gain from the stock.
     */
    public double getTotalGain() {
        return totalGain;
    }

    /**
     * Gets the current date when the stock values were calculated.
     *
     * @return the current date.
     */
    public String getCurrentDate(){
        return currentDate;
    }

    /**
     * Sets the calculated stock values such as current price, unit gain, unit
     * percentage, total balance, total gain, and current date.
     *
     * @param currentPrice the current price of the stock.
     * @param unitGain the gain per unit of stock.
     * @param unitPercentage the gain percentage per unit.
     * @param totalBalance the total balance of the stock.
     * @param totalGain the total gain from the stock.
     * @param currentDate the current date when the values were calculated.
     */
    public void setCalculatedValues(double currentPrice, double unitGain, double unitPercentage, double totalBalance, double totalGain, String currentDate) {
        this.currentPrice = currentPrice;
        this.unitGain = unitGain;
        this.unitPercentage = unitPercentage;
        this.totalBalance = totalBalance;
        this.totalGain = totalGain;
        this.currentDate = currentDate;
    }
}