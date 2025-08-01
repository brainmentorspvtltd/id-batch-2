strictfp class Add {
    /*
     * class name - start with alphabet, AlphaNumeric
     * e.g A1
     * Special Character _ $ allowed
     * e.g A_1
     * e.g A$B
     * class name - standard - PascalCase
     * e.g SavingAccount
     */
    public strictfp static void main(String args[]) {
        char w = 'न';
        System.out.println(w);
        float g = 90.20f;
        double gg = 100.20;
        int k;
        int h;
        // System.out.println(k * h);
        byte a = 100;
        byte b = 30;
        byte c = (byte) (a + b);
        System.out.println(c);
        long t = 100000l;
        final int MAX = 100;
        // MAX = 200;
        var sum = 0;
        for (String i : args) {
            // for (int i = 0; i < args.length; i++) {
            // sum = sum + Integer.parseInt(args[i]);
            sum = sum + Integer.parseInt(i);
        }
        // System.out.println(sum);

    }

}
