public class Passenger extends Person {

    private Ticket ticket;

    public Passenger(int age,
                     String name,
                     String surname,
                     String hairColor,
                     String eyeColor,
                     int height,
                     int weight,
                     Ticket ticket) {
        super(age, name, surname, hairColor, eyeColor, height, weight, "Passenger");
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
