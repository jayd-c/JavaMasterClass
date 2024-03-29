public class NextMain {
    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A","Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A","Jaws");
        jaws.watchMovie();

        System.out.println("**");
        Adventure spider =  new Adventure("spider man");



        spider.watchAdventure();
        System.out.println("8**");

        Object comedy = Movie.getMovie("C","Airplane");

        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var jaw = Movie.getMovie("A","Jaws2");
        jaw.watchMovie();

        Object unknownObject = Movie.getMovie("C","Airplane");
        if(unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if(unknownObject instanceof Horror hr) {
            hr.watchHorror();
        }
    }
}
