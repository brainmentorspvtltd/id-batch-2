public class EvenOddCount {
    static void countEvenOdd(int num, int evenCount, int oddCount) {
        if (num == 0) {
            System.out.println("Even Count is " + evenCount);
            System.out.println("Odd Count is " + oddCount);
            return;
        }

        if (num % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }

        countEvenOdd(num - 1, evenCount, oddCount);
    }

    static int[] countEvenOdd(int num) {
        if (num == 0) {
            int arr[] = new int[2];
            return arr;
        }
        int[] result = countEvenOdd(num - 1);
        if (num % 2 == 0) {
            result[0]++;
        } else {
            result[1]++;
        }

        return result;
    }

    public static void main(String[] args) {
        // System.out.println();
        // countEvenOdd(97, 0, 0);
        int result[] = countEvenOdd(98);
        System.out.println("The Even Count is " + result[0]);
        System.out.println("The Odd Count is " + result[1]);
    }
}