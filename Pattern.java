public class Pattern {
    static void pattern1() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*"); // same line print
            }
            System.out.println(); // new line
        }
    }

    static void pattern2() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*"); // same line print
            }
            System.out.println(); // new line
        }
    }

    static void pattern3() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            System.out.print(" ".repeat(n - row));
            // for (int space = 1; space <= n - row; space++) {
            // System.out.print(" ");
            // }
            System.out.print("*".repeat(row));
            // for (int col = 1; col <= row; col++) {
            // System.out.print("*");
            // }
            System.out.println();
        }
    }

    static void pattern3A() {
        int n = 5;
        for (int row = 1; row <= n; row++) {

            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern3A();
        // pattern4();
        // pattern3();
        // System.out.println("*".repeat(5));
        // pattern1();
        // pattern2();
    }
}
