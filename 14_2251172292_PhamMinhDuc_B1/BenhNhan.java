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
import java.util.Objects; 

public class BenhNhan {
    private String ten;
    private List<BacSi> danhSachBacSi; 

    public BenhNhan(String ten) {
        this.ten = ten;
        this.danhSachBacSi = new ArrayList<>();
    }

    public String getTen() {
        return ten;
    }

    public List<BacSi> getDanhSachBacSi() {
        return danhSachBacSi; 
    }


    public void themBacSi(BacSi bacSi) {
        if (bacSi != null && !this.danhSachBacSi.contains(bacSi)) {
            this.danhSachBacSi.add(bacSi);
        }
    }

    

    public void hienThiDanhSachBacSi() {
        System.out.println("-> Benh nhan '" + this.ten + "' duoc phu trach boi cac bac si:");
        if (danhSachBacSi.isEmpty()) {
            System.out.println("   (Chua co bac si nao phu trach)");
        } else {
            for (BacSi bs : danhSachBacSi) {
                System.out.println("   - BS. " + bs.getTen()); 
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
        BenhNhan benhNhan = (BenhNhan) o;
        return Objects.equals(ten, benhNhan.ten); 
    }

    @Override
    public int hashCode() {
        return Objects.hash(ten);
    }
}