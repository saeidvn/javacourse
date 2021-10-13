package lessons;

import java.time.LocalDateTime;
import java.util.Objects;

public class Sedan extends Car implements Refuelable, IEngine, ISportCar {

    private int engineVolume = 0;
    private int cylinders = 0;
    private int speed = 0;
    private int gear = 1;
    private Boolean trunk;

    public Sedan(
            int size,
            String color,
            LocalDateTime creationDate,
            Person driver,
            String brand,
            String model,
            int door,
            int compartment,
            int passengers,
            Boolean trunk
    ) {
        super(size, color, creationDate, driver, brand, model, door, compartment, passengers, false);
        this.trunk = trunk;
    }

    public Boolean getTrunk() {
        return trunk;
    }

    public void setTrunk(Boolean trunk) {
        this.trunk = trunk;
    }

    @Override
    public void openTheFuelTank() {
        System.out.println("The fuel tank is opened.");
    }

    @Override
    public void refuelCar() {
        System.out.println("car is refueling...");
    }

    @Override
    public void closeTheFuelTank() {
        System.out.println("The fuel tank is closed.");
    }

    @Override
    public void engineVolume(int newValue) {
        engineVolume = newValue;
    }

    @Override
    public void cylinders(int newValue) {
        cylinders = newValue;
    }

    @Override
    public void changeGear(int newValue) {
        gear = newValue;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void body() {
    }

    @Override
    public void soundSystem() {
    }

    @Override
    public void wheels() {
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "engineVolume=" + engineVolume +
                ", cylinders=" + cylinders +
                ", speed=" + speed +
                ", gear=" + gear +
                ", trunk=" + trunk +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Sedan sedan = (Sedan) o;
        return engineVolume == sedan.engineVolume && cylinders == sedan.cylinders && Objects.equals(trunk, sedan.trunk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineVolume, cylinders, speed, gear, trunk);
    }
}