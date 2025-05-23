/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builderpattern;

/**
 *
 * @author ADMIN
 */
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class AssemblyKit {
    private String id;
    private String name;
    private List<String> parts;
    private String difficultyLevel;
    private int estimatedSteps;

    public AssemblyKit() {
        this.parts = new ArrayList<>();
    }

    // Setters (sẽ được gọi bởi Builder)
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void addPart(String part) { this.parts.add(part); }
    public void setDifficultyLevel(String difficultyLevel) { this.difficultyLevel = difficultyLevel; }
    public void setEstimatedSteps(int estimatedSteps) { this.estimatedSteps = estimatedSteps; }

    @Override
    public String toString() {
        StringJoiner partsJoiner = new StringJoiner(", ", "[", "]");
        for (String part : parts) {
            partsJoiner.add("'" + part + "'");
        }
        return "AssemblyKit {" +
                "\n  id='" + id + '\'' +
                ",\n  name='" + name + '\'' +
                ",\n  parts=" + partsJoiner.toString() +
                ",\n  difficultyLevel='" + difficultyLevel + '\'' +
                ",\n  estimatedSteps=" + estimatedSteps +
                "\n}";
    }
}