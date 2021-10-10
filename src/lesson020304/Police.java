package lesson020304;

public class Police extends Person implements Football {

    int policeId;
    String policeName;

    public Police(int policeId, String policeName) {
        super(0,
                "name",
                "surname",
                "Hair color",
                "Eye color",
                0,
                0,
                "Policeman"
        );
        this.policeId = policeId;
        this.policeName = policeName;
    }
    public void showData() {
        System.out.println("Police ID is: " + policeId + " and " + "Police name is: " + policeName);
        System.out.println();
    }

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
    public void kick() {
        System.out.println("Shooting");
    }

    @Override
    public void headKick() {

    }

    @Override
    public void pass() {

    }

    @Override
    int something(int n1, int n2) {
        return 0;
    }

    @Override
    public String toString() {
        return "Police{" +
                "hairColor='" + hairColor + '\'' +
                '}';
    }
}
