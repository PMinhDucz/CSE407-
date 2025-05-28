/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

/**
 *
 * @author ADMIN
 */

public class ThongTinSanPham {
    public String maSanPham;
    public String tenSanPham;
    public int soLuongTon;
    public String moTaThem;

    public ThongTinSanPham(String maSanPham, String tenSanPham, int soLuongTon, String moTaThem) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuongTon = soLuongTon;
        this.moTaThem = moTaThem;
    }

    @Override
    public String toString() {
        return "Sản phẩm: " + tenSanPham + " (Mã: " + maSanPham + ")\n" +
               "Số lượng tồn: " + soLuongTon + "\n" +
               "Thông tin thêm: " + moTaThem;
    }
}