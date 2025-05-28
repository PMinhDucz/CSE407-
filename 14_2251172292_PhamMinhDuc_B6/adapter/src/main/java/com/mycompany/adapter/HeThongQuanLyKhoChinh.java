/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

/**
 *
 * @author ADMIN
 */

import com.mycompany.adapter.ThongTinSanPham;
import com.mycompany.adapter.IKhoHang;

public class HeThongQuanLyKhoChinh {
    public void xemThongTinSanPhamTuKho(IKhoHang kho, String maSanPham) {
        System.out.println("\n--- HeThongQuanLyKhoChinh: Yêu cầu thông tin cho mã SP: " + maSanPham + " ---");
        ThongTinSanPham thongTin = kho.hienThiThongTinTonKho(maSanPham);
        if (thongTin != null) {
            System.out.println("Thông tin nhận được từ kho:");
            System.out.println(thongTin);
        } else {
            System.out.println("Không thể lấy thông tin sản phẩm từ kho.");
        }
        System.out.println("----------------------------------------------------");
    }
}