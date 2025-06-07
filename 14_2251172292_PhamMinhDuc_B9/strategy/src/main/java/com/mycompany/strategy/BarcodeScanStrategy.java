/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author ADMIN
 */
// Concrete Strategy 2
class BarcodeScanStrategy implements InventoryCheckingStrategy {
    @Override
    public String checkInventory(String warehouseName) {
        // Simulate barcode scanning process
        System.out.println("Performing BARCODE SCAN inventory check for warehouse: " + warehouseName);
        System.out.println("  - Staff are using handheld scanners to scan item barcodes.");
        System.out.println("  - Data is being updated in real-time to the inventory system.");
        return "Barcode scan for '" + warehouseName + "' completed. Inventory levels updated.";
    }
}