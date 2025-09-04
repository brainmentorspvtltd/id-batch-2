public class Factorial {

    static int fact(int num) { // num = 5
        int ans = 1;
        for (int i = 2; i <= num; i++) {
            ans = ans * i;
        }

        return ans;
    }

    static void factTail(int num, int ans) {
        if (num == 1) {
            System.out.println("The Factorial is " + ans);
            return;
        }

        factTail(num - 1, ans * num);

    }

    static int factHead(int num) {
        if (num == 1)
            return 1;
        int ans = factHead(num - 1);
        return ans * num;
    }

    public static void main(String[] args) {
        int num = 5;
        int ans = 1;
        factTail(num, 1);
    }

}
