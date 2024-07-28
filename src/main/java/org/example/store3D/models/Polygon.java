package org.example.store3D.models;

import java.util.List;

public class Polygon {
    private List<Point3D> points;

    public Polygon() {
    }

    public Polygon(List<Point3D> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "points=" + points +
                '}';
    }
}
