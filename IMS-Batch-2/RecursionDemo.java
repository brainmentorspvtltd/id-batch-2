public class RecursionDemo {

    static void printName(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Yash");
        printName(n - 1);
        System.out.println("Tyagi");
    }

    public static void printDigits(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDigits(n - 1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        // int a = 10;
        // System.out.println("Hello");
        // printName(5);
        printDigits(5);
    }
}