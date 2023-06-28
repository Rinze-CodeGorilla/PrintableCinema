package cinema;

public class PrintableCinema1 {
    private final int ROWS = 7;
    private final int SEATS_PER_ROW = 8;

    // false is available, true is reserved
    // booleans initialize as false
    private final boolean[][] seats = new boolean[ROWS][SEATS_PER_ROW];

    public static void main(String[] args) {
        PrintableCinema1 cinema = new PrintableCinema1();
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

    // Drie for-loops in 1 method, wat gebeurt er allemaal? Wat is i? Wat is j? Soms is i de kolom, soms is i de rij, erg onduidelijk, moeilijk om te lezen en te snappen
    public void print() {
        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 0; i < SEATS_PER_ROW; i++) {
            System.out.print(" " + (i + 1));
        }
        System.out.println();
        for(int i = 0; i < ROWS; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < SEATS_PER_ROW; j++) {
                System.out.print(" " + (seats[i][j] ? "■" : "□"));
            }
            System.out.println();
        }
    }
}
