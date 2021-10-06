import java.time.LocalDateTime;

public class Sedan extends Car {

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
        super(size, color, creationDate, driver, brand, model, door, compartment, passengers);
        this.trunk = trunk;
    }

    public Boolean getTrunk() {
        return trunk;
    }

    public void setTrunk(Boolean trunk) {
        this.trunk = trunk;
    }



}