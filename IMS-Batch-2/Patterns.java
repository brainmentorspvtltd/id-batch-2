public class Patterns {
    static void printSquare(int n) {

        for (int row = 1; row <= n; row++) {
            for (int stars = 1; stars <= n; stars++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void printHollowSquare(int n) {

        for (int row = 1; row <= n; row++) {
            for (int stars = 1; stars <= n; stars++) {
                if (row == 1 || row == n || stars == 1 || stars == n || row == stars || stars == n - row + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    static void printRightTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int stars = 1; stars <= row; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void printReverseRightTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int stars = 1; stars <= n - row + 1; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void printPyramid(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= 2 * row - 1; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void printReversePyramid(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= 2 * (n - row) + 1; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        // printRightTriangle(n);
        // printReverseRightTriangle(n);
        // printPyramid(n);
        // printReversePyramid(n);
        printHollowSquare(n);

    }
}
