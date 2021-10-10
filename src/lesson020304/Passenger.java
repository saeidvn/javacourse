package lesson020304;

import java.util.Objects;

public class Passenger extends Person implements Human {

    private Ticket ticket;

    public Passenger(int age,
                     String name,
                     String surname,
                     String hairColor,
                     String eyeColor,
                     int height,
                     int weight,
                     Ticket ticket
    ) {
        super(age, name, surname, hairColor, eyeColor, height, weight, "Passenger");
        this.ticket = ticket;
    }

    @Override
    public void walk() {
        System.out.println("Walking");
    }

    @Override
    public void run() {
        System.out.println("Running");
    }

    @Override
    public void talk() {
        System.out.println("Talking");
    }

    @Override
    int something(int n1, int n2) {
        return 0;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }



    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return Objects.equals(ticket, passenger.ticket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticket);
    }
}
