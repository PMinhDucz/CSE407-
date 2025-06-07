/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author ADMIN
 */
// Strategy Interface
interface InventoryCheckingStrategy {
    /**
     * Performs the inventory check for a given warehouse.
     * @param warehouseName The name of the warehouse being checked.
     * @return A string summarizing the result or status of the check.
     */
    String checkInventory(String warehouseName);
}