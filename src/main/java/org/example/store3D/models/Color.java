package org.example.store3D.models;

public class Color {

    private int id;
    private String colorName;
    private String description;

    public Color(String colorName) {
        this.colorName = colorName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColorName() {
        return colorName;
    }

    public String getDescription() {
        return description;
    }
}
