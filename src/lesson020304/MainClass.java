package lesson020304;

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

        Wagon[] wagons = new Wagon[6];
        wagons[0] = new Wagon("Wagon", 01);
        wagons[1] = new Wagon("Wagon", 02);
        wagons[2] = new Wagon("Wagon", 03);
        wagons[3] = new Wagon("Wagon", 04);
        wagons[4] = new Wagon("Wagon", 05);
        wagons[5] = new Wagon("Wagon", 06);

        System.out.println("Wagon number 1: ");
        wagons[0].showData();

        Metro metro1 = new Metro(
                100,
                "Gray",
                LocalDateTime.now(),
                metroDriver1,
                wagons
        );
        MetroStation minsk = new MetroStation(
                1,
                ticketCounter1,
                ticketControl,
                securityGate1,
                metro1
        );
        minsk.getMetro().getWagon()[2].showData();
        System.out.println(minsk.getMetro().getDriver().getName());
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
                5
        );
        System.out.println(suv.equals(suv));
        System.out.println(suv.hashCode());

        Suv mySuv = new Suv(
                300,
                "Gray",
                LocalDateTime.now(),
                carDriver1,
                "Audi",
                "Q1",
                5,
                2,
                19,
                5
        );
        mySuv.openTheFuelTank();
        mySuv.refuelCar();
        mySuv.closeTheFuelTank();
        mySuv.isSuv();

        suv.equals(mySuv);
        System.out.println(suv.equals(mySuv));

        Person person = new Passenger(
                20,
                "Jax",
                "Jaxy",
                "Black",
                "White",
                190,
                120,
                new Ticket(LocalDateTime.now(), 1)
        );
        Passenger passenger = new Passenger(
                44,
                "Sonia",
                "Jackson",
                "Gold",
                "Sky",
                175,
                60,
                new Ticket(
                        LocalDateTime.of(
                                2023,
                                9,
                                10,
                                0,
                                0,
                                0,
                                0),
                        12
                )
        );
        System.out.println(passenger.getTicket().getExpireDate());
        System.out.println(passenger);
        System.out.println(suv);


        Police[] policeMan = new Police[6];

        for (int i = 0; i < 6; i++) {
            policeMan[i] = new Police(i+1,"Policeman " + i);
            System.out.println(policeMan);
        }

        System.out.println("Policeman: ");
        policeMan[0].showData();
        minsk.getSecurityGate().getPolice();
    }

}
