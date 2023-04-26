package Transports;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("VAZ", 4);
        Car car2 = new Car("UAZ", 4);

        Truck truck = new Truck("Volvo", 8);
        Truck truck2 = new Truck("GAZ", 6);

        Bicycle bicycle = new Bicycle("Kama", 2);
        Bicycle bicycle2 = new Bicycle("Аист", 2);


        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
    }
}
