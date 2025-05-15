/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlkhfactory;

/**
 *
 * @author ADMIN
 */
import java.util.Map;


abstract class SanPhamFactory {
    public abstract SanPham taoSanPham(String maSP, int soLuong, Map<String, Object> chiTiet);
    public SanPham nhapKhoSanPham(String maSP, int soLuong, Map<String, Object> chiTiet) {
        SanPham sp = taoSanPham(maSP, soLuong, chiTiet);
        System.out.println("Da tao san pham voi ma: " + sp.getMaSP() + " va them vao kho.");
        return sp;
    }
}