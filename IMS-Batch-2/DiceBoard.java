public class DiceBoard {
    static void dice(int currPos, int targetPos, String result) {
        if (currPos == targetPos) {
            System.out.print(result + " ");
            return;
        }
        if (currPos > targetPos) {
            return;
        }

        for (int dice = 1; dice <= 6; dice++) {
            dice(currPos + dice, targetPos, result + dice);
        }
    }

    public static void main(String[] args) {
        dice(0, 10, "");
    }

}
