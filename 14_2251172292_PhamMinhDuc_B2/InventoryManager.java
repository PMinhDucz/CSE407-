/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlkh;

/**
 *
 * @author ADMIN
 */
public class InventoryManager {


    public void updateInventory(Product product, int amount) {
        if (product == null) {
            System.err.println("Loi: Khong the cap nhat ton kho cho san pham null."); 
            return;
        }

        int currentQuantity = product.getQuantity();
        int newQuantity = currentQuantity + amount;

        product.setQuantity(newQuantity);
        System.out.println("Ton kho da duoc cap nhat cho san pham: " + product.getProductId() +
                           ". So luong cu: " + currentQuantity +
                           ", So luong thay doi: " + amount +
                           ", So luong moi: " + newQuantity); 
    }
}