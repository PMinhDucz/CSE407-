/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adapter;

/**
 *
 * @author ADMIN
 */


// Nếu bạn đặt các file vào package, bạn cần import các lớp khác
// import com.example.khohang.HeThongQuanLyKhoChinh;
// import com.example.khohang.PhanMemKhoCu;
// import com.example.khohang.DichVuKhoMoiCloud;
// import com.example.khohang.IKhoHang;
// import com.example.khohang.KhoCuAdapter;
// import com.example.khohang.KhoMoiAdapter;
import com.mycompany.adapter.KhoMoiAdapter;
import com.mycompany.adapter.DichVuKhoMoiCloud;
import com.mycompany.adapter.IKhoHang;
import com.mycompany.adapter.KhoCuAdapter;
import com.mycompany.adapter.HeThongQuanLyKhoChinh;
import com.mycompany.adapter.PhanMemKhoCu;






public class Adapter {
    public static void main(String[] args) {
        HeThongQuanLyKhoChinh heThongChinh = new HeThongQuanLyKhoChinh();

        PhanMemKhoCu khoCu = new PhanMemKhoCu();
        DichVuKhoMoiCloud khoMoi = new DichVuKhoMoiCloud();

        IKhoHang adapterChoKhoCu = new KhoCuAdapter(khoCu);
        IKhoHang adapterChoKhoMoi = new KhoMoiAdapter(khoMoi);

        heThongChinh.xemThongTinSanPhamTuKho(adapterChoKhoCu, "SP001");
        heThongChinh.xemThongTinSanPhamTuKho(adapterChoKhoCu, "SP002");

        heThongChinh.xemThongTinSanPhamTuKho(adapterChoKhoMoi, "SP003");
        heThongChinh.xemThongTinSanPhamTuKho(adapterChoKhoMoi, "SP004");

        heThongChinh.xemThongTinSanPhamTuKho(adapterChoKhoCu, "SP999");
        heThongChinh.xemThongTinSanPhamTuKho(adapterChoKhoMoi, "SP999");
    }
}
