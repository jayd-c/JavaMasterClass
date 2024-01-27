public class Main {
    public static void main(String[] args) {
        Movie m = new Horror("Jeepers Creepers");
        m.watchMovie();
//        Movie movie = Movie.getMovie("Horror","Star Wars");
//        movie.watchMovie();

//        Scanner s = new Scanner(System.in);
//        while (true) {
//            System.out.println("Enter type(A for Adventure, C for comedy, H for horror) or Q or q to quit");
//            String type = s.nextLine();
//            if("Qq".contains(type)) break;
//            System.out.println("Enter Movie Title : ");
//            String title = s.nextLine();
//            Movie movie = Movie.getMovie(type, title);
//            movie.watchMovie();
//        }

        Car car = new Car();
        System.out.println(car.toString());
        System.out.println("?".repeat(30));
        Car car1 = new ElectricCar("Toyota","Blast","Comes in only suvs now",false,900,1000);
        runRace(car1);
        System.out.println("?".repeat(30));
        
    }
        public static void runRace (Car car) {
                car.drive();
                car.startEngine();
                System.out.println(car.toString());
        }

}
