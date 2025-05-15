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

class ThietBiDienTuFactory extends SanPhamFactory {
    @Override
    public SanPham taoSanPham(String maSP, int soLuong, Map<String, Object> chiTiet) {
        String nhaSanXuat = (String) chiTiet.getOrDefault("nhaSanXuat", "Khong ro NSX");
        int thoiGianBaoHanh = (Integer) chiTiet.getOrDefault("thoiGianBaoHanh", 0);
        return new ThietBiDienTu(maSP, soLuong, nhaSanXuat, thoiGianBaoHanh);
    }
}
