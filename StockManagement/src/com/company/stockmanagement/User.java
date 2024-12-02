package com.company.stockmanagement;

import java.util.ArrayList;
import java.util.List;


public class User {
    
    private String id;  
    private String nombre;  
    private List<StockValue> stockRecords;


    public User(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.stockRecords = new ArrayList<>();
    }


    public String getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }


    public List<StockValue> getStockRecords() {
        return stockRecords;
    }


    public void addStockRecord(StockValue record) {
        this.stockRecords.add(record);
    }
}