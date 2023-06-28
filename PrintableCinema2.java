package cinema;

public class PrintableCinema2 {
    private final int ROWS = 7;
    private final int SEATS_PER_ROW = 8;

    // false is available, true is reserved
    // booleans initialize as false
    private final boolean[][] seats = new boolean[ROWS][SEATS_PER_ROW];

    public static void main(String[] args) {
        PrintableCinema2 cinema = new PrintableCinema2();
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

    // nog maar 1 loop in de functie, en het is duidelijk dat de titel, de header en elke row geprint worden, nog wel met een wat onduidelijke i
    public void print() {
        printTitle();
        printTableHeader();
        for (int i = 0; i < ROWS; i++) {
            printRow(i);
        }
    }

    private void printTitle() {
        System.out.println("Cinema:");
    }

    private void printTableHeader() {
        System.out.print(" ");
        for (int i = 0; i < SEATS_PER_ROW; i++) {
            System.out.print(" " + (i + 1));
        }
        System.out.println();
    }

    private void printRow(int rowIndex) {
        System.out.print(rowIndex + 1);
        boolean[] row = seats[rowIndex];
        for (int i = 0; i < SEATS_PER_ROW; i++) {
            System.out.print(" " + (row[i] ? "■" : "□"));
        }
        System.out.println();
    }
}
