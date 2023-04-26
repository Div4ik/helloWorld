package Figure;

public class Rectangle extends Figure{
    private int width;
    private int heigth;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    public int getWidth() {
        return width;
    }

    public Rectangle(String color, int width, int heigth) {
        super(color);
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public double area() {
        return width * heigth;
    }

    @Override
    public double perimetr() {
        return (width + heigth) * 2;
    }
}
