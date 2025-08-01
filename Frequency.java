public class Frequency {
    public static void main(String[] args) {
        int num = 77722102;
        int hash[] = new int[10];
        System.out.println("Num " + num);
        while (num != 0) {
            int digit = num % 10;
            hash[digit]++;
            num = num / 10;
        }

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
                System.out.println(i + " " + hash[i]);
            }
        }

    }
}
