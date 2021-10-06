import java.time.LocalDateTime;

public class Car extends Vehicle {

    private String brand;
    private String model;
    private int door;
    private int compartment;
    private int passengers;

    public Car(int size,
               String color,
               LocalDateTime creationDate,
               Person driver,
               String brand,
               String model,
               int door,
               int compartment,
               int passengers
    ) {
        super(size, color, creationDate, driver);
        this.brand = brand;
        this.model = model;
        this.door = door;
        this.compartment = compartment;
        this.passengers = passengers;
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
}
