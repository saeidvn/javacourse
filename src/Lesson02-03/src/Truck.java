import java.time.LocalDateTime;

public class Truck extends Car {

    private String type;
    private int height;

    public Truck(
            int size,
            String color,
            LocalDateTime creationDate,
            Person driver,
            String brand,
            String model,
            int door,
            int compartment,
            int passengers,
            String type,
            int height
    ) {
        super(size, color, creationDate, driver, brand, model, door, compartment, passengers);
        this.type = type;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
