/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.khomediator;

/**
 *
 * @author ADMIN
 */

public class KhoMediator {
    public static void main(String[] args) {
        KhoTrungTamMediator khoMediator = new KhoTrungTamMediator();

        ModuleNhapKho nhapKho = new ModuleNhapKho(khoMediator);
        ModuleXuatKho xuatKho = new ModuleXuatKho(khoMediator);
        ModuleKiemKe kiemKe = new ModuleKiemKe(khoMediator);

        khoMediator.setModuleNhapKho(nhapKho);
        khoMediator.setModuleXuatKho(xuatKho);
        khoMediator.setModuleKiemKe(kiemKe);

        System.out.println("--- KỊCH BẢN 1: Nhập hàng ---");
        nhapKho.thucHienNhapHang("SP001", 5);
        nhapKho.thucHienNhapHang("SP003", 20);

        System.out.println("\n--- KỊCH BẢN 2: Xuất hàng ---");
        xuatKho.thucHienXuatHang("SP001", 3);
        xuatKho.thucHienXuatHang("SP002", 7);

        System.out.println("\n--- KỊCH BẢN 3: Kiểm kê ---");
        kiemKe.yeuCauKiemKeSanPham("SP001");
        kiemKe.yeuCauKiemKeSanPham("SP003");
        kiemKe.yeuCauKiemKeToanBo();

        System.out.println("\n--- KỊCH BẢN 4: Xuất hết hàng và kiểm kê lại ---");
        xuatKho.thucHienXuatHang("SP002", 5);
        kiemKe.yeuCauKiemKeSanPham("SP002");
    }
}
