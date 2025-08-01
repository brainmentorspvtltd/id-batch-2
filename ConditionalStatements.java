import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a = scanner.nextInt();
        System.out.println("Enter the Second Number");
        int b = scanner.nextInt();
        System.out.println("Enter the Third Number");
        int c = scanner.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("A is Greater");
            } else {
                System.out.println("C is Greater");
            }
        } else {
            if (b > c) {
                System.out.println("B is Greater");
            } else {
                System.out.println("C is Greater");
            }
        }
    }
}
