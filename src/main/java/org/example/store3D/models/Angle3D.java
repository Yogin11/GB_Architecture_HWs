package org.example.store3D.models;

public class Angle3D {

    private double angle2DXY;
    private double angleZ;

    public Angle3D(double angle2DXY, double angleZ) {
        this.angle2DXY = angle2DXY;
        this.angleZ = angleZ;
    }

    public Angle3D sumAngles(Angle3D otherAngle3D) {
        double newXYangle = this.angle2DXY + otherAngle3D.angle2DXY;
        if (newXYangle > 360) newXYangle = newXYangle - 360;
        double newAngleZ = this.angleZ + otherAngle3D.angleZ;
        if (newAngleZ > 360) newAngleZ = newAngleZ - 360;

        return new Angle3D(newXYangle, newAngleZ);
    }


    public double getAngle2DXY() {
        return angle2DXY;
    }

    public void setAngle2DXY(double angle2DXY) {
        this.angle2DXY = angle2DXY;
    }

    public double getAngleZ() {
        return angleZ;
    }

    public void setAngleZ(double angleZ) {
        this.angleZ = angleZ;
    }

    @Override
    public String toString() {
        return "Angle3D{" +
                "angle2DXY=" + angle2DXY +
                ", angleZ=" + angleZ +
                '}';
    }
}
