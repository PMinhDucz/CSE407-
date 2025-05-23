/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.builderpattern;

/**
 *
 * @author ADMIN
 */
// AssemblyDemo.java
import com.mycompany.builderpattern.ActualKitBuilder;
import com.mycompany.builderpattern.InstructionManualBuilder;
import com.mycompany.builderpattern.KitDirector;
import com.mycompany.builderpattern.AssemblyInstructionManual;
import com.mycompany.builderpattern.AssemblyKit;


//import com.warehouse.assembly.builders.ActualKitBuilder;
//import com.warehouse.assembly.builders.InstructionManualBuilder;
//import com.warehouse.assembly.director.KitDirector;
//import com.warehouse.assembly.products.AssemblyInstructionManual;
//import com.warehouse.assembly.products.AssemblyKit;

public class BuilderPattern {
    public static void main(String[] args) {
        KitDirector director = new KitDirector();

        // --- Tạo bộ kit máy bay đơn giản ---
        System.out.println("CONSTRUCTING SIMPLE AIRPLANE KIT:");
        ActualKitBuilder actualKitBuilder = new ActualKitBuilder();
        director.constructSimpleAirplaneKit(actualKitBuilder);
        AssemblyKit airplaneKit = actualKitBuilder.getResult();
        System.out.println(airplaneKit);

        InstructionManualBuilder manualBuilder = new InstructionManualBuilder();
        director.constructSimpleAirplaneKit(manualBuilder); // Dùng cùng director method
        AssemblyInstructionManual airplaneManual = manualBuilder.getResult();
        System.out.println(airplaneManual);
        System.out.println("-------------------------------------\n");


        // --- Tạo bộ kit robot phức tạp ---
        System.out.println("CONSTRUCTING ADVANCED ROBOT KIT:");
        // Có thể tái sử dụng actualKitBuilder và manualBuilder vì chúng được reset
        director.constructAdvancedRobotKit(actualKitBuilder);
        AssemblyKit robotKit = actualKitBuilder.getResult();
        System.out.println(robotKit);

        director.constructAdvancedRobotKit(manualBuilder); // Dùng cùng director method
        AssemblyInstructionManual robotManual = manualBuilder.getResult();
        System.out.println(robotManual);
        System.out.println("-------------------------------------\n");

        // --- Client tự xây dựng một manual (không dùng Director) ---
        System.out.println("CLIENT MANUALLY BUILDS A CUSTOM MANUAL:");
        InstructionManualBuilder customManualBuilder = new InstructionManualBuilder();
        customManualBuilder.setKitName("My Custom Drone")
                           .addPart("Frame", "Assemble the drone Frame.")
                           .addPart("Motor1", "Mount Motor 1.")
                           .addToolRequirement("Hex Keys")
                           .addSafetyWarning("Fly responsibly.");
        AssemblyInstructionManual customManual = customManualBuilder.getResult();
        System.out.println(customManual);
        System.out.println("-------------------------------------\n");
    }
}