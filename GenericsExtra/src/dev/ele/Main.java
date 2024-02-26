package dev.ele;

import dev.ele.model.LPAStudent;
import dev.ele.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for(int i =0; i< studentCount; i++) {
            students.add(new Student());
        }
        students.add(new LPAStudent());
//        printList(students);
        printMoreLists(students);

        List<LPAStudent> lPAStudents = new ArrayList<>();
        for(int i =0; i< studentCount; i++) {
            lPAStudents.add(new LPAStudent());
        }
//        printList(lPAStudents);
//        printList(lPAStudents);
    }
//    public static <T extends Student> void printList (List<T> students) {
//        for(var student: students) {
//            System.out.println(student.getYearStarted() + ": " + student);
//        }
//        System.out.println();
//    }

    public static void printMoreLists (List<? extends Student> students) {
        for(var student: students) {
            System.out.println(student.getYearStarted() + ": " + student);
        }
        System.out.println();
    }
}
