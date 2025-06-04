/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.khomediator;

/**
 *
 * @author ADMIN
 */

import java.util.Map; // Cần import Map

// Colleague: Module Kiểm Kê
class ModuleKiemKe {
    private IKhoMediator mediator;
    private String tenModule = "ModuleKiemKe";

    public ModuleKiemKe(IKhoMediator mediator) {
        this.mediator = mediator;
    }

    public void yeuCauKiemKeToanBo() {
        System.out.println("[" + tenModule + "] Yêu cầu kiểm kê toàn bộ kho.");
        mediator.notify(this, "YEU_CAU_KIEM_KE_TOAN_BO", null);
    }

    public void yeuCauKiemKeSanPham(String maSP) {
        System.out.println("[" + tenModule + "] Yêu cầu kiểm kê sản phẩm '" + maSP + "'.");
        MapData dataKiemKe = new MapData();
        dataKiemKe.put("maSP", maSP);
        mediator.notify(this, "YEU_CAU_KIEM_KE_SAN_PHAM", dataKiemKe);
    }

    public void capNhatThongTinTonKho(String maSP, int soLuongMoi) {
        System.out.println("[" + tenModule + "] Nhận được cập nhật: Sản phẩm '" + maSP + "' hiện có số lượng " + soLuongMoi + ".");
    }

    public void hienThiKetQuaKiemKe(String maSP, int soLuong) {
         System.out.println("[" + tenModule + "] Kết quả kiểm kê: Sản phẩm '" + maSP + "' có " + soLuong + " đơn vị.");
    }

    public void hienThiKetQuaKiemKeToanBo(Map<String, Integer> duLieuTonKho) {
        System.out.println("[" + tenModule + "] Kết quả kiểm kê toàn bộ kho:");
        duLieuTonKho.forEach((sp, sl) -> System.out.println("  - " + sp + ": " + sl));
    }

    public String getTenModule() {
        return tenModule;
    }
}