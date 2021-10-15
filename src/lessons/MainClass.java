package lessons;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import lessons.person.*;
import lessons.vehicle.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {

    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    private static final Logger LOGGER = LogManager.getLogger(MainClass.class);

    public static void main(String[] args) {

        TicketCounter ticketCounter1 = new TicketCounter(21, "Roma", "Romanovic",
                "Black", "Brown", 180, 80);
        TicketControl ticketControl = new TicketControl(27, "Igor", "Igorovic",
                "Brown", "Black", 175, 90);
        Police police1 = new Police(30, "Viktor", "Viktorovic", "Black",
                "Black", 170, 65);

        List<String> gateList = new ArrayList<>();
        SecurityGate securityGate1 = new SecurityGate(1);

        MetroDriver metroDriver1 = new MetroDriver(45,
                "Andy", "Carter", "Red", "Green", 174, 55);
        Wagon wagon1 = new Wagon(200, 6);

        List<String> wagonList = new ArrayList<>();
        wagonList.add("Wagon n1");
        wagonList.add("Wagon n2");
        wagonList.add("Wagon n3");

        Wagon[] wagons = new Wagon[6];
        wagons[0] = new Wagon("Wagon", 01);
        wagons[1] = new Wagon("Wagon", 02);
        wagons[2] = new Wagon("Wagon", 03);
        wagons[3] = new Wagon("Wagon", 04);
        wagons[4] = new Wagon("Wagon", 05);
        wagons[5] = new Wagon("Wagon", 06);

        LOGGER.debug("Wagon number 1: ");
        wagons[0].showData();

        Metro metro1 = new Metro();

        MetroStation minsk = new MetroStation(1, metro1);
        minsk.getMetro().getWagons().get(2);
        LOGGER.debug(minsk.getMetro().getDriver().getName());
        LOGGER.debug(minsk.getTicketCounter().toString());
        LOGGER.debug(minsk.getSecurityGate().getPolice().toString());

        CarDriver carDriver1 = new CarDriver(35, "Jack", "Hamilton",
                "Sky", "Yellow", 168, 70);
        Suv suv = new Suv(100, "Purple", LocalDateTime.now(), carDriver1, "BMW",
                "X6", 5, 2, 21, 5);
        LOGGER.debug(suv.equals(suv));
        LOGGER.debug(suv.hashCode());

        Suv mySuv = new Suv(300, "Gray", LocalDateTime.now(), carDriver1, "Audi",
                "Q1", 5, 2, 19, 5);
        mySuv.openTheFuelTank();
        mySuv.refuelCar();
        mySuv.closeTheFuelTank();
        mySuv.isSuv();

        suv.equals(mySuv);
        LOGGER.debug(suv.equals(mySuv));

        Person person = new Passenger(20, "Jax", "Jackson", "Black",
                "White", 190, 120, new Ticket(LocalDateTime.now(), 1));
        Passenger passenger = new Passenger(44, "Sonia", "Jackson", "Gold",
                "Sky", 175, 60,
                new Ticket(
                        LocalDateTime.of(2023, 9, 10, 0, 0,
                                0, 0), 12)
        );
        LOGGER.debug(passenger.getTicket().getExpireDate());
        LOGGER.debug(passenger);
        LOGGER.debug(suv);

        List<String> officers = new ArrayList<>();
        officers.add("First officer");
        officers.add("Second officer");
        officers.add("Third officer");

        Police[] policeMan = new Police[6];

        for (int i = 0; i < policeMan.length; i++) {
            policeMan[i] = new Police(i+1,"Policeman " + i);
            LOGGER.debug(policeMan);
        }

        LOGGER.debug("Policeman: ");
        policeMan[0].showData();
        minsk.getSecurityGate().getPolice();

        CarDriver human = new CarDriver(17, "Chris", "Redfield", "Gold",
                "Blue", 187, 90);
        LOGGER.debug(human);

        BodyObject frontSpoiler = new BodyObject();
        BodyObject rearSpoiler = new BodyObject();
        BodyObject frontTire = new BodyObject();
        BodyObject rearTire = new BodyObject();
        BodyObject[] bodyObjects = {frontSpoiler, rearSpoiler, frontTire, rearTire};
        AudioObject speaker = new AudioObject();
        Store<BodyObject, AudioObject, BodyObject> store = new Store<>();
        store.setData(bodyObjects);
        store.setOtherData(speaker);

        Map<String, BodyObject> objects = new HashMap<>();
        objects.put("frontSpoiler", frontSpoiler);
        objects.put("rearSpoiler", rearSpoiler);
        objects.put("frontTire", frontTire);
        objects.put("rearTire", rearTire);
        objects.putIfAbsent("frontWheel", frontTire);
        objects.putIfAbsent("rearWheel", rearTire);
        boolean tireExists = objects.containsKey("frontTire");
        boolean spoilerExists = objects.containsKey("rearSpoiler");
        objects.entrySet();

        objects.values();
        List<String> objectList = new ArrayList<>();

        Map<String, AudioObject> audioObjects = new HashMap<>();
        audioObjects.put("speaker", speaker);
        audioObjects.isEmpty();



    }

}
