import java.time.LocalDateTime;

public class Metro extends Vehicle {

    private Wagon wagon;

    public Metro(int size,
                 String color,
                 LocalDateTime creationDate,
                 Person driver,
                 Wagon wagon
    ) {
        super(size, color, creationDate, driver);
        this.wagon = wagon;
    }

    public Wagon getWagon() {
        return wagon;
    }

    public void setWagon(Wagon wagon) {
        this.wagon = wagon;
    }

}
