import java.awt.*;
import java.sql.Array;

public class ShapeArray {

    public static final int SHAPEARRAYSIZE = 3;
    static Shape[] shapesArray = new Shape[SHAPEARRAYSIZE];

    public static void CreateShapes() {
        Sphere mySphere = new Sphere(new Point(1, 1), 1.0);
        Cylinder myCylinder = new Cylinder(new Point(2, 2), 1, 1);
        Cone myCone = new Cone(new Point(3, 3), 1, 1);

        shapesArray[0] = mySphere;
        shapesArray[1] = myCylinder;
        shapesArray[2] = myCone;

        for (int i = 0; i < shapesArray.length; i++) {
            System.out.println(shapesArray[i].toString());
        }
    }
}
