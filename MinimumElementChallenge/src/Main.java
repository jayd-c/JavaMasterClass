import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(findMin((readIntegers())));
    }
    public static int[] readIntegers () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of comma delimited numbers : ");
        String numList = sc.nextLine();
        String[] strArr = numList.split(",");
        int[] intArr = new int[strArr.length];
        for(int i = 0; i< intArr.length; i++) {
            intArr[i]  = Integer.parseInt(strArr[i]);
        }
        return  intArr;
    }

    public static int findMin (int[] arr) {
        int min = arr[0];
        for(int i = 0; i<arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
