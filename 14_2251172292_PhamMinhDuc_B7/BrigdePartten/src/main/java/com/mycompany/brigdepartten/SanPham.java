/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.brigdepartten;

/**
 *
 * @author ADMIN
 */
abstract class SanPham {
    protected String tenSP;
    protected CachXuLyKho cachXuLy; 

    public SanPham(String tenSP, CachXuLyKho cachXuLyDuocChon) {
        this.tenSP = tenSP;
        this.cachXuLy = cachXuLyDuocChon;
    }

    public void hienThiThongTinCoBan() {
        System.out.println("Tên sản phẩm: " + tenSP);
    }

    public void thucHienXuLyKho() {
        System.out.println("Đang chuẩn bị xử lý kho cho: " + tenSP);
        String ketQua = cachXuLy.xuLy(this.tenSP); 
        System.out.println("  -> Kết quả xử lý: " + ketQua);
    }

    public abstract void hienThiChiTietLoaiSanPham();
}
