import java.time.LocalDateTime;

public class MainClass {

    public static void  main(String[] args) {
        TicketCounter ticketCounter1 = new TicketCounter(
                21,
                "Roma",
                "Romanovic",
                "Black",
                "Brown",
                180,
                80
        );
        TicketControl ticketControl = new TicketControl(
                27,
                "Igor",
                "Igorovic",
                "Brown",
                "Black",
                175,
                90
        );
        Police police1 = new Police(
                30,
                "Viktor",
                "Viktorovic",
                "Black",
                "Black",
                170,
                65
        );
        SecurityGate securityGate1 = new SecurityGate(
                true, police1, 001
        );
        MetroDriver metroDriver1 = new MetroDriver(
                45,
                "Andy",
                "Carter",
                "Red",
                "Green",
                174,
                55
        );
        Wagon wagon1 = new Wagon(
                200,
                6
        );
        Metro metro1 = new Metro(
                100,
                "Gray",
                LocalDateTime.now(),
                metroDriver1,
                wagon1
        );
        MetroStation minsk = new MetroStation(
                1,
                ticketCounter1,
                ticketControl,
                securityGate1,
                metro1
        );

        System.out.println(minsk.getMetro().getDriver().getName());
        System.out.println(minsk.getMetro().getWagon().getNumber());
        System.out.println(minsk.getTicketCounter().toString());
        System.out.println(minsk.getSecurityGate().getPolice().toString());

        CarDriver carDriver1 = new CarDriver(
                35,
                "Jack",
                "Hamilton",
                "Sky",
                "Yellow",
                168,
                70
        );
        Suv suv = new Suv(
                100,
                "Purple",
                LocalDateTime.now(),
                carDriver1,
                "BMW",
                "X6",
                5,
                2,
                21,
                5,
                true
        );
        System.out.println(suv.equals(metro1));
        System.out.println(suv.hashCode());
    }

}
