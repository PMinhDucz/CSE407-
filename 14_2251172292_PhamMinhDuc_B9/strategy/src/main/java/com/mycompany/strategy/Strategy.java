/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.strategy;

/**
 *
 * @author ADMIN
 */
// Client - Main Class for Demonstration
public class Strategy {
    public static void main(String[] args) {
        // Create different checking strategies
        InventoryCheckingStrategy manualStrategy = new ManualCountStrategy();
        InventoryCheckingStrategy barcodeStrategy = new BarcodeScanStrategy();
        InventoryCheckingStrategy cycleStrategy = new CycleCountStrategy();

        WarehouseManager mainWarehouse = new WarehouseManager("Main Warehouse", barcodeStrategy);
        mainWarehouse.performInventoryCheck();

        System.out.println("\n--- Year-end audit approaching ---");
        mainWarehouse.setCheckingStrategy(manualStrategy);
        mainWarehouse.performInventoryCheck();

        System.out.println("\n--- Regular operational checks ---");
        mainWarehouse.setCheckingStrategy(cycleStrategy);
        mainWarehouse.performInventoryCheck();
        mainWarehouse.performInventoryCheck(); // Perform another cycle count

        System.out.println("\n--- Managing a smaller, high-value goods warehouse ---");
        WarehouseManager secureStorage = new WarehouseManager("Secure Storage Unit", barcodeStrategy);
        secureStorage.performInventoryCheck();

        System.out.println("\n--- Special audit for Secure Storage ---");
        secureStorage.setCheckingStrategy(manualStrategy);
        secureStorage.performInventoryCheck();
    }
}
