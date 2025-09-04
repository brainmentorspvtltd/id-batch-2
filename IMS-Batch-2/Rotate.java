public class Rotate {
    public static int count(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }

        return count;
    }

    public static void rotate(int n, int k) {
        int count = count(n);
        k = k % count;
        int last = n % (int) Math.pow(10, k);
        int firstDigits = n / (int) Math.pow(10, k);

        last = last * (int) Math.pow(10, count - k);
        last += firstDigits;
        System.out.println(last);
    }

    public static void main(String[] args) {
        rotate(12345, 2);
    }

}
