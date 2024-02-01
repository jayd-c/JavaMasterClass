import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(reverseCopy(arr)));
    }

    private static void reverse (int[] arr) {
        int[] reversedArr = new int[arr.length];
        for(int i = 0; i<arr.length; i++) {
            reversedArr[i] = arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(reversedArr));
    }

    private static void reverseSwap (int[] arr) {
        int[] reversedArr = new int[arr.length];

        for(int i = 0; i<arr.length/2; i++) {
            reversedArr[i] = arr[arr.length-1-i];
            reversedArr[arr.length-1-i] =  arr[i];
        }
        System.out.println(Arrays.toString(reversedArr));
    }

    private static int[] reverseSameArray (int[] arr) {
        for(int i = 0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1 - i];
            arr[arr.length-1- i] = temp;
            System.out.println("--> " + Arrays.toString(arr));
        }
        return arr;

    }
    private static int[] reverseCopy (int[] arr) {
        int[] newArr = new int[arr.length];
        int maxIndex = arr.length-1;
        for(int el: arr) {
            newArr[maxIndex--] = el;
        }
        return newArr;
    }
}
