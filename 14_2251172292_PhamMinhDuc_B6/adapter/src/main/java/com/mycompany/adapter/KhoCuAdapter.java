/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

/**
 *
 * @author ADMIN
 */
import com.mycompany.adapter.PhanMemKhoCu;
import com.mycompany.adapter.IKhoHang;
import com.mycompany.adapter.ThongTinSanPham;

public class KhoCuAdapter implements IKhoHang {
    private PhanMemKhoCu khoCu;

    public KhoCuAdapter(PhanMemKhoCu khoCu) {
        this.khoCu = khoCu;
    }

    @Override
    public ThongTinSanPham hienThiThongTinTonKho(String maSanPham) {
        System.out.println("KhoCuAdapter: Nhận yêu cầu cho mã SP '" + maSanPham + "'. Chuyển đổi và gọi PhanMemKhoCu...");
        String tenSpCu = khoCu.chuyenMaSPChungSangTenSPCu(maSanPham);
        String chiTietTuKhoCu = khoCu.layChiTietSanPham(tenSpCu);

        String[] parts = chiTietTuKhoCu.split(";");
        String tenSanPham = parts[0];
        int soLuongTon = 0;
        try {
            soLuongTon = Integer.parseInt(parts[1]);
        } catch (NumberFormatException e) {
            System.err.println("Lỗi parse số lượng từ kho cũ: " + parts[1]);
        }
        String moTaThem = parts.length > 2 ? parts[2] : "N/A";

        return new ThongTinSanPham(maSanPham, tenSanPham, soLuongTon, "Nguồn: Kho Cũ - " + moTaThem);
    }
}
