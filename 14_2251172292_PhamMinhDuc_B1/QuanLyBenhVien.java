/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quanlybenhvien;

/**
 *
 * @author ADMIN
 */

//DEMO CACH HOAT DONG
public class QuanLyBenhVien {
    //DEMO
    public static void ganBacSiChoBenhNhan(BacSi bacSi, BenhNhan benhNhan) {
        if (bacSi == null || benhNhan == null) {
             System.out.println("Loi: Khong thể gán vì Bác sĩ hoặc Bệnh nhân không tồn tại (null).");
             return;
        }
        System.out.println("   Gan: BS. " + bacSi.getTen() + " <-> BN. " + benhNhan.getTen());
        bacSi.themBenhNhan(benhNhan);
        benhNhan.themBacSi(bacSi);
    }

    public static void main(String[] args) {
        System.out.println("--- CHUONG TRINH QUAN LY BENH VIEN (DEMO) ---");

        System.out.println("\n[1] Tao danh sach bac si:");
        BacSi bsAn = new BacSi("Nguyen Van An");
        BacSi bsBinh = new BacSi("Tran Thi Binh");
        System.out.println("   - Da tao: " + bsAn);
        System.out.println("   - Da tao: " + bsBinh);

        System.out.println("\n[2] Tao danh sach benh nhan:");
        BenhNhan bnMot = new BenhNhan("Le Van Mot");
        BenhNhan bnHai = new BenhNhan("Pham Thi Hai");
        BenhNhan bnBa = new BenhNhan("Hoang Van Ba");
        System.out.println("   - Da tao: " + bnMot);
        System.out.println("   - Da tao: " + bnHai);
        System.out.println("   - Da tao: " + bnBa);

     
        System.out.println("\n[3] Gan benh nhan cho bac si:");
        ganBacSiChoBenhNhan(bsAn, bnMot); 
        ganBacSiChoBenhNhan(bsAn, bnHai); 
        ganBacSiChoBenhNhan(bsBinh, bnHai); 
        ganBacSiChoBenhNhan(bsBinh, bnBa); 

        System.out.println("\n[4] Hien thi danh sach benh nhan theo tung bac si:");
        bsAn.hienThiDanhSach(); 
        bsBinh.hienThiDanhSach();

        System.out.println("\n[5] Kiem tra: Hien thi danh sach bac si theo tung benh nhan:");
        bnMot.hienThiDanhSachBacSi();
        bnHai.hienThiDanhSachBacSi(); 
        bnBa.hienThiDanhSachBacSi();

        System.out.println("\n--- END ---");
    }
}