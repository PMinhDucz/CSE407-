/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.khomediator;

/**
 *
 * @author ADMIN
 */

// Colleague: Module Xuất Kho
class ModuleXuatKho {
    private IKhoMediator mediator;
    private String tenModule = "ModuleXuatKho";

    public ModuleXuatKho(IKhoMediator mediator) {
        this.mediator = mediator;
    }

    public void thucHienXuatHang(String maSP, int soLuongYeuCau) {
        System.out.println("[" + tenModule + "] Yêu cầu xuất " + soLuongYeuCau + " sản phẩm '" + maSP + "'.");
        MapData dataXuat = new MapData();
        dataXuat.put("maSP", maSP);
        dataXuat.put("soLuongYeuCau", soLuongYeuCau);
        mediator.notify(this, "YEU_CAU_XUAT_HANG", dataXuat);
    }

    public void thongBaoXuatThanhCong(String maSP, int soLuongXuat) {
        System.out.println("[" + tenModule + "] Đã xuất thành công " + soLuongXuat + " sản phẩm '" + maSP + "'.");
    }

    public void thongBaoKhongDuHang(String maSP, int soLuongYeuCau, int soLuongTon) {
        System.out.println("[" + tenModule + "] LỖI: Không đủ hàng để xuất '" + maSP + "'. Yêu cầu: " + soLuongYeuCau + ", Tồn kho: " + soLuongTon);
    }

    public String getTenModule() {
        return tenModule;
    }
}