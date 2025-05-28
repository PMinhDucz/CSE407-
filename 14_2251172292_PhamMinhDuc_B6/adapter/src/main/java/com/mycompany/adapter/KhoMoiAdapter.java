/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

/**
 *
 * @author ADMIN
 */

import com.mycompany.adapter.DichVuKhoMoiCloud;
import com.mycompany.adapter.IKhoHang;
import com.mycompany.adapter.ThongTinSanPham;


public class KhoMoiAdapter implements IKhoHang {
    private DichVuKhoMoiCloud khoMoi;

    public KhoMoiAdapter(DichVuKhoMoiCloud khoMoi) {
        this.khoMoi = khoMoi;
    }

    @Override
    public ThongTinSanPham hienThiThongTinTonKho(String maSanPham) {
        System.out.println("KhoMoiAdapter: Nhận yêu cầu cho mã SP '" + maSanPham + "'. Chuyển đổi và gọi DichVuKhoMoiCloud...");
        String sku = khoMoi.chuyenMaSPChungSangSKU(maSanPham);
        String chiTietTuKhoMoi = khoMoi.getInventoryDetails(sku);

        String[] parts = chiTietTuKhoMoi.split("\\|");
        String tenSanPham = parts[0];
        int soLuongTon = 0;
        try {
            soLuongTon = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            System.err.println("Lỗi parse số lượng từ kho mới: " + parts[2]);
        }
        String moTaThem = parts.length > 3 ? parts[3] : "N/A";

        return new ThongTinSanPham(maSanPham, tenSanPham, soLuongTon, "Nguồn: Kho Mới Cloud - NCC: " + moTaThem);
    }
}