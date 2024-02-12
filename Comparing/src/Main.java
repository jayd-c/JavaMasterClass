import java.awt.color.CMMException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Integer five = 5;
        Integer[] others = {0, 55, 10, -50, 50};
        for (Integer i : others) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n", five, (val == 0 ? "==" : (val < 0) ? "<" : ">"), i, val);
        }

        String banana = "banana";
        String[] fruit = {"apple", "banana", "pear", "Banana"};

        for (String s : fruit) {
            int val = banana.compareTo(s); //can use compareTo method as the array already implements Comparator interface
            System.out.printf("%s %s %s : compareTo = %d%n", banana, (val == 0 ? "==" : (val < 0) ? "<" : ">"), s, val);
        }

        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));

        System.out.println("A : " + (int) 'A' + " " + "a : " + (int) 'a');
        System.out.println("B : " + (int) 'B' + " " + "b : " + (int) 'b');

        Student tim = new Student("Tim");

        Student[] students = {new Student("Tim"), new Student("Zach"), new Student("Ann")};

        Arrays.sort(students); //use a raw version of Comparable => nothing will do
        System.out.println(Arrays.toString(students));

        System.out.println("result = " + tim.compareTo(new Student("TIM"))); // class cast exception = trying to compare String to a String type object
        Comparator<Student> gpaSorter = new StudentGPAComparator();
        Arrays.sort(students,gpaSorter);
        System.out.println(Arrays.toString(students));
    }
}
class StudentGPAComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
//        return (o1.gpa + o1.name).compareTo(o2.gpa + o2.name); //order by gpa lowest to highest
        return (o2.gpa + o2.name).compareTo(o1.gpa + o1.name); //order by gpa highest to lowest
    }
}

    class Student implements Comparable<Student>{
        private static int LAST_ID = 1000;
        private static Random random = new Random();
        String name;
        private int id;
        protected double gpa;

        public Student(String name) {
            this.name = name;
            id = LAST_ID++;
            gpa = random.nextDouble(1.0,4.0);
        }

        @Override
        public String toString() {
            return "%d - %s (%.2f)".formatted(id,name,gpa);
        }



        @Override
        public int compareTo(Student o) {
            return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
        }

//        @Override
//        public int compareTo(Object o) {
//            Student other = (Student) o;
//            return name.compareTo(other.name);
//        }
    }
