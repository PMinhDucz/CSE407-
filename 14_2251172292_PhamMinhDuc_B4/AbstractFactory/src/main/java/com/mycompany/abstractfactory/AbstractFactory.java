/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstractfactory;

/**
 *
 * @author ADMIN
 */
import java.util.ArrayList;
import java.util.List;

// --- Abstract Products ---
interface IProduct {
    String getProductId();
    int getQuantity();
    void setQuantity(int quantity);
    void displayDetails();
}

interface IBookProduct extends IProduct {
    String getISBN();
    String getAuthor();
}

interface IElectronicProduct extends IProduct {
    int getWarrantyPeriod(); // in months
    String getBrand();
}

// --- Concrete Products from Supplier A ---
class BookFromSupplierA implements IBookProduct {
    private String productId;
    private int quantity;
    private String isbn;
    private String author;

    public BookFromSupplierA(String productId, int quantity, String isbn, String author) {
        this.productId = productId;
        this.quantity = quantity;
        this.isbn = isbn;
        this.author = author;
    }

    @Override
    public String getProductId() { return productId; }
    @Override
    public int getQuantity() { return quantity; }
    @Override
    public void setQuantity(int quantity) { this.quantity = quantity; }
    @Override
    public String getISBN() { return isbn; }
    @Override
    public String getAuthor() { return author; }

    @Override
    public void displayDetails() {
        System.out.println("Supplier A Book: [ID=" + productId + ", Qty=" + quantity +
                           ", ISBN=" + isbn + ", Author=" + author + "]");
    }
}

class ElectronicFromSupplierA implements IElectronicProduct {
    private String productId;
    private int quantity;
    private int warrantyPeriod;
    private String brand;

    public ElectronicFromSupplierA(String productId, int quantity, int warrantyPeriod, String brand) {
        this.productId = productId;
        this.quantity = quantity;
        this.warrantyPeriod = warrantyPeriod;
        this.brand = brand;
    }

    @Override
    public String getProductId() { return productId; }
    @Override
    public int getQuantity() { return quantity; }
    @Override
    public void setQuantity(int quantity) { this.quantity = quantity; }
    @Override
    public int getWarrantyPeriod() { return warrantyPeriod; }
    @Override
    public String getBrand() { return brand; }

    @Override
    public void displayDetails() {
        System.out.println("Supplier A Electronic: [ID=" + productId + ", Qty=" + quantity +
                           ", Warranty=" + warrantyPeriod + " months, Brand=" + brand + "]");
    }
}

// --- Concrete Products from Supplier B ---
class BookFromSupplierB implements IBookProduct {
    private String productId;
    private int quantity;
    private String isbn;
    private String author;

    public BookFromSupplierB(String productId, int quantity, String isbn, String author) {
        this.productId = productId;
        this.quantity = quantity;
        this.isbn = isbn;
        this.author = author;
    }

    @Override
    public String getProductId() { return productId; }
    @Override
    public int getQuantity() { return quantity; }
    @Override
    public void setQuantity(int quantity) { this.quantity = quantity; }
    @Override
    public String getISBN() { return isbn; }
    @Override
    public String getAuthor() { return author; }

    @Override
    public void displayDetails() {
        System.out.println("Supplier B Book: [ID=" + productId + ", Qty=" + quantity +
                           ", ISBN=" + isbn + ", Author=" + author + "]");
    }
}

class ElectronicFromSupplierB implements IElectronicProduct {
    private String productId;
    private int quantity;
    private int warrantyPeriod;
    private String brand;

    public ElectronicFromSupplierB(String productId, int quantity, int warrantyPeriod, String brand) {
        this.productId = productId;
        this.quantity = quantity;
        this.warrantyPeriod = warrantyPeriod;
        this.brand = brand;
    }

    @Override
    public String getProductId() { return productId; }
    @Override
    public int getQuantity() { return quantity; }
    @Override
    public void setQuantity(int quantity) { this.quantity = quantity; }
    @Override
    public int getWarrantyPeriod() { return warrantyPeriod; }
    @Override
    public String getBrand() { return brand; }

