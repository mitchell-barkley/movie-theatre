import java.util.Scanner;

public class MovieTheatreFunctions {

    public static void menuBookSeat(MovieTheatreArray movieTheatreArray) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Choose a seat to book: ");
            System.out.print("Enter row number: ");
            int row = scanner.nextInt();
            System.out.print("Enter column number: ");
            int col = scanner.nextInt();
            movieTheatreArray.bookSeat(row, col);
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
        }
        System.out.println();
        System.out.println("Theatre layout after booking a seat:");
        movieTheatreArray.displayTheatre();
    }

    public static void menuCancelSeat(MovieTheatreArray movieTheatreArray) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Choose a seat to cancel: ");
            System.out.print("Enter row number: ");
            int row = scanner.nextInt();
            System.out.print("Enter column number: ");
            int col = scanner.nextInt();
            movieTheatreArray.cancelSeat(row, col);
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
        }
        System.out.println();
        System.out.println("Theatre layout after cancelling a seat:");
        movieTheatreArray.displayTheatre();
    }

    public static void menuShowTheatreLayout(MovieTheatreArray movieTheatreArray) {
        System.out.println("Theatre layout:");
        movieTheatreArray.displayTheatre();
    }
}
