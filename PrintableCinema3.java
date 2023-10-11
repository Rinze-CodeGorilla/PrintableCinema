package cinema;

public class PrintableCinema3 {
    private final int ROWS = 7;
    private final int SEATS_PER_ROW = 8;

    // false is available, true is reserved
    // booleans initialize as false
    private final boolean[][] seats = new boolean[ROWS][SEATS_PER_ROW];

    public static void main(String[] args) {
        PrintableCinema3 cinema = new PrintableCinema3();
        cinema.reserve(0,0);
        cinema.reserve(6, 3);
        cinema.reserve(6,4);
        cinema.print();
    }

    public void reserve(int row, int column) {
        if (row >= 0 && row < ROWS && column >= 0 && column < SEATS_PER_ROW) {
            seats[row][column] = true;
        }
    }

    // nog maar 1 loop in de functie, en het is duidelijk dat de titel, de header en elke row geprint worden
    public void print() {
        printTitle();
        printTableHeader();
        int index = 1;
        for (boolean[] row: seats) {
            printRow(index++, row);
        }
    }

    private void printTitle() {
        System.out.println("Cinema:");
    }

    private void printTableHeader() {
        System.out.print(" ");
        for (int seatNumber = 1; seatNumber <= SEATS_PER_ROW; seatNumber++) {
            System.out.print(" " + seatNumber);
        }
        System.out.println();
    }

    private void printRow(int index, boolean[] row) {
        System.out.print(index);
        for (boolean seat: row) {
            System.out.print(" " + (seat ? "■" : "□"));
        }
        System.out.println();
    }
}
