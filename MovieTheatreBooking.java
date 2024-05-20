public class MovieTheatreBooking {
    public static void main(String[] args) {
        MovieTheatreArray movieTheatreArray = new MovieTheatreArray();
        System.out.println("Initial theatre layout:");
        movieTheatreArray.displayTheatre();
        MovieTheatreMenu movieTheatreMenu = new MovieTheatreMenu();
        movieTheatreMenu.menu(movieTheatreArray);
    }
}