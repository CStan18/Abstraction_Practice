import java.awt.*;

public class Cone extends Shape{
    public double radius, height;

    public Cone(Point center, double radius, double height) {
        this.position = center;
        this.radius = radius;
        this.height = height;
    }
    @Override
    double surface_area() {
        return (Math.PI * radius *
                (radius + Math.sqrt(Math.pow(height, 2.0) +
                Math.pow(radius, 2.0))));
    }

    @Override
    double volume() {
        return (Math.PI * Math.pow(radius, 2.0) * (height / 3.0));
    }

    @Override
    public String toString() {
        return "Cone Surface Area: " + surface_area() +
                "\nCone Volume: " + volume() +
                "\nCone is at: " +
                "x= " + position.getX() +
                " y= " + position.getY() + "\n";
    }
}
