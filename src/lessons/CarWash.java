package lessons;

import lessons.vehicle.Car;

import java.util.List;

public class CarWash<W extends Car> {

    private List<W> service;

    public List<W> getService() {
        return service;
    }

    public void setService(List<W> service) {
        this.service = service;
    }
}
