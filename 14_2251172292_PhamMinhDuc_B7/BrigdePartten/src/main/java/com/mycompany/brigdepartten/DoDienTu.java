/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.brigdepartten;

/**
 *
 * @author ADMIN
 */
class DoDienTu extends SanPham {
    private String hangSanXuat;

    public DoDienTu(String tenSP, String hangSanXuat, CachXuLyKho cachXuLyDuocChon) {
        super(tenSP, cachXuLyDuocChon);
        this.hangSanXuat = hangSanXuat;
    }

    @Override
    public void hienThiChiTietLoaiSanPham() {
        System.out.println("Loại: Đồ Điện Tử");
        System.out.println("Hãng sản xuất: " + hangSanXuat);
    }

}
