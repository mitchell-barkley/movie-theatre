public class MovieTheatreArray {
    String theatreArray[][] = null;

    public MovieTheatreArray() {
        theatreArray = new String[15][25];
        for (int row = 0; row < theatreArray.length; row++) {
            for (int col = 0; col < theatreArray[0].length; col++) {
                String seat = Math.random() < 0.5 ? "O" : "X";
                theatreArray[row][col] = seat;
            }
        }
    }

    public void displayTheatre() {
        for (int row = 0; row < theatreArray.length; row++) {
            for (int col = 0; col < theatreArray[0].length; col++) {
                System.out.print(theatreArray[row][col] + " ");
            }
            System.out.println();
        }
    }

    public void bookSeat(int row, int col) {
        if (theatreArray[row][col].equals("X")) {
            System.out.println("Seat already booked");
        } else {
            theatreArray[row][col] = "X";
            System.out.println("Seat booked successfully");
        }
    }

    public void cancelSeat(int row, int col) {
        if (theatreArray[row][col].equals("O")) {
            System.out.println("Seat already cancelled");
        } else {
            theatreArray[row][col] = "O";
            System.out.println("Seat cancelled successfully");
        }
    }
}