package Figure;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("red", 10, 10,10),
                new Triangle("green", 10, 20,30),
                new Triangle("blue", 30, 10,20),
                new Rectangle("red", 40,15),
                new Rectangle("yellow",30,13),
                new Circle("white",4),
                new Circle("red",4),
                new Circle("red",4)
        };
        System.out.println(calculateRedArea(figures));
        System.out.println(calculateRedPerimetr(figures));


    }

    public static double calculateRedPerimetr(Figure[] figures) {
        double sum = 0.0;
        for (Figure figure:figures) {
            if(figure.getColor().equals("red")) {
                sum += figure.perimetr();
            }
        }
        return sum;
    }


    public static double calculateRedArea(Figure[] figures) {
        double sum = 0.0;
        for (Figure figure:figures) {
            if(figure.getColor().equals("red")) {
                sum += figure.area();
            }
        }
        return sum;
    }
}
