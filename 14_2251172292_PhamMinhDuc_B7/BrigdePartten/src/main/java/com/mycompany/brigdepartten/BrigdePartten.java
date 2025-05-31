/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.brigdepartten;

/**
 *
 * @author ADMIN
 */
public class BrigdePartten {
    public static void main(String[] args) {
        CachXuLyKho xuLyTieuChuan = new XuLyTieuChuan();
        CachXuLyKho xuLyCanTrong = new XuLyCanTrong();

        System.out.println("--- KỊCH BẢN 1: SÁCH VÀ XỬ LÝ TIÊU CHUẨN ---");
        SanPham sachLapTrinh = new Sach("Lập trình Java từ A đến Z", "GS. CodeMaster", xuLyTieuChuan);
        sachLapTrinh.hienThiThongTinCoBan();
        sachLapTrinh.hienThiChiTietLoaiSanPham();
        sachLapTrinh.thucHienXuLyKho(); 
        System.out.println("\n--- KỊCH BẢN 2: ĐỒ ĐIỆN TỬ VÀ XỬ LÝ CẨN TRỌNG ---");
        SanPham tiviManHinhLon = new DoDienTu("TV OLED 75 inch UltraHD", "Sony", xuLyCanTrong);
        tiviManHinhLon.hienThiThongTinCoBan();
        tiviManHinhLon.hienThiChiTietLoaiSanPham();
        tiviManHinhLon.thucHienXuLyKho(); 

        System.out.println("\n--- KỊCH BẢN 3: SÁCH QUÝ VÀ XỬ LÝ CẨN TRỌNG ---");
        SanPham sachCo = new Sach("Bản thảo Truyện Kiều (1866)", "Nguyễn Du", xuLyCanTrong);
        sachCo.hienThiThongTinCoBan();
        sachCo.hienThiChiTietLoaiSanPham();
        sachCo.thucHienXuLyKho(); 
        System.out.println("\n--- KỊCH BẢN 4: ĐỒ ĐIỆN TỬ THÔNG THƯỜNG VÀ XỬ LÝ TIÊU CHUẨN ---");
        SanPham chuotMayTinh = new DoDienTu("Chuột không dây Ergonomic", "Logitech", xuLyTieuChuan);
        chuotMayTinh.hienThiThongTinCoBan();
        chuotMayTinh.hienThiChiTietLoaiSanPham();
        chuotMayTinh.thucHienXuLyKho(); 
    }
}
