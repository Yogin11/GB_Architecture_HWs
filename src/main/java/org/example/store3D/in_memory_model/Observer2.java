package org.example.store3D.in_memory_model;

public class Observer2 implements IModelChangedObserver{
private String nameObserver;

    public Observer2(String nameObserver) {
        this.nameObserver = nameObserver;
    }
    @Override
    public void applyUpdateModel(String modelName) {
        System.out.println("Была добавлена новая модель" + modelName);

    }
}
