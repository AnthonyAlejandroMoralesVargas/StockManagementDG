package com.company.stockmanagement;

/**
 * Represents the values of a stock, including total cost, current value,
 * gains/losses, percentage of gain/loss, and total balance. Provides methods to
 * access and modify these values.
 *
 * @author Gabriel
 */
public class StockValue {

    /**
     * Total cost of the stock. 
     */
    private double totalCost;

    /**
     * Current value of the stock.
     */
    private double currentValue;

    /**
     * Gain per unit of the stock.
     */
    private double unitGain;

    /**
     * Percentage gain per unit of the stock.
     */
    private double unitPercentage;

    /**
     * Total balance of the stock investment.
     */
    private double totalBalance;

    /**
     * Total gain from the stock.
     */
    private double totalGain;

    /**
     * Constructor for the StockValue class.
     *
     * @param totalCost the total cost of the stock.
     * @param currentValue the current value of the stock.
     * @param unitGain the gain per unit of the stock.
     * @param unitPercentage the percentage gain per unit of the stock.
     * @param totalBalance the total balance of the stock investment.
     * @param totalGain the total gain from the stock.
     */
    public StockValue(double totalCost, double currentValue, double unitGain, double unitPercentage, double totalBalance, double totalGain) {
        this.totalCost = totalCost;
        this.currentValue = currentValue;
        this.unitGain = unitGain;
        this.unitPercentage = unitPercentage;
        this.totalBalance = totalBalance;
        this.totalGain = totalGain;
    }

    /**
     * Gets the total cost of the stock.
     *
     * @return the total cost.
     */
    public double getTotalCost() {
        return totalCost;
    }

    /**
     * Gets the current value of the stock.
     *
     * @return the current value.
     */
    public double getCurrentValue() {
        return currentValue;
    }

    /**
     * Gets the gain per unit of the stock.
     *
     * @return the gain per unit.
     */
    public double getUnitGain() {
        return unitGain;
    }

    /**
     * Gets the percentage gain per unit of the stock.
     *
     * @return the percentage gain per unit.
     */
    public double getUnitPercentage() {
        return unitPercentage;
    }

    /**
     * Gets the total balance of the stock investment.
     *
     * @return the total balance.
     */
    public double getTotalBalance() {
        return totalBalance;
    }

    /**
     * Gets the total gain from the stock.
     *
     * @return the total gain.
     */
    public double getTotalGain() {
        return totalGain;
    }

    /**
     * Sets the total cost of the stock.
     *
     * @param totalCost the total cost to set.
     */
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * Sets the current value of the stock.
     *
     * @param currentValue the current value to set.
     */
    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    /**
     * Sets the gain per unit of the stock.
     *
     * @param unitGain the gain per unit to set.
     */
    public void setUnitGain(double unitGain) {
        this.unitGain = unitGain;
    }

    /**
     * Sets the percentage gain per unit of the stock.
     *
     * @param unitPercentage the percentage gain per unit to set.
     */
    public void setUnitPercentage(double unitPercentage) {
        this.unitPercentage = unitPercentage;
    }

    /**
     * Sets the total balance of the stock investment.
     *
     * @param totalBalance the total balance to set.
     */
    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    /**
     * Sets the total gain from the stock.
     *
     * @param totalGain the total gain to set.
     */
    public void setTotalGain(double totalGain) {
        this.totalGain = totalGain;
    }
    
}
