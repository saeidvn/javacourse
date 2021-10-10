package lesson020304;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Metro extends Vehicle {

    private Wagon[] wagons;

    public Metro(int size,
                 String color,
                 LocalDateTime creationDate,
                 Person driver,
                 Wagon[] wagon
    ) {
        super(size, color, creationDate, driver);
        this.wagons = wagon;
    }

    public Wagon[] getWagon() {
        return this.wagons;
    }

    public void setWagon(Wagon[] wagons) {
        this.wagons = wagons;
    }

    @Override
    public String toString() {
        return "Metro{" +
                "wagons=" + Arrays.toString(wagons) +
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
        if (!super.equals(o)) return false;
        Metro metro = (Metro) o;
        return Arrays.equals(wagons, metro.wagons);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(wagons);
        return result;
    }
}
