package Figure;

public class Circle extends Figure{
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;

    }

    @Override
    public double area() {
        double pi = Math.PI;

        return pi * radius * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {

        return radius;
    }

    @Override
    public double perimetr() {
        double pi = Math.PI;
        return 2 * pi * radius;
    }
}
