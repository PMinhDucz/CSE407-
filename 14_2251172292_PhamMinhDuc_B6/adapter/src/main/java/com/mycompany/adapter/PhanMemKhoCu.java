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

public class PhanMemKhoCu {
    private Map<String, String> duLieuKhoCu = new HashMap<>();

    public PhanMemKhoCu() {
        duLieuKhoCu.put("BUA_DINH_001", "Búa Đinh Thép;50;Hàng nhập lô 2010");
        duLieuKhoCu.put("KIM_CAT_002", "Kìm Cắt Điện;120;Loại tay cầm đỏ");
    }

    public String layChiTietSanPham(String ten_sp_cu_trong_he_thong) {
        System.out.println("PhanMemKhoCu: Đang truy vấn chi tiết cho '" + ten_sp_cu_trong_he_thong + "'...");
        return duLieuKhoCu.getOrDefault(ten_sp_cu_trong_he_thong, "Không tìm thấy sản phẩm;0;N/A");
    }

    public String chuyenMaSPChungSangTenSPCu(String maSanPhamChung) {
        if ("SP001".equals(maSanPhamChung)) return "BUA_DINH_001";
        if ("SP002".equals(maSanPhamChung)) return "KIM_CAT_002";
        return "UNKNOWN_OLD_ITEM";
    }
}
