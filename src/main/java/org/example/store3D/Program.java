package org.example.store3D;

import org.example.store3D.in_memory_model.ModelStore;
import org.example.store3D.in_memory_model.Observer1;
import org.example.store3D.models.*;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Point3D firstPoint = new Point3D(100, 200, 150);
        Point3D secondPoint = new Point3D(50, 100, 150);
        Point3D thirdPoint = new Point3D(50, 100, 300);
        Angle3D angle1 = new Angle3D(30 ,45);
        Angle3D angle2 = new Angle3D(120 ,30);
        Color color1 = new Color("Yellow");

        Polygon pol1 = new Polygon(List.of(firstPoint, secondPoint, thirdPoint));
        List<Polygon> polygons = new ArrayList<>();
        polygons.add(pol1);

        PolygonalModel polygonalModel1 = new PolygonalModel("модель №5", polygons);
        List<PolygonalModel> modelsList = new ArrayList<>();
        modelsList.add(polygonalModel1);

        Flash flash1 = new Flash(firstPoint, angle1, color1, 220);
        System.out.println("Flash id = " + flash1.getId());
        Camera camera1 = new Camera(thirdPoint, angle2);
        Scene scene1 = new Scene(modelsList,List.of(camera1));

        ModelStore store = new ModelStore(
                modelsList,
                List.of(flash1),
                List.of(camera1),
                List.of(scene1));

        Observer1 observer1 = new Observer1("Наблюдатель за полигональными моделями");
        store.RegisterModelChangerObserver(new Observer1("Наблюдатель за полигональными моделями"));
//        store.add(polygonalModel);

        System.out.println(store);
    }
}
