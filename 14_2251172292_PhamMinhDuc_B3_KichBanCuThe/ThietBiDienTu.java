/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlkhfactory;

/**
 *
 * @author ADMIN
 */

class ThietBiDienTu extends SanPham {
    private String nhaSanXuat;
    private int thoiGianBaoHanh; 

    public ThietBiDienTu(String maSP, int soLuong, String nhaSanXuat, int thoiGianBaoHanh) {
        super(maSP, soLuong);
        this.nhaSanXuat = nhaSanXuat;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("--- Thong Tin Thiet Bi Dien Tu ---");
        System.out.println("Ma SP: " + maSP);
        System.out.println("So luong: " + soLuong);
        System.out.println("Nha san xuat: " + nhaSanXuat);
        System.out.println("Bao hanh: " + thoiGianBaoHanh + " thang");
        System.out.println("----------------------------------");
    }
}