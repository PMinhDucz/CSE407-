/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author ADMIN
 */
// Concrete Strategy 1
class ManualCountStrategy implements InventoryCheckingStrategy {
    @Override
    public String checkInventory(String warehouseName) {
        // Simulate manual counting process
        System.out.println("Performing MANUAL inventory count for warehouse: " + warehouseName);
        System.out.println("  - Staff are physically counting items on shelves...");
        System.out.println("  - This might take several hours or days.");
        // In a real system, this would involve complex logic, data recording, etc.
        return "Manual count for '" + warehouseName + "' initiated. Report will be available upon completion.";
    }
}