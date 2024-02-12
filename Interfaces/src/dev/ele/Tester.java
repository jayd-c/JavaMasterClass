package dev.ele;

import java.util.List;

public class Tester {
    public static void main(String[] args) {
//        inFlight(new Jet());

//        OrbitEarth.log("Testing " + new Satellite());
//        orbit(new Satellite());

        Cat myCat = new Cat();
        printThing(myCat);

        printThing( ()-> {
            System.out.println("meodn");
        });



    }

    static void printThing (Printable thing) { // I can call this interface type
        thing.print();
    }
    private static void inFlight (FlightEnabled flier) {
        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();
        if(flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    private static void orbit (OrbitEarth flier) {
        flier.takeOff();
        flier.fly();
        flier.land();
    }
}
