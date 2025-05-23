/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builderpattern;

/**
 *
 * @author ADMIN
 */
// KitDirector.java

import com.mycompany.builderpattern.KitBuilder;

public class KitDirector {

    public void constructSimpleAirplaneKit(KitBuilder builder) {
        builder.reset();
        builder.setKitId("AP001");
        builder.setKitName("Simple Glider Airplane");
        builder.setDifficulty("Easy");
        builder.setEstimatedSteps(5);

        builder.addPart("Fuselage", "Take the main body (Fuselage).");
        builder.addPart("MainWing", "Attach the Main Wing to the top of the Fuselage.");
        builder.addPart("TailWing", "Attach the Tail Wing to the rear of the Fuselage.");
        builder.addPart("Stabilizer", "Attach the Stabilizer fin to the Tail Wing.");
        builder.addPart("NoseWeight", "Add the Nose Weight to the front for balance.");

        builder.addToolRequirement("Glue (optional)");
        builder.addSafetyWarning("Be careful with small parts if children are present.");
    }

    public void constructAdvancedRobotKit(KitBuilder builder) {
        builder.reset();
        builder.setKitId("RB007");
        builder.setKitName("Advanced Battle Robot X");
        builder.setDifficulty("Hard");
        builder.setEstimatedSteps(50); // Nhiều bước hơn

        builder.addPart("Chassis", "Prepare the main robot Chassis.");
        builder.addPart("LeftLegAssembly", "Assemble the Left Leg components and attach to Chassis.");
        builder.addPart("RightLegAssembly", "Assemble the Right Leg components and attach to Chassis.");
        builder.addPart("TorsoUnit", "Mount the Torso Unit onto the Chassis.");
        builder.addPart("ArmLeft", "Attach the Left Arm to the Torso Unit.");
        builder.addPart("ArmRight", "Attach the Right Arm to the Torso Unit.");
        builder.addPart("HeadSensorArray", "Install the Head Sensor Array on top of the Torso.");
        builder.addPart("PowerCore", "Insert the Power Core into the designated slot in the Torso.");
        // ... nhiều part và bước hơn nữa ...

        builder.addToolRequirement("Screwdriver Set");
        builder.addToolRequirement("Wire Strippers");
        builder.addToolRequirement("Soldering Iron (optional, for advanced mods)");
        builder.addSafetyWarning("Work in a well-ventilated area if soldering.");
        builder.addSafetyWarning("Follow wiring diagrams carefully to avoid short circuits.");
    }
}
