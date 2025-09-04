public class TriangleRec {
    static void printStar(int n) {
        if (n == 0)
            return;
        System.out.print("*");
        printStar(n - 1);
    }

    static void printRow(int n) {
        if (n == 0)
            return;
        printRow(n - 1);
        printStar(n);
        System.out.println();

    }

    public static void main(String[] args) {
        // printStar(6);
        printRow(5);
    }

}
