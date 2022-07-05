import java.awt.*;

public class Cylinder extends Shape{
    public double radius, height;

    public Cylinder(Point center, double radius, double height) {
        this.position = center;
        this.height = radius;
        this.radius = height;
    }

    @Override
    double surface_area() {
        return (2.0 * Math.PI * radius * height + 2.0 * Math.PI *
                Math.pow(radius, 2.0));
    }

    @Override
    double volume() {
        return (Math.PI * Math.pow(radius, 2.0) * height);
    }

    @Override
    public String toString() {
        return "Cylinder Surface Area: " + surface_area() +
                "\nCylinder Volume: " + volume() +
                "\nCylinder is at: " +
                "x= " + position.getX() +
                " y= " + position.getY() + "\n";
    }
}
