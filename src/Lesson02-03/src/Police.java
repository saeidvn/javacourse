public class Police extends Person {

    public Police(int age,
                  String name,
                  String surname,
                  String hairColor,
                  String eyeColor,
                  int height,
                  int weight
    ) {
        super(age, name, surname, hairColor, eyeColor, height, weight, "Police");
    }

    @Override
    public String toString() {
        return "Police{" +
                "hairColor='" + hairColor + '\'' +
                '}';
    }
}
