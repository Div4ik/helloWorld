package Figure;

public class Triangle extends Figure{
    private int a;
    private int b;
    private int c;

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        Double p = this.perimetr();
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double perimetr() {
        return a + b + c;
    }
}
