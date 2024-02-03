import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] originalArray = new String[] {"First","Second","Third"};
        List<String> originalList = Arrays.asList(originalArray); //this list is backed by an array, so there will be limitations this is fixed size
        List<String> anotherList = Arrays.asList("Sunday","Monday","Tuesday"); //this is a fixed sized list immutable
        List<String> commonList =  new ArrayList<>();


        System.out.println("original list class : " + originalList.getClass());
        System.out.println("common list class : " + commonList.getClass().getName());

        System.out.println("list : " + originalList);
        System.out.println("array : " + Arrays.toString(originalArray));

//        originalList.add(0,"one"); does not work on Arrays$ArrayList
        commonList.add(0,"One");
        System.out.println("list : " + originalList);
        System.out.println("common List : " + commonList);

        commonList.add("Two");
        System.out.println(commonList);

        System.out.println(anotherList);
//        anotherList.remove("Sunday");//exception
//        anotherList.add("Friday");//exception

        System.out.println(anotherList);

        List<String>  stringList = new ArrayList<>(List.of("Jan","Feb","Mar"));
        System.out.println(stringList.add("Apr"));

        System.out.println(stringList);

        ArrayList<String> stringArrayList = new ArrayList<>(List.of("january","February","March"));
        System.out.println(stringArrayList);
        String[] listArray = stringList.toArray(new String[]{});
        System.out.println(Arrays.toString(listArray));


    }
}
