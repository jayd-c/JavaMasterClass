import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie m = new Horror("Jeepers Creepers");
        m.watchMovie();
//        Movie movie = Movie.getMovie("Horror","Star Wars");
//        movie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter type(A for Adventure, C for comedy, H for horror) or Q or q to quit");
            String type = s.nextLine();
            if("Qq".contains(type)) break;
            System.out.println("Enter Movie Title : ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }

    }


}
