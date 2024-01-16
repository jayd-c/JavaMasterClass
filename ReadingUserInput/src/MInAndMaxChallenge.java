import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MInAndMaxChallenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        List<Integer> list = new ArrayList<>();
        while (!flag) {
            try {
                System.out.println("Enter a number or character to exit the loop :");
                int num  = Integer.parseInt(sc.nextLine());
                list.add(num);
            }catch (NumberFormatException e) {
                System.out.println("You have entered " + list);
                Collections.sort(list);
                System.out.println("Min is : " + list.get(0));
                System.out.println("Max is : " + list.get(list.size()-1));
                flag = true;

            }

        }
            sc.close();
//        getMinOrMax();
    }
    public static void getMinOrMax () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int min = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        while (!flag) {
            System.out.println("Enter a value : ");
            int max = Integer.parseInt(scanner.nextLine());
            if(max<min) {
                max = min;
            }
            try {
                System.out.println("Enter a value : ");
                int num = Integer.parseInt(scanner.nextLine());
                if (num < max) {
                    min = num;
                }
            } catch (NumberFormatException e) {
                flag = true;
                System.out.println("Min  = " + min);
                System.out.println("Max  = " + max);
            }
        }
        scanner.close();
    }

}
