/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

/**
 *
 * @author ADMIN
 */

import java.util.HashMap;
import java.util.Map;

public class DichVuKhoMoiCloud {
    private Map<String, String> duLieuKhoMoi = new HashMap<>();

    public DichVuKhoMoiCloud() {
        duLieuKhoMoi.put("SKU_LAPTOP_XYZ", "Laptop Gaming XYZ|SKU_LAPTOP_XYZ|25|NCC Alpha");
        duLieuKhoMoi.put("SKU_MOUSE_ABC", "Chuột Không Dây ABC|SKU_MOUSE_ABC|200|NCC Beta");
    }

    public String getInventoryDetails(String product_sku) {
        System.out.println("DichVuKhoMoiCloud: Fetching inventory details for SKU '" + product_sku + "'...");
        return duLieuKhoMoi.getOrDefault(product_sku, "Unknown SKU|"+product_sku+"|0|N/A");
    }

    public String chuyenMaSPChungSangSKU(String maSanPhamChung) {
        if ("SP003".equals(maSanPhamChung)) return "SKU_LAPTOP_XYZ";
        if ("SP004".equals(maSanPhamChung)) return "SKU_MOUSE_ABC";
        return "UNKNOWN_NEW_SKU";
    }
}