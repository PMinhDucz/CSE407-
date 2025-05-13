/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlkh;

/**
 *
 * @author ADMIN
 */
public abstract class ProductFactory {

    public abstract Product createProduct();

    public void announceCreation(Product product) {
        if (product != null) {
            System.out.println("THONG BAO: San pham '" + product.getProductId() +
                               "' da duoc tao voi so luong ban dau " + product.getQuantity() + ".");
        } else {
            System.out.println("THONG BAO: Khong the tao san pham.");
        }
    }
}