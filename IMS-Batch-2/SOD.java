public class SOD {
    static void sumOfDigits(int num, int sum) {
        if (num == 0) {
            System.out.println("Sum of Digits are" + sum);
            return;
        }

        int rem = num % 10;
        sum += rem;
        num /= 10;
        sumOfDigits(num, sum);
    }

    static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        // int sum = sumOfDigits(num / 10);
        // int rem = num % 10;
        // sum += rem;
        // return sum;
        return sumOfDigits(num / 10) + num % 10;

    }

    public static void main(String[] args) {
        int num = 12345;
        sumOfDigits(num, 0);
        System.out.println(sumOfDigits(num));
    }

}
