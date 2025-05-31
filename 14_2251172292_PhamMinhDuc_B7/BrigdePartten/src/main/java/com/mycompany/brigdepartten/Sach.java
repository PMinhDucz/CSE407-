/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.brigdepartten;

/**
 *
 * @author ADMIN
 */
// Sản phẩm Sách
class Sach extends SanPham {
    private String tacGia;

    public Sach(String tenSP, String tacGia, CachXuLyKho cachXuLyDuocChon) {
        super(tenSP, cachXuLyDuocChon);
        this.tacGia = tacGia;
    }

    @Override
    public void hienThiChiTietLoaiSanPham() {
        System.out.println("Loại: Sách");
        System.out.println("Tác giả: " + tacGia);
    }

}