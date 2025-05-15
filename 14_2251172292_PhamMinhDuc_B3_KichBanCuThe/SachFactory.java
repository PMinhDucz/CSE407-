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


class SachFactory extends SanPhamFactory {
    @Override
    public SanPham taoSanPham(String maSP, int soLuong, Map<String, Object> chiTiet) {
        String tacGia = (String) chiTiet.getOrDefault("tacGia", "Khong ro tac gia");
        int soTrang = (Integer) chiTiet.getOrDefault("soTrang", 0);
        return new Sach(maSP, soLuong, tacGia, soTrang);
    }
}