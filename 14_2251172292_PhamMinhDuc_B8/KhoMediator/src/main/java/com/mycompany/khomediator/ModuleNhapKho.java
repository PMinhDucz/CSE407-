/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.khomediator;

/**
 *
 * @author ADMIN
 */

// Colleague: Module Nhập Kho
class ModuleNhapKho {
    private IKhoMediator mediator;
    private String tenModule = "ModuleNhapKho";

    public ModuleNhapKho(IKhoMediator mediator) {
        this.mediator = mediator;
    }

    public void thucHienNhapHang(String maSP, int soLuong) {
        System.out.println("[" + tenModule + "] Thực hiện nhập " + soLuong + " sản phẩm '" + maSP + "'.");
        MapData dataNhap = new MapData();
        dataNhap.put("maSP", maSP);
        dataNhap.put("soLuong", soLuong);
        mediator.notify(this, "NHAP_HANG_THANH_CONG", dataNhap);
    }

    public String getTenModule() {
        return tenModule;
    }
}