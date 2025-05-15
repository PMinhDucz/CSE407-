/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.qlkhfactory;

/**
 *
 * @author ADMIN
 */
import java.util.HashMap;
import java.util.Map;



public class QLKHFactory {
    public static void main(String[] args) {
        SanPhamFactory sachFactory = new SachFactory();
        SanPhamFactory thietBiDienTuFactory = new ThietBiDienTuFactory();

        
        Map<String, Object> chiTietSach = new HashMap<>();
        chiTietSach.put("tacGia", "Nguyen Nhat Anh");
        chiTietSach.put("soTrang", 300);
        SanPham sach = sachFactory.nhapKhoSanPham("S001", 10, chiTietSach);
        sach.hienThiThongTin();

        System.out.println(); 

        
        Map<String, Object> chiTietThietBi = new HashMap<>();
        chiTietThietBi.put("nhaSanXuat", "Samsung");
        chiTietThietBi.put("thoiGianBaoHanh", 24); 
        SanPham tivi = thietBiDienTuFactory.nhapKhoSanPham("TV001", 5, chiTietThietBi);
        tivi.hienThiThongTin();

        System.out.println();
        Map<String, Object> chiTietMayTinh = new HashMap<>();
        chiTietMayTinh.put("nhaSanXuat", "Dell");
        SanPham mayTinh = thietBiDienTuFactory.nhapKhoSanPham("LT002", 3, chiTietMayTinh);
        mayTinh.hienThiThongTin();
    }
}
