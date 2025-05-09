/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlkh;

/**
 *
 * @author ADMIN
 */
public class InventoryLogger {


    public void logInventoryChange(Product product) {
        if (product == null) {
            System.err.println("Loi Log: Khong the ghi log thong tin cho san pham null."); 
            return;
        }
        System.out.println("LOG: San pham [" + product.getProductId() +
                           "] co so luong: [" + product.getQuantity() + "]"); 
    }
}