/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builderpattern;

/**
 *
 * @author ADMIN
 */
// AssemblyInstructionManual.java

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class AssemblyInstructionManual {
    private String title;
    private List<String> instructionSteps;
    private List<String> safetyWarnings;
    private List<String> toolsRequired;

    public AssemblyInstructionManual() {
        this.instructionSteps = new ArrayList<>();
        this.safetyWarnings = new ArrayList<>();
        this.toolsRequired = new ArrayList<>();
    }

    // Setters
    public void setTitle(String title) { this.title = title; }
    public void addInstructionStep(String step) { this.instructionSteps.add(step); }
    public void addSafetyWarning(String warning) { this.safetyWarnings.add(warning); }
    public void addToolRequired(String tool) { this.toolsRequired.add(tool); }
    
    
    public String getTitle() {
        return this.title;
    }
    @Override
    public String toString() {
        StringJoiner stepsJoiner = new StringJoiner("\n    - ", "\n    - ", "");
        if (instructionSteps.isEmpty()) stepsJoiner.add("No steps defined."); else instructionSteps.forEach(stepsJoiner::add);

        StringJoiner warningsJoiner = new StringJoiner(", ", "[", "]");
        if (safetyWarnings.isEmpty()) warningsJoiner.add("None"); else safetyWarnings.forEach(warningsJoiner::add);

        StringJoiner toolsJoiner = new StringJoiner(", ", "[", "]");
        if (toolsRequired.isEmpty()) toolsJoiner.add("None specified"); else toolsRequired.forEach(toolsJoiner::add);

        return "AssemblyInstructionManual {" +
                "\n  title='" + title + '\'' +
                ",\n  instructionSteps:" + (instructionSteps.isEmpty() ? " No steps defined." : stepsJoiner.toString()) +
                ",\n  safetyWarnings=" + warningsJoiner.toString() +
                ",\n  toolsRequired=" + toolsJoiner.toString() +
                "\n}";
    }
}