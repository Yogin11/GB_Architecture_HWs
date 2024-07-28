package org.example.store3D.models;

public class Camera {

    private Point3D location;
    private Angle3D angle;

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public void rotate (Angle3D angle3D) {
        this.angle = this.angle.sumAngles(angle3D);
    }

    public void move (Point3D point) {
        this.location.setX(point.getX());
        this.location.setY(point.getY());
        this.location.setZ(point.getZ());
    }

    @Override
    public String toString() {
        return "Camera{" +
                "location=" + location +
                ", angle=" + angle +
                '}';
    }
}
