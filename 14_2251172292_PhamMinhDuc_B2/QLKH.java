/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.qlkh;

/**
 *
 * @author ADMIN
 */
public class QLKH {
    public static void main(String[] args) {
        System.out.println("--- Quan ly Kho hang Demo ---"); 

        InventoryManager manager = new InventoryManager();
        InventoryLogger logger = new InventoryLogger();

        System.out.println("\n--- Tao san pham ---"); 
        Product laptop = null;
        try {
            laptop = new Product("LAPTOP001", 10);
            System.out.println("San pham da tao: " + laptop.getProductId() + ", So luong ban dau: " + laptop.getQuantity()); 
            logger.logInventoryChange(laptop);
        } catch (IllegalArgumentException e) {
            System.err.println("Loi khi tao san pham: " + e.getMessage()); 
            return;
        }


        System.out.println("\n--- Cap nhat so luong (Nhap hang) ---"); 
        manager.updateInventory(laptop, 5);
        logger.logInventoryChange(laptop);

        System.out.println("\n--- Cap nhat so luong (Xuat hang) ---"); 
        manager.updateInventory(laptop, -3);
        logger.logInventoryChange(laptop);

        System.out.println("\n--- Cap nhat so luong (Xuat qua so luong) ---");
        manager.updateInventory(laptop, -15);
        logger.logInventoryChange(laptop);


        System.out.println("\n--- Kiem tra voi san pham null ---"); 
        Product nullProduct = null;
        manager.updateInventory(nullProduct, 5);
        logger.logInventoryChange(nullProduct);


        System.out.println("\n--- Ket thuc Demo ---"); 
    }
}