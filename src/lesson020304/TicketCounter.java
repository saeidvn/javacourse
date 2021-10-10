package lesson020304;

public class TicketCounter extends Person {

    public TicketCounter(int age,
                         String name,
                         String surname,
                         String hairColor,
                         String eyeColor,
                         int height,
                         int weight
    ) {
        super(age, name, surname, hairColor, eyeColor, height, weight, "Ticket Counter");
    }

    @Override
    int something(int n1, int n2) {
        return 0;
    }

    @Override
    public String toString() {
        return "TicketCounter{" +
                "surname='" + surname + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
