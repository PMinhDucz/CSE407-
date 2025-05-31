/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.brigdepartten;

/**
 *
 * @author ADMIN
 */
class XuLyCanTrong implements CachXuLyKho {
    @Override
    public String xuLy(String tenSP) {
        return "Sản phẩm '" + tenSP + "' được xử lý CẨN TRỌNG (ví dụ: kiểm tra đặc biệt, đóng gói kỹ).";
    }
}
