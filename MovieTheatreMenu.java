import java.util.Scanner;

public class MovieTheatreMenu {

    public void menu (MovieTheatreArray movieTheatreArray) {
        System.out.println();
        System.out.println("Choose an option: ");
        System.out.println();
        System.out.println("0. Exit.");
        System.out.println("1. Book a seat.");
        System.out.println("2. Cancel a seat.");
        System.out.println("3. Show theatre layout.");
        System.out.println();
        System.out.println("Enter your choice: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    break;
                case 1:
                    MovieTheatreFunctions.menuBookSeat(movieTheatreArray);
                    break;
                case 2:
                    MovieTheatreFunctions.menuCancelSeat(movieTheatreArray);
                    break;
                case 3:
                    MovieTheatreFunctions.menuShowTheatreLayout(movieTheatreArray);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
        }
    }
}
