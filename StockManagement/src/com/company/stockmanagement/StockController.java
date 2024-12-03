/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.stockmanagement;

import com.company.stockmanagement.ui.DashboardClient;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Said
 */
/**
 * Controller class for managing stock data processing and interactions with the
 * view.
 */
public class StockController {

    // Instance variables for managing the view, API, and user data
    private DashboardClient view;
    private AlphaVantageAPI api;
    private User user;

    /**
     * Constructor for StockController.
     *
     * @param view the view interface (DashboardClient) to update the UI.
     * @param apiKey the API key for accessing AlphaVantage API.
     */
    public StockController(DashboardClient view, String apiKey) {
        this.view = view;
        this.api = new AlphaVantageAPI(apiKey);  // Create API instance with the provided key
        this.user = user;
    }

    /**
     * Processes stock data and updates the view with calculated stock values.
     * This method calls the API to get the current stock price, calculates
     * stock values, and updates the view with the results.
     *
     * @param symbol the stock symbol to retrieve data for.
     * @param purchasePrice the price at which the stock was purchased.
     * @param quantity the number of stocks purchased.
     * @param purchaseDate the date the stock was purchased.
     */
    public void processStockData(String symbol, double purchasePrice, int quantity, String purchaseDate, User usuario) {
        try {
            // Get the current price of the stock using the API
            double currentPrice = api.getCurrentPrice(symbol);

            // Calculate stock values using calculateStockValues method
            StockValue record = calculateStockValues(symbol, purchasePrice, quantity, currentPrice, purchaseDate);

            // Add the record to the user's stock records
            usuario.addStockRecord(record);

            // Update the view (table) with the calculated results
            view.updateTable(symbol, quantity, purchaseDate, purchasePrice, currentPrice, record);
        } catch (Exception e) {
            view.showError("Error: " + e.getMessage());
        }
    }

    /**
     * Handles the save operation by validating inputs and processing data. This
     * method validates input fields and processes stock data if valid.
     *
     * @param symbol the stock symbol.
     * @param purchasePriceText the purchase price input as text.
     * @param quantityText the quantity input as text.
     * @param purchaseDateText the purchase date input as text.
     */
    public void handleSave(String symbol, String purchasePriceText, String quantityText, String purchaseDateText, User usuario) {
        // Create a StringBuilder to accumulate errors
        StringBuilder errors = new StringBuilder();

        // Validate the input values and accumulate errors if any
        double purchasePrice = StockValidator.validatePositiveDecimal(purchasePriceText, errors);
        int quantity = StockValidator.validatePositiveInteger(quantityText, errors);
        String purchaseDate = StockValidator.validateDate(purchaseDateText, errors);

        // If there are errors, show the error message
        if (errors.length() > 0) {
            view.showError("Errors found:\n" + errors.toString());
        } else {
            // If all values are valid, process the stock data
            processStockData(symbol, purchasePrice, quantity, purchaseDate, usuario);
        }
    }

    /**
     * Calculates the stock values based on purchase price, current price, and
     * quantity. This method computes unit gain, unit percentage, total balance,
     * and total gain based on the given parameters and returns a StockValue
     * object.
     *
     * @param symbol the stock symbol.
     * @param purchasePrice the price at which the stock was purchased.
     * @param quantity the number of stocks.
     * @param currentPrice the current price of the stock.
     * @param purchaseDate the purchase date.
     * @return a StockValue object containing the calculated stock values.
     */
    public static StockValue calculateStockValues(String symbol, double purchasePrice, int quantity, double currentPrice, String purchaseDate) {
        // Calculate the stock values based on purchase and current prices
        double unitGain = currentPrice - purchasePrice;
        double unitPercentage = (unitGain / purchasePrice) * 100;
        double totalBalance = currentPrice * quantity;
        double totalGain = totalBalance - (purchasePrice * quantity);

        // Obtain the current date in dd/MM/yyyy format
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String currentDate = dateFormat.format(new Date());

        // Create the StockValue object with calculated values and the current date
        StockValue record = new StockValue(symbol, purchasePrice, quantity, purchaseDate);
        record.setCalculatedValues(currentPrice, unitGain, unitPercentage, totalBalance, totalGain, currentDate);

        return record;
    }
}
