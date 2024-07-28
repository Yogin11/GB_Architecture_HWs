package org.example.store3D.models;

public class Flash {

    public static int counter = 0;
    private int id;
    private Point3D location;
    private Angle3D angle;
    private Color color;
    private float power;

    {
        id = ++counter;
    }
    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public void rotate (Angle3D angle3D) {
        this.angle = this.angle.sumAngles(angle3D);
    }

    public void move (Point3D point) {
            this.location.setX(point.getX());
            this.location.setY(point.getY());
            this.location.setZ(point.getZ());
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Flash{" +
                "id=" + id +
                ", location=" + location +
                ", angle=" + angle +
                ", color=" + color +
                ", power=" + power +
                '}';
    }
}
