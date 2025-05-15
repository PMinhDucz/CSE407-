/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlkhfactory;

/**
 *
 * @author ADMIN
 */

class Sach extends SanPham {
    private String tacGia;
    private int soTrang;

    public Sach(String maSP, int soLuong, String tacGia, int soTrang) {
        super(maSP, soLuong);
        this.tacGia = tacGia;
        this.soTrang = soTrang;
    }

    public String getTacGia() {
        return tacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("--- Thong Tin Sach ---");
        System.out.println("Ma SP: " + maSP);
        System.out.println("So luong: " + soLuong);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("So trang: " + soTrang);
        System.out.println("----------------------");
    }
}