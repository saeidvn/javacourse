package lessons;

import java.time.LocalDateTime;
import java.util.Objects;

public class Suv extends Car implements Refuelable, IEngine, ISportCar {

    private int engineVolume = 3500;
    private int cylinders = 8;
    private int speed = 280;
    private int gear = 6;
    private int tireSize;

    public Suv(
            int size,
            String color,
            LocalDateTime creationDate,
            Person driver,
            String brand,
            String model,
            int door,
            int compartment,
            int tireSize,
            int passengers
    ) {
        super(size, color, creationDate, driver, brand, model, door, compartment, passengers, true);
        this.tireSize = tireSize;
    }

    public int getTireSize() {
        return tireSize;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
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
    public void body() {
    }

    @Override
    public void soundSystem() {
    }

    @Override
    public void wheels() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Suv suv = (Suv) o;
        return tireSize == suv.tireSize && this.getOffRoad().equals(suv.getOffRoad());
    }

    @Override
    public int hashCode() {
        return Objects.hash(tireSize, this.getOffRoad());
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
    public String toString() {
        return "Suv{" +
                "engineVolume=" + engineVolume +
                ", cylinders=" + cylinders +
                ", speed=" + speed +
                ", gear=" + gear +
                ", tireSize=" + tireSize +
                ", offRoad=" + this.getOffRoad() +
                '}';
    }
}
