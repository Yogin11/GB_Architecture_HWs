package org.example.store3D.models;

import java.util.List;

public class PolygonalModel {

    private String polModelName;
    private List<Polygon> polygons;
    private List<Texture> textures;

    public PolygonalModel(String polModelName, List<Polygon> polygons) {
        this.polModelName = polModelName;
        this.polygons = polygons;
    }


    public PolygonalModel(List<Polygon> polygons, List<Texture> textures) {
        this.polygons = polygons;
        this.textures = textures;
    }

    public List<Polygon> getPolygons() {
        return polygons;
    }

    public List<Texture> getTextures() {
        return textures;
    }

    public String getPolModelName() {
        return polModelName;
    }

    @Override
    public String toString() {
        return "PolygonalModel{" +
                "polModelName='" + polModelName + '\'' +
                ", polygons=" + polygons +
                ", textures=" + textures +
                '}';
    }
}

