package lessons.person;

public class CarDriver extends Person {

    public CarDriver(int age, String name, String surname, String hairColor, String eyeColor, int height,
                     int weight) {
        super(age, hairColor, eyeColor);
    }

    @Override
    public int something(int n1, int n2) {
        return 0;
    }

    @Override
    public String toString() {
        return "CarDriver{" +
                "age=" + getAge() +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", hairColor='" + getHairColor() + '\'' +
                ", eyeColor='" + getHairColor() + '\'' +
                ", height=" + getHeight() +
                ", weight=" + getWeight() +
                ", job='" + getJob() + '\'' +
                '}';
    }


}
