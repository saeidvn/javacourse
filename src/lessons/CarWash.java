package lessons;

import lessons.vehicle.Car;

import java.util.List;

public class CarWash<W extends Car> {

    private List<W> services;

    public List<W> getServices() {
        return services;
    }

    public void setServices(List<W> services) {
        this.services = services;
    }
}
