/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlybenhvien;

/**
 *
 * @author ADMIN
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Objects; // Import để dùng Objects.hash và Objects.equals

public class BacSi {
    private String ten;
    private List<BenhNhan> danhSachBenhNhan; 

    public BacSi(String ten) {
        this.ten = ten;
        this.danhSachBenhNhan = new ArrayList<>();
    }

    public String getTen() {
        return ten;
    }

    public List<BenhNhan> getDanhSachBenhNhan() {
        return danhSachBenhNhan; 
    }


    public void themBenhNhan(BenhNhan benhNhan) {
        if (benhNhan != null && !this.danhSachBenhNhan.contains(benhNhan)) {
            this.danhSachBenhNhan.add(benhNhan);
        }
    }


    public void hienThiDanhSach() { 
        System.out.println("Danh sach benh nhan cua Bac si '" + this.ten + "':");
        if (danhSachBenhNhan.isEmpty()) {
            System.out.println("   (Chua phu trach benh nhan nao)");
        } else {
            for (BenhNhan bn : danhSachBenhNhan) {
                System.out.println("   - " + bn);
            }
        }
        System.out.println(); 
    }

     @Override
    public String toString() {
        return this.ten;
    }


     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BacSi bacSi = (BacSi) o;
        return Objects.equals(ten, bacSi.ten); 
    }

    @Override
    public int hashCode() {
        return Objects.hash(ten);
    }
}