package org.example.store3D.in_memory_model;

public interface IModelChanger {
    /**
     * Произошло изменение в хранилище моделей
     */
    void notifyChange(String modelName);

    void RegisterModelChangerObserver(IModelChangedObserver o);

    void RemoveModelChangerObserver(IModelChangedObserver o);

}
