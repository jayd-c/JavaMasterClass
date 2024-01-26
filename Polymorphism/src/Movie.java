public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie () {
        String instanceType = this.getClass().getSimpleName();
        System.out.printf("%s is a %s film %n",title,instanceType);
    }

    public static Movie getMovie (String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'H' -> new Horror(title);
            default -> new Movie(title);
        };

    }
}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");

    }
    public void watchAdventure () {
        System.out.println("Watching a Adventure movie");
    }
}

class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Something funny happens",
                "Scary and happier happens",
                "Happy Ending");

    }
    public void watchComedy () {
        System.out.println("Watching a comedy movie");
    }
}

class Horror extends Movie {
    public Horror(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Someone gets tortured");

    }
    public void watchHorror () {
        System.out.println("Watching a Horror movie");
    }
}