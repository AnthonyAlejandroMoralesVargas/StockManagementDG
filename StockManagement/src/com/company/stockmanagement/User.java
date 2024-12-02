package com.company.stockmanagement;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a user in the Stock Management application.
 * Each user has an ID, name, and a list of stock records.
 */
public class User {
    
    private String id;  
    private String nombre;  
    private List<StockValue> stockRecords;

    /**
     * Constructor to initialize the user with an ID and name.
     * Initializes an empty list for stock records.
     *
     * @param id the unique identifier for the user
     * @param nombre the name of the user
     */
    public User(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.stockRecords = new ArrayList<>();
    }

    /**
     * Returns the user's unique identifier.
     *
     * @return the user's ID
     */
    public String getId() {
        return id;
    }

    /**
     * Returns the name of the user.
     *
     * @return the user's name
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Returns the list of stock records associated with the user.
     *
     * @return the list of stock records
     */
    public List<StockValue> getStockRecords() {
        return stockRecords;
    }

    /**
     * Adds a stock record to the user's list of stock records.
     *
     * @param record the StockValue object to be added
     */
    public void addStockRecord(StockValue record) {
        this.stockRecords.add(record);
    }
}