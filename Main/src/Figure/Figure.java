package Figure;

public abstract class Figure {
    private String color;
    public abstract double area();

    public abstract double perimetr();

    public Figure(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
