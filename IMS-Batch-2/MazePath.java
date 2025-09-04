public class MazePath {
    static void maze(int startingRow, int startingCol, int endRow, int endCol, String result) {
        if (startingRow == endRow && startingCol == endCol) {
            System.out.println(result);
            return;
        }

        if (startingRow > endRow || startingCol > endCol) {
            return;
        }

        maze(startingRow, startingCol + 1, endRow, endCol, result + "H");
        maze(startingRow + 1, startingCol, endRow, endCol, result + "V");
    }

    public static void main(String[] args) {
        maze(0, 0, 2, 2, "");
    }

}
