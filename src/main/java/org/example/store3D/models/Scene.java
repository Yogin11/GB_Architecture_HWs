package org.example.store3D.models;

import java.util.List;

public class Scene {

    private static int counter = 0;
    private int id;
    private List<PolygonalModel> models;
    private List<Flash> flashes;

    private List<Camera> cameras;



    {
        id = ++counter;
    }

    public Scene(List<PolygonalModel> models, List<Camera> cameras) {
        this.models = models;
        this.cameras = cameras;

    }

    public int getId() {
        return id;
    }

    public List<PolygonalModel> getModels() {
        return models;
    }

    public void setModels(List<PolygonalModel> models) {
        this.models = models;
    }

    public List<Flash> getFlashes() {
        return flashes;
    }

    public void setFlashes(List<Flash> flashes) {
        this.flashes = flashes;
    }

    public List<Camera> getCameras() {
        return cameras;
    }

    public void setCameras(List<Camera> cameras) {
        this.cameras = cameras;
    }

    public Type method1(Type scenario) {
        //TODO logic
        return new Type();
    }
    public Type method2(Type scenario1, Type scenario2) {
        //TODO logic
        return new Type();
    }

    @Override
    public String toString() {
        return "Scene{" +
                "id=" + id +
                ", models=" + models +
                ", flashes=" + flashes +
                ", cameras=" + cameras +
                '}';
    }
}
