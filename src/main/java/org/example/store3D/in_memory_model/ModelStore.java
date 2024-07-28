package org.example.store3D.in_memory_model;

import org.example.store3D.models.Camera;
import org.example.store3D.models.Flash;
import org.example.store3D.models.PolygonalModel;
import org.example.store3D.models.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{

    private List<IModelChangedObserver> observers = new ArrayList<>();
    private List<PolygonalModel> models = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();

    private List<Camera> cameras = new ArrayList<>();
    private List<Scene> scenes = new ArrayList<>();

    public ModelStore(List<PolygonalModel> models, List<Flash> flashes, List<Camera> cameras, List<Scene> scenes) {
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
        this.scenes = scenes;
    }

    public Scene getScene(int sceneId) {
        return scenes.stream().filter(scene -> scene.getId() == sceneId).findFirst().orElse(null);
    }
    public void add(PolygonalModel model) {
        models.add(model);
        notifyChange(model.getPolModelName());
    }
    @Override
    public void notifyChange(String modelName) {
        for (IModelChangedObserver observer: observers) {
            observer.applyUpdateModel(modelName);
        }
    }

    @Override
    public void RegisterModelChangerObserver(IModelChangedObserver o) {
        observers.add(o);
    }

    @Override
    public void RemoveModelChangerObserver(IModelChangedObserver o) {
        observers.remove(o);
    }

    @Override
    public String toString() {
        return "ModelStore{" +
                "observers=" + observers + "\n" +
                ", models=" + models + "\n" +
                ", flashes=" + flashes + "\n" +
                ", cameras=" + cameras + "\n" +
                ", scenes=" + scenes +
                '}';
    }
}
