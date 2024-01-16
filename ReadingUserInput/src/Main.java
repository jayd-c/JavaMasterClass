import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2024;
        try {
            System.out.println(getInputsFromConsole(currentYear));

        } catch (NullPointerException e) {
            System.out.println("The error is \n" + e.getMessage());
            System.out.println(getInputsFromScanner(currentYear));

        }



    }
    public static String getInputsFromConsole (int currentYear) {
        String name = System.console().readLine("Hi, what's your name? ");
        System.out.println("Hi, " + name + " thanks for taking the class");
        String dOB = System.console().readLine("What year your are born? ");
        int age = currentYear - Integer.parseInt(dOB);
        System.out.println("So, your age is " + age);

        return "";
    }

    public static String getInputsFromScanner (int currentYear) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, what is you name : ");
        String name = sc.nextLine();

        System.out.println("Hi, " + name + " welcome to the class!");

        boolean validYear = false;
        int dob = 0;
        do {
            System.out.println("Enter a valid year of birth");
            try {

                    dob = checkData(currentYear,sc.nextLine());
                    validYear = dob >= 0;



            } catch (NumberFormatException e) {
                System.out.println("Characters not accepted");
            }

        } while (!validYear);
        return "So your age is " + dob ;
    }

    public static int checkData (int currentYear, String birthYear) {
        int minYearBorn = currentYear - 125;
        int dob = Integer.parseInt(birthYear);
        return dob > minYearBorn && currentYear>dob? (currentYear - dob) : -1;
    }

}
