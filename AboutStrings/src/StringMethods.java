public class StringMethods {
    public static void main(String[] args) {

        String birthDate = "25/11/1985";
        int startingIdex = birthDate.indexOf("1985");
        System.out.println("starting index = " + startingIdex);
        System.out.println("Birth year = " + birthDate.substring(startingIdex));

        System.out.println("Month = " + birthDate.substring(3,5));

        String newDate = String.join("/", "25","11","1985");
        System.out.println("newDate = " + newDate);
        System.out.println(newDate.replace('/','-'));
        System.out.println(newDate.replace("/","00"));
        System.out.println(newDate.replaceAll("/","*"));
        System.out.println(birthDate.indent(8));
        System.out.println(birthDate.indent(-5));

    }
}
