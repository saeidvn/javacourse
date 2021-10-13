package lessons;

public class TicketControl extends Person{

    public TicketControl(int age,
                         String name,
                         String surname,
                         String hairColor,
                         String eyeColor,
                         int height,
                         int weight
    ) {
        super(age, name, surname, hairColor, eyeColor, height, weight, "Ticket Control");
    }

    @Override
    int something(int n1, int n2) {
        return 0;
    }

    @Override
    public String toString() {
        return "TicketControl{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", job='" + getJob() + '\'' +
                '}';
    }
}
