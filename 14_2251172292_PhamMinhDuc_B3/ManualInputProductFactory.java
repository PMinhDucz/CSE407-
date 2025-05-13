/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlkh;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;

public class ManualInputProductFactory extends ProductFactory {
    @Override
    public Product createProduct() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("--- TAO SAN PHAM THU CONG ---");
        String productId = "";
        int initialQuantity = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Nhap Ma San Pham: ");
            productId = scanner.nextLine();
            if (productId == null || productId.trim().isEmpty()) {
                System.out.println("Ma san pham khong duoc de trong. Vui long nhap lai.");
            } else {
                validInput = true;
            }
        }

        validInput = false;
        while (!validInput) {
            System.out.print("Nhap So Luong Ban Dau: ");
            String qtyInput = scanner.nextLine();
            try {
                initialQuantity = Integer.parseInt(qtyInput);
                if (initialQuantity < 0) { 
                     System.out.println("So luong ban dau khong duoc am. Vui long nhap lai.");
                } else {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("So luong khong hop le. Vui long nhap mot so nguyen.");
            }
        }
        try {
            return new Product(productId, initialQuantity);
        } catch (IllegalArgumentException e) {
            System.err.println("Loi khi tao san pham: " + e.getMessage());
            return null;
        }
    }
}