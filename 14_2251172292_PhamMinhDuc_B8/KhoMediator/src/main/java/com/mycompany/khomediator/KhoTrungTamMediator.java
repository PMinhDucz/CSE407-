/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.khomediator;

/**
 *
 * @author ADMIN
 */

import java.util.HashMap;
import java.util.Map;

// Concrete Mediator
class KhoTrungTamMediator implements IKhoMediator {
    private ModuleNhapKho moduleNhap;
    private ModuleXuatKho moduleXuat;
    private ModuleKiemKe moduleKiemKe;
    private Map<String, Integer> duLieuTonKho = new HashMap<>();

    public KhoTrungTamMediator() {
        duLieuTonKho.put("SP001", 10);
        duLieuTonKho.put("SP002", 5);
    }

    public void setModuleNhapKho(ModuleNhapKho module) {
        this.moduleNhap = module;
    }
    public void setModuleXuatKho(ModuleXuatKho module) {
        this.moduleXuat = module;
    }
    public void setModuleKiemKe(ModuleKiemKe module) {
        this.moduleKiemKe = module;
    }

    @Override
    public void notify(Object sender, String event, Object data) {
        System.out.println(">>> Mediator nhận thông báo từ [" + getSenderName(sender) + "] với sự kiện: '" + event + "'");

        if (event.equals("NHAP_HANG_THANH_CONG") && sender instanceof ModuleNhapKho) {
            reactOnNhapHang((MapData) data);
        } else if (event.equals("YEU_CAU_XUAT_HANG") && sender instanceof ModuleXuatKho) {
            reactOnYeuCauXuatHang((MapData) data);
        } else if (event.equals("YEU_CAU_KIEM_KE_SAN_PHAM") && sender instanceof ModuleKiemKe) {
            reactOnYeuCauKiemKeSanPham((MapData) data);
        } else if (event.equals("YEU_CAU_KIEM_KE_TOAN_BO") && sender instanceof ModuleKiemKe) {
            reactOnYeuCauKiemKeToanBo();
        }
    }

    private String getSenderName(Object sender) {
        if (sender instanceof ModuleNhapKho) return ((ModuleNhapKho) sender).getTenModule();
        if (sender instanceof ModuleXuatKho) return ((ModuleXuatKho) sender).getTenModule();
        if (sender instanceof ModuleKiemKe) return ((ModuleKiemKe) sender).getTenModule();
        return "Unknown Sender";
    }

    private void reactOnNhapHang(MapData dataNhap) {
        String maSP = (String) dataNhap.get("maSP");
        int soLuongNhap = (Integer) dataNhap.get("soLuong");
        int soLuongHienTai = duLieuTonKho.getOrDefault(maSP, 0);
        int soLuongMoi = soLuongHienTai + soLuongNhap;
        duLieuTonKho.put(maSP, soLuongMoi);
        System.out.println(">>> Mediator: Đã cập nhật kho cho '" + maSP + "'. Số lượng mới: " + soLuongMoi);
        if (moduleKiemKe != null) {
            moduleKiemKe.capNhatThongTinTonKho(maSP, soLuongMoi);
        }
    }

    private void reactOnYeuCauXuatHang(MapData dataXuat) {
        String maSP = (String) dataXuat.get("maSP");
        int soLuongYeuCau = (Integer) dataXuat.get("soLuongYeuCau");
        int soLuongHienTai = duLieuTonKho.getOrDefault(maSP, 0);

        if (soLuongHienTai >= soLuongYeuCau) {
            int soLuongMoi = soLuongHienTai - soLuongYeuCau;
            duLieuTonKho.put(maSP, soLuongMoi);
            System.out.println(">>> Mediator: Đã cập nhật kho cho '" + maSP + "' sau khi xuất. Số lượng mới: " + soLuongMoi);
            if (moduleXuat != null) {
                moduleXuat.thongBaoXuatThanhCong(maSP, soLuongYeuCau);
            }
            if (moduleKiemKe != null) {
                moduleKiemKe.capNhatThongTinTonKho(maSP, soLuongMoi);
            }
        } else {
            System.out.println(">>> Mediator: Không đủ hàng '" + maSP + "' để xuất.");
            if (moduleXuat != null) {
                moduleXuat.thongBaoKhongDuHang(maSP, soLuongYeuCau, soLuongHienTai);
            }
        }
    }

    private void reactOnYeuCauKiemKeSanPham(MapData dataKiemKe) {
        String maSP = (String) dataKiemKe.get("maSP");
        int soLuongTon = duLieuTonKho.getOrDefault(maSP, 0);
        System.out.println(">>> Mediator: Xử lý yêu cầu kiểm kê cho '" + maSP + "'. Số lượng hiện tại: " + soLuongTon);
        if (moduleKiemKe != null) {
            moduleKiemKe.hienThiKetQuaKiemKe(maSP, soLuongTon);
        }
    }

     private void reactOnYeuCauKiemKeToanBo() {
        System.out.println(">>> Mediator: Xử lý yêu cầu kiểm kê toàn bộ kho.");
        if (moduleKiemKe != null) {
            moduleKiemKe.hienThiKetQuaKiemKeToanBo(new HashMap<>(duLieuTonKho));
        }
    }
}
