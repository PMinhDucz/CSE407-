/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author ADMIN
 */
// Concrete Strategy 3
class CycleCountStrategy implements InventoryCheckingStrategy {
    @Override
    public String checkInventory(String warehouseName) {
        // Simulate cycle counting process
        System.out.println("Performing CYCLE COUNT inventory check for warehouse: " + warehouseName);
        System.out.println("  - Checking a specific subset of items/locations today as per schedule.");
        System.out.println("  - Aims to improve overall inventory accuracy over time without full shutdown.");
        return "Cycle count for '" + warehouseName + "' for today's designated items completed.";
    }
}