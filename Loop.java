public class Loop {
    public static void main(String[] args) {
        // Loop{
        // Code
        // }
        System.out.println();
        // for , while , do while
        outer: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == j) {
                    continue outer;
                    // break outer;
                    // continue;
                }
                System.out.println("I " + i + " J " + j);
            }
        }
    }
}