    @Override
    public void displayDetails() {
        System.out.println("Supplier B Electronic: [ID=" + productId + ", Qty=" + quantity +
                           ", Warranty=" + warrantyPeriod + " months, Brand=" + brand + "]");
    }
}


// --- Abstract Factory ---
interface IWarehouseFactory {
    IBookProduct createBookProduct(String productId, int quantity, String isbn, String author);
    IElectronicProduct createElectronicProduct(String productId, int quantity, int warranty, String brand);
}

// --- Concrete Factories ---
class SupplierAFactory implements IWarehouseFactory {
    @Override
    public IBookProduct createBookProduct(String productId, int quantity, String isbn, String author) {
        return new BookFromSupplierA(productId, quantity, isbn, author);
    }

    @Override
    public IElectronicProduct createElectronicProduct(String productId, int quantity, int warranty, String brand) {
        return new ElectronicFromSupplierA(productId, quantity, warranty, brand);
    }
}

class SupplierBFactory implements IWarehouseFactory {
    @Override
    public IBookProduct createBookProduct(String productId, int quantity, String isbn, String author) {
        return new BookFromSupplierB(productId, quantity, isbn, author);
    }

    @Override
    public IElectronicProduct createElectronicProduct(String productId, int quantity, int warranty, String brand) {
        return new ElectronicFromSupplierB(productId, quantity, warranty, brand);
    }
}

// --- Client ---
class WarehouseManager {
    private IWarehouseFactory factory;
    private List<IProduct> inventory = new ArrayList<>();

    public WarehouseManager(IWarehouseFactory factory) {
        this.factory = factory;
        System.out.println("WarehouseManager configured with: " + factory.getClass().getSimpleName());
    }

    public void stockNewBook(String productId, int quantity, String isbn, String author) {
        IBookProduct book = factory.createBookProduct(productId, quantity, isbn, author);
        inventory.add(book);
        System.out.print("Stocked: ");
        book.displayDetails();
    }

    public void stockNewElectronic(String productId, int quantity, int warranty, String brand) {
        IElectronicProduct electronic = factory.createElectronicProduct(productId, quantity, warranty, brand);
        inventory.add(electronic);
        System.out.print("Stocked: ");
        electronic.displayDetails();
    }

    public void displayFullInventory() {
        System.out.println("\n--- Current Warehouse Inventory (" + factory.getClass().getSimpleName() + " products) ---");
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        for (IProduct product : inventory) {
            product.displayDetails();
        }
        System.out.println("--------------------------------------------------");
    }
}

// --- Main Application ---
public class AbstractFactory {
    public static void main(String[] args) {
        System.out.println("--- Scenario 1: Using Supplier A's products ---");
        IWarehouseFactory supplierAFactory = new SupplierAFactory();
        WarehouseManager warehouseA = new WarehouseManager(supplierAFactory);

        warehouseA.stockNewBook("BOOK-A-001", 50, "978-0321765723", "Robert C. Martin");
        warehouseA.stockNewElectronic("ELEC-A-001", 20, 24, "BrandX");
        warehouseA.stockNewBook("BOOK-A-002", 30, "978-0132350884", "Erich Gamma");
        warehouseA.displayFullInventory();

        System.out.println("\n--- Scenario 2: Using Supplier B's products ---");
        IWarehouseFactory supplierBFactory = new SupplierBFactory();
        WarehouseManager warehouseB = new WarehouseManager(supplierBFactory);

        warehouseB.stockNewBook("BOOK-B-101", 40, "978-1617292545", "Raoul-Gabriel Urma");
        warehouseB.stockNewElectronic("ELEC-B-101", 15, 12, "BrandY");
        warehouseB.stockNewElectronic("ELEC-B-102", 25, 36, "BrandZ Premium");
        warehouseB.displayFullInventory();
    }
}