import java.time.LocalDateTime;
import java.util.Objects;

public class Suv extends Car {

    private int tireSize;
    private Boolean OffRoad;

    public Suv(int size,
               String color,
               LocalDateTime creationDate,
               Person driver,
               String brand,
               String model,
               int door,
               int compartment,
               int tireSize,
               int passengers,
               Boolean offRoad
    ) {
        super(size, color, creationDate, driver, brand, model, door, compartment, passengers);
        this.tireSize = tireSize;
        OffRoad = offRoad;
    }

    public int getTireSize() {
        return tireSize;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public Boolean getOffRoad() {
        return OffRoad;
    }

    public void setOffRoad(Boolean offRoad) {
        OffRoad = offRoad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Suv suv = (Suv) o;
        return tireSize == suv.tireSize && OffRoad.equals(suv.OffRoad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tireSize, OffRoad);
    }
}
