import java.time.LocalDateTime;

public class Vehicle {

    private int size;
    private String color;
    private LocalDateTime creationDate;
    private Person driver;

    public Vehicle(int size, String color, LocalDateTime creationDate, Person driver) {
        this.size = size;
        this.color = color;
        this.creationDate = creationDate;
        this.driver = driver;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }
}
