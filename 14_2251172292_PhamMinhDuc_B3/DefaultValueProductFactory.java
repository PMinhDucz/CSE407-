/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlkh;

/**
 *
 * @author ADMIN
 */
public class DefaultValueProductFactory extends ProductFactory {
    private String defaultId;
    private int defaultQuantity;

    public DefaultValueProductFactory(String defaultId, int defaultQuantity) {
        if (defaultId == null || defaultId.trim().isEmpty()) {
            throw new IllegalArgumentException("ID mac dinh khong duoc de trong.");
        }
        // Nếu bạn muốn kiểm tra defaultQuantity ở đây, hãy làm:
        // if (defaultQuantity < 0) {
        //     throw new IllegalArgumentException("So luong mac dinh khong duoc am.");
        // }
        this.defaultId = defaultId;
        this.defaultQuantity = defaultQuantity;
    }

    @Override
    public Product createProduct() {
        System.out.println("--- TAO SAN PHAM VOI GIA TRI MAC DINH ---");
        try {
            return new Product(defaultId, defaultQuantity);
        } catch (IllegalArgumentException e) {
            System.err.println("Loi khi tao san pham mac dinh: " + e.getMessage());
            return null;
        }
    }
}