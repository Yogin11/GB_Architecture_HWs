package org.example.store3D.in_memory_model;

public class Observer1 implements IModelChangedObserver{

    private String nameObserver;

    public Observer1(String nameObserver) {
        this.nameObserver = nameObserver;
        System.out.println("Создан: " + this.nameObserver);
    }

    @Override
    public void applyUpdateModel(String modelName) {
        System.out.println(nameObserver + " сообщает: была добавлена новая полигональная модель:" + modelName);
    }

    @Override
    public String toString() {
        return "Observer1{" +
                "nameObserver='" + nameObserver + '\'' +
                '}';
    }
}
