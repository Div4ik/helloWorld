package Transports;

import java.awt.event.MouseWheelListener;

public class ServiceStation {
    public void check(Car car) {
            checkWheeledTransport(car);
            checkEngine(car);

    }

    public void check (Truck truck) {
        checkWheeledTransport(truck);
        checkEngine(truck);
        truck.checkTrailer();
    }

    public void check(Bicycle bicycle) {
        checkWheeledTransport(bicycle);

    }


    public void checkWheeledTransport (WheeledTransport wheeledTransport) {
        System.out.println("Обслуживаем " + wheeledTransport.getModelName());
        for (int i = 0; i < wheeledTransport.getWheelsCount(); i++) {
            wheeledTransport.updateTyre();
        }
    }

    private void checkEngine(Enginable enginable) {
        enginable.checkEngine();
    }
}
