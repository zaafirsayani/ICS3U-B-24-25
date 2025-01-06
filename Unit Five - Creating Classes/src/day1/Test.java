package day1;

public class Test {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 4;
        hollowBox(cols, rows);

    }

    private static void hollowBox(int rows, int cols) {
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= cols; j++) {

                if (i == 0 || i == rows || j == 0 || j == cols) {
                    System.out.print(cols);
                } else {
                    System.out.print(rows);
                }

            }
            System.out.println();
        }

    }

}
