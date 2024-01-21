public class Main {
    public static void main(String[] args) {



        for(int i = 1; i<=5; i++) {
            Student s = new Student("S9230"+i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Annonymous";
                    },
                   "11/05/199"+i,
                    switch (i){
                        case 1 -> "Java";
                        case 2 -> "Python";
                        case 3 -> "Ruby";
                        case 4 -> "Angular";
                        case 5 -> "C";
                        default -> "Drifting";
                    }
                    );
            System.out.println(s.toString());
        }

        for(int i = 1; i<=5; i++) {
            LPAStudent s = new LPAStudent("S9230"+i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Annonymous";
                    },
                    "11/05/199"+i,
                    switch (i){
                        case 1 -> "Java";
                        case 2 -> "Python";
                        case 3 -> "Ruby";
                        case 4 -> "Angular";
                        case 5 -> "C";
                        default -> "Drifting";
                    }
            );
            System.out.println(s.toString());
        }
        Student pojoStudent = new Student("1","a","1984","Java");
        LPAStudent recordStudent = new LPAStudent("2","b","45","Java");
        System.out.println(pojoStudent.getClassList());
        System.out.println(recordStudent.classType());
        System.out.println("*".repeat(100));


        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
        System.out.println("*".repeat(100));

        Point x = new Point(1,2);
        System.out.println(x.distance(2,4));
        Point y = new Point(2,4);
        Point z = new Point(5,6);

        System.out.println("*".repeat(30));

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());


    }
}
