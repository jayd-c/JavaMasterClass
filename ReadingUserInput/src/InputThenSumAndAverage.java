import java.util.Scanner;
public class InputThenSumAndAverage {
    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }
    public static void inputThenPrintSumAndAverage () {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        long avg = 0;
        int count = 0;
        while(true) {
            String in = scanner.nextLine();
            try {
                int input = Integer.parseInt(in);
                sum += input;
                count++;
            } catch (NumberFormatException e) {
                break;
            }
        }
        avg = (long) Math.round(sum/count);
        System.out.println("SUM = " + (int)sum + " AVG = " + avg);
    }
}
