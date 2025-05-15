/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlkhfactory;

/**
 *
 * @author ADMIN
 */
import java.util.Map; 

abstract class SanPham {
    protected String maSP;
    protected int soLuong;

    public SanPham(String maSP, int soLuong) {
        this.maSP = maSP;
        this.soLuong = soLuong;
    }

    public String getMaSP() {
        return maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public abstract void hienThiThongTin();
}
