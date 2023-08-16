
import model.Cat;
import model.Event;
import model.Transport;

import java.math.BigDecimal;

public class TestClass {
    public void firstTest() {
        Cat blacky = new Cat();
        blacky.setName("Blacky");
        blacky.setColor("Black");
        System.out.println("My cats name is " + blacky.getName() + " " + "and he is " + blacky.getColor() + " color");

        Event rave = new Event();
        rave.setPrice(new BigDecimal("500"));
        rave.setDate("22.02.2022");
        System.out.println("Event price " + rave.getPrice() + " eur " + "Event date " + rave.getDate());

        blacky.goToSleep();
        blacky.goWalkTo("Rave");

        Transport car = new Transport();
        Transport plane = new Transport();
        Transport train = new Transport();

        int distance = 100;
        car.setConsumption(100);
        plane.setConsumption(500);
        train.setConsumption(300);

        System.out.println("Car fuel: " + distance * car.getConsumption());
        System.out.println("Plane fuel: " + distance * plane.getConsumption());
        System.out.println("Train fuel: " + distance * train.getConsumption());

    }

}
