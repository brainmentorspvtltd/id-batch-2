public class DiceBoardDemo {
    static void diceBoard(int current, int target, String result) {
        if (current == target) {
            System.out.println(result);
            return;
        }
        if (current > target) {
            return;
        }

        for (int dice = 1; dice <= 6; dice++) {
            diceBoard(current + dice, target, result + dice);
        }

    }

    public static void main(String[] args) {
        diceBoard(0, 7, "");
    }

}
