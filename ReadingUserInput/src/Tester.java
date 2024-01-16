import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double mini = 0;
        double maxi = 0;
        int loopCount = 0;
        while (true) {
            System.out.println("Enter a number or character to exit : ");
            String entry = scanner.nextLine();
            try {
                double input = Double.parseDouble(entry);
                if (input < mini || loopCount == 0) {
                    mini = input;
                }
                if (input > maxi || loopCount == 0) {
                    maxi = input;
                }
                loopCount++;

            } catch (NumberFormatException e) {

                break;
            }
        }
        if (loopCount > 0) System.out.println("min = " + mini + " and " + "max = " + maxi);
        else System.out.println("No valid input entered");
        scanner.close();
    }
}
