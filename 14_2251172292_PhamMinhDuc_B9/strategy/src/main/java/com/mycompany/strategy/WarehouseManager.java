/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author ADMIN
 */
// Context Class
class WarehouseManager {
    private String warehouseName;
    private InventoryCheckingStrategy currentCheckingStrategy; // Reference to the current strategy

    public WarehouseManager(String name, InventoryCheckingStrategy initialStrategy) {
        this.warehouseName = name;
        this.currentCheckingStrategy = initialStrategy;
        System.out.println("Warehouse '" + name + "' created. Initial checking strategy: " + initialStrategy.getClass().getSimpleName());
    }

    public void setCheckingStrategy(InventoryCheckingStrategy strategy) {
        this.currentCheckingStrategy = strategy;
        System.out.println("Warehouse '" + warehouseName + "' - Checking strategy changed to: " + strategy.getClass().getSimpleName());
    }

    public void performInventoryCheck() {
        System.out.println("\nInitiating inventory check for warehouse: " + warehouseName);
        String result = this.currentCheckingStrategy.checkInventory(this.warehouseName);
        System.out.println("  -> Strategy Execution Result: " + result);
    }

    public String getWarehouseName() {
        return warehouseName;
    }
}