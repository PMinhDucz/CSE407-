/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.qlkh;

/**
 *
 * @author ADMIN
 */
public class QLKH { 
    private ProductFactory currentInitializer;
    private InventoryManager manager; 
    private InventoryLogger logger;   

    public QLKH() {
        this.manager = new InventoryManager();
        this.logger = new InventoryLogger();  
    }

    public void setProductCreationStrategy(ProductFactory initializer) {
        this.currentInitializer = initializer;
    }

    public void runSelectedStrategy() {
        if (currentInitializer == null) {
            System.out.println("Vui long chon chien luoc tao san pham truoc khi chay.");
            return;
        }

        Product newProduct = currentInitializer.createProduct();
        currentInitializer.announceCreation(newProduct);

        if (newProduct != null) {
            logger.logInventoryChange(newProduct);
            manager.updateInventory(newProduct, 10);
            logger.logInventoryChange(newProduct);

            manager.updateInventory(newProduct, -3);
            logger.logInventoryChange(newProduct);
        }
    }

    public static void main(String[] args) {
        QLKH app = new QLKH();
        // CO 2 KICH BAN CHAY
        //1-CHAY BANG DU LIEU NHAP
        //2-CHAY BANG DU LIEU TRONG FILE DEFAULT
        System.out.println("\n*** KICH BAN 1: NHAP THU CONG ***");
        app.setProductCreationStrategy(new ManualInputProductFactory());
        app.runSelectedStrategy();

        System.out.println("\n*** KICH BAN 2: GIA TRI MAC DINH ***");
        app.setProductCreationStrategy(new DefaultValueProductFactory("DEFAULT_ITEM_007", 15));
        app.runSelectedStrategy();



        System.out.println("\n--- Ket thuc chuong trinh ---");
    }
}