public class GCD {
    static void gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("The GCD is " + a);
    }

    public static void main(String[] args) {
        gcd(13, 17);
    }
}