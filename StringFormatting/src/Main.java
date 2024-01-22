public class Main {

    public static void main(String[] args) {

        String bulletedList = "Print bulleted List :\n" +
                "\t\u2022 First Point\n" +
                "\t\u2022 Sub Point \n";
        System.out.println(bulletedList);

        String textBox = """
                Print Bulleted List:
                    \u2022 First Point
                    \u2022 second Point
                """;
        System.out.println(textBox);
        int age = 32;
        System.out.printf("Your age is %d%n",age);

        int yearOfBirth = 2023 - age;
        System.out.printf("You were born in %d%n",yearOfBirth);
        System.out.printf("Your age is %.2f%n",(float)age);

        for(int i = 1; i<=100000; i*=10) {
            System.out.printf("Printing %6d %n",i);
        }

        String formattedString = String.format("Your age is %d",age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
        //String inspection methods
        /*

         */

    }
}
