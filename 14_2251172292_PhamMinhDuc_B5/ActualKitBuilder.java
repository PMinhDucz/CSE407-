/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builderpattern;

/**
 *
 * @author ADMIN
 */
// ActualKitBuilder.java

import com.mycompany.builderpattern.AssemblyKit;
        
        //.assembly.products.AssemblyKit;

public class ActualKitBuilder implements KitBuilder {
    private AssemblyKit kit;

    public ActualKitBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.kit = new AssemblyKit();
    }

    @Override
    public KitBuilder setKitId(String id) {
        kit.setId(id);
        return this;
    }

    @Override
    public KitBuilder setKitName(String name) {
        kit.setName(name);
        return this;
    }

    @Override
    public KitBuilder addPart(String partName, String partDescriptionForManual) {
        kit.addPart(partName); // ActualKit chỉ cần tên part
        return this;
    }

    @Override
    public KitBuilder setDifficulty(String level) {
        kit.setDifficultyLevel(level);
        return this;
    }

    @Override
    public KitBuilder setEstimatedSteps(int steps) {
        kit.setEstimatedSteps(steps);
        return this;
    }

    @Override
    public KitBuilder addSafetyWarning(String warning) {
        // AssemblyKit có thể không lưu trực tiếp cảnh báo, nó thuộc về Manual
        return this;
    }

    @Override
    public KitBuilder addToolRequirement(String tool) {
        // AssemblyKit có thể không lưu trực tiếp yêu cầu công cụ
        return this;
    }

    public AssemblyKit getResult() {
        AssemblyKit result = this.kit;
        this.reset(); // Quan trọng: reset builder để có thể tái sử dụng
        return result;
    }
}