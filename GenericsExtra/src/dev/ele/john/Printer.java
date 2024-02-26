package dev.ele.john;

import dev.ele.model.Student;

class PrinterT <T> {
    T thingsToPrint;

    public PrinterT(T thingsToPrint) {
        this.thingsToPrint = thingsToPrint;
    }

    public void print() {
        System.out.println(thingsToPrint);
    }
}

public class Printer <T extends Student>{
     Student thingsToPrint;

    public Printer(Student thingsToPrint) {
        this.thingsToPrint = thingsToPrint;
    }
    public void print() {
        System.out.println(thingsToPrint);
    }
}
