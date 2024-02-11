package dev.ele;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal b = new Bird();
        FlightEnabled fb = new Bird();

        Trackable tb = new Bird();

        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracker = bird;

        animal.move();
//        flier.move();
//        flier.fly();
//        flier.land();
//        flier.takeOff();
//        tracker.track();
        inFlight(flier);

        FlightEnabled jet = new Jet();
        inFlight(jet);

        Trackable truck = new Truck();
        truck.track();

        double kmsTravelled  =  100;
        double milesTravelled = kmsTravelled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n",kmsTravelled,milesTravelled);

        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        fliers.add(bird);

        List<FlightEnabled> betterFliers = new ArrayList<>();
        betterFliers.add(bird);
        triggerFliers(fliers);
        flyerFliers(fliers);
        landFliers(fliers);

        triggerFliers(betterFliers);
        flyerFliers(betterFliers);
        landFliers(betterFliers);




    }
    private static void inFlight (FlightEnabled flier) {
        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }
    private static void triggerFliers (List<FlightEnabled> fliers) {
        for (var flier : fliers) {
            flier.takeOff();
        }
    }

    private static void flyerFliers (List<FlightEnabled> fliers) {
        for (var flier : fliers) {
            flier.fly();
        }
    }
    private static void landFliers (List<FlightEnabled> fliers) {
        for (var flier : fliers) {
            flier.land();
        }
    }

}
