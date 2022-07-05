import java.awt.*;

public class Sphere extends Shape{
    public double radius;

    public Sphere(Point center, double radius) {
        this.position = center;
        this.radius = radius;
    }

    @Override
    double surface_area() {
        return (4.0 * Math.PI * Math.pow(radius, 2.0));
    }

    @Override
    double volume() {
        return (4.0 / 3.0 * Math.PI * (Math.pow(radius, 3.0)));
    }

    @Override
    public String toString() {
        return "Sphere Surface Area: " + surface_area() +
                "\nSphere Volume: " + volume() +
                "\nSphere is at: " +
                "x= " + position.getX() +
                " y= " + position.getY() + "\n";
    }
}

