public class PrintDigit {
    public static void main(String[] args) {
        int num = 12345;
        int n = num;
        int div = 1;
        while (num != 0) {
            div = div * 10;
            num = num / 10;
        }
        div = div / 10;
        while (n != 0) {
            System.out.println(n / div);
            n = n % div;
            div = div / 10;
        }
        // System.out.println(div / 10);
    }
}
