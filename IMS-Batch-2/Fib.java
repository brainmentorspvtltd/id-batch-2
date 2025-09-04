public class Fib {
    static int fib(int num) {
        if (num < 2)
            return num;

        int first = fib(num - 1);
        int sec = fib(num - 2);
        return first + sec;
    }

    public static void main(String[] args) {
        System.out.println(fib(50));
    }

}
