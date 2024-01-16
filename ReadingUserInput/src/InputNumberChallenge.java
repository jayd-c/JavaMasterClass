import java.util.Scanner;

public class InputNumberChallenge {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int countFlag = 1;
        int sum = 0;

        while (countFlag < 6) {

                System.out.println("Enter number #"+ countFlag+":");
                try {
                    sum+= checkInput(sc.nextLine());
                    countFlag++;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid Number");
                }
            if(countFlag > 5) System.out.println("Your Total is " + sum);
        }

        sc.close();


    }
    public static int checkInput (String input) {
        return Integer.parseInt(input);
    }

}
