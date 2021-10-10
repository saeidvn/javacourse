package lesson020304;

import java.util.Objects;

public class Wagon {

    String wagonName;
    int wagonId;

    public Wagon(String wagonName, int wagonId) {
        this.wagonName = wagonName;
        this.wagonId = wagonId;
    }

    public void showData() {
        System.out.println("Wagon Name is: " + wagonName + ", " + "Wagon Id is: " + wagonId);
        System.out.println();
    }

    private int seats;
    private int number;

    public Wagon(int seats, int number) {
        this.seats = seats;
        this.number = number;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Wagon{" +
                "seats=" + seats +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wagon wagon = (Wagon) o;
        return seats == wagon.seats && number == wagon.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(seats, number);
    }
}