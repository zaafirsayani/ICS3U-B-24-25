package day2;

public class NestedForLoops {
    public static void main(String[] args) {
        // exampleOne();
        // createBox(4,8);

        // createTriangle();
        int height = 5;
        int width = 6;
        // createTriangle(height);
        createEmptyBox(width, height);
        // ******
        // * *
        // * *
        // ******
    }

    private static void createEmptyBox(int width, int height) {
        for (int i = 0; i < width; i++) {
            System.out.print("*");

        }
        System.out.println();

        for (int i = 0; i < height - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < width-2; j++) {
                System.out.print(" ");
                
            }
            System.out.println("*");
            
        }

        for (int i = 0; i < width; i++) {
            System.out.print("*");

        }
        System.out.println();
    }

    private static void createTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // *
    // **
    // ***
    // ****
    // *****
    private static void createTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

    private static void createBox(int rows, int cols) {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

    // create a ox of stars with width of 7 and height of 3
    // *******
    // *******
    // *******
    private static void exampleOne() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 7; j++) {
                System.out.print("*");

            }
        System.out.println();
    }

}
