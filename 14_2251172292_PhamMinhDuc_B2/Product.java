/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlkh;

/**
 *
 * @author ADMIN
 */
public class Product {
    private String productId;
    private int quantity;

    
    public Product(String productId, int initialQuantity) {
        if (productId == null || productId.trim().isEmpty()) {
            throw new IllegalArgumentException("Ma san pham khong duoc de trong.");
        }
        if (initialQuantity < 0) {
            throw new IllegalArgumentException("So luong ban dau khong duoc am.");
        }
        this.productId = productId;
        this.quantity = initialQuantity;
    }


    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Canh bao: So luong dang duoc dat thanh gia tri am cho san pham " + productId); 
        }
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
               "productId='" + productId + '\'' +
               ", quantity=" + quantity +
               '}';
    }
}