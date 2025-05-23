/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builderpattern;

/**
 *
 * @author ADMIN
 */
// InstructionManualBuilder.java
import com.mycompany.builderpattern.AssemblyInstructionManual;

public class InstructionManualBuilder implements KitBuilder {
    private AssemblyInstructionManual manual;
    private String kitNameForTitle; // Tạm lưu tên kit để tạo title
    private int stepCounter;

    public InstructionManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.manual = new AssemblyInstructionManual();
        this.kitNameForTitle = "Untitled Kit";
        this.stepCounter = 1;
    }

    @Override
    public KitBuilder setKitId(String id) {
        // Manual có thể không cần ID trực tiếp, nhưng có thể dùng cho mục đích khác
        return this;
    }

    @Override
    public KitBuilder setKitName(String name) {
        this.kitNameForTitle = name;
        manual.setTitle("Assembly Instructions for: " + name);
        return this;
    }

    @Override
    public KitBuilder addPart(String partName, String partDescriptionForManual) {
        // Tạo một bước hướng dẫn dựa trên part và mô tả của nó
        manual.addInstructionStep("Step " + (stepCounter++) + ": " + partDescriptionForManual + " (Part: " + partName + ")");
        return this;
    }

    @Override
    public KitBuilder setDifficulty(String level) {
        manual.addInstructionStep("Note: This kit is rated for '" + level + "' difficulty.");
        return this;
    }

    @Override
    public KitBuilder setEstimatedSteps(int steps) {
        // Có thể dùng để kiểm tra hoặc thêm thông tin vào manual
        // manual.addInstructionStep("This kit has approximately " + steps + " assembly steps.");
        // Hoặc để đảm bảo stepCounter không vượt quá
        return this;
    }

    @Override
    public KitBuilder addSafetyWarning(String warning) {
        manual.addSafetyWarning(warning);
        return this;
    }

    @Override
    public KitBuilder addToolRequirement(String tool) {
        manual.addToolRequired(tool);
        return this;
    }

    public AssemblyInstructionManual getResult() {
        if (manual.getTitle() == null || manual.getTitle().isEmpty()) {
            manual.setTitle("Assembly Instructions for: " + this.kitNameForTitle);
        }
        AssemblyInstructionManual result = this.manual;
        this.reset(); // Quan trọng: reset builder
        return result;
    }
}