package dev.ele.john;

import dev.ele.model.LPAStudent;
import dev.ele.model.Student;

public class Tester {
    public static void main(String[] args) {

//        Printer<Integer> integerPrinter = new Printer<>(10);
//        Printer<Double> doublePrinter = new Printer<>(10.00);
//        Printer<String> stringPrinter = new Printer<>("Ten");
//
//        integerPrinter.print();
//        doublePrinter.print();
//        stringPrinter.print();

        Printer<Student> studentPrinter = new Printer<>(new Student());
        studentPrinter.print();
    }
}
