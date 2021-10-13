package lessons;

import java.time.LocalDateTime;
import java.util.Objects;

public class Car extends Vehicle implements Refuelable {

    private String brand;
    private String model;
    private int door;
    private int compartment;
    private int passengers;
    private Boolean offRoad;

    public Car(int size,
               String color,
               LocalDateTime creationDate,
               Person driver,
               String brand,
               String model,
               int door,
               int compartment,
               int passengers,
               Boolean offRoad
    ) {
        super(size, color, creationDate, driver);
        this.brand = brand;
        this.model = model;
        this.door = door;
        this.compartment = compartment;
        this.passengers = passengers;
        this.offRoad = offRoad;
    }

    public Boolean isSuv() {
        return this.offRoad == true;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getCompartment() {
        return compartment;
    }

    public void setCompartment(int compartment) {
        this.compartment = compartment;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public Boolean getOffRoad() {
        return offRoad;
    }

    public void setOffRoad(Boolean offRoad) {
        this.offRoad = offRoad;
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
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", door=" + door +
                ", compartment=" + compartment +
                ", passengers=" + passengers +
                '}';
    }

    @Override
    int object(int o1, int o2, int o3) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return door == car.door && compartment == car.compartment && passengers == car.passengers && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, door, compartment, passengers);
    }
}
