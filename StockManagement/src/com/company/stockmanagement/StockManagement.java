/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.company.stockmanagement;

import com.company.stockmanagement.ui.DashboardClient;

/**
 * Main class for initializing and launching the Stock Management application.
 * It sets up the user and opens the DashboardClient interface.
 */
public class StockManagement {

    /**
     * The main entry point of the Stock Management application.
     * It initializes the user and opens the dashboard interface.
     *
     * @param args command-line arguments.
     */
    public static void main(String[] args) {
        // Set up the current user before launching the interface
        User usuario = new User("1", "Gabriel ");

        java.awt.EventQueue.invokeLater(() -> {
            // Initialize the dashboard and pass the user object
            new DashboardClient(usuario).setVisible(true);
        });
    }
}