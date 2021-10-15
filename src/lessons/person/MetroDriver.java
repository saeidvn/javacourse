package lessons.person;

public class MetroDriver extends Person {

    public MetroDriver(int age, String name, String surname, String hairColor, String eyeColor, int height,
                       int weight) {
        super(age, hairColor, eyeColor);
    }

    @Override
    public int something(int n1, int n2) {
        return 0;
    }

    @Override
    public String toString() {
        return "MetroDriver{" +
                "age=" + getAge() +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", job='" + getJob() + '\'' +
                '}';
    }
}
