/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.builderpattern;

/**
 *
 * @author ADMIN
 */

public interface KitBuilder {
    void reset();
    KitBuilder setKitId(String id);
    KitBuilder setKitName(String name);
    KitBuilder addPart(String partName, String partDescriptionForManual); // Thêm mô tả cho manual
    KitBuilder setDifficulty(String level);
    KitBuilder setEstimatedSteps(int steps); // Số bước ước tính, manual có thể dùng để tạo step
    KitBuilder addSafetyWarning(String warning);
    KitBuilder addToolRequirement(String tool);
    // Không có getResult() chung vì kiểu trả về khác nhau
}