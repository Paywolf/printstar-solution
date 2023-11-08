public class PrintStar {
    public static final int NUM_OF_LINES    = 7;
    public static final int SPACE           = 11;

    public static void main(String[] args) {
        for (int line = 0; line < NUM_OF_LINES; ++line) {
            // Space on the Left
            for (int space = 0; space < NUM_OF_LINES - (line + 1); ++space) {
                System.out.print(" ");
            }

            System.out.print("*");

            // Space in the Middle
            for (int space = 0; space < (line * 2) - 1; ++space) {
                System.out.print(" ");
            }

            if (line != 0) {
                System.out.print("*");
            }

            // Space in the Right
            for (int space = 0; space < SPACE - (line * 2); ++space) {
                System.out.print(" ");
            }

            if (line != NUM_OF_LINES - 1) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}