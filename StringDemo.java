import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;

public class StringDemo extends Object {
    public static void main(String[] args) {
        BigDecimal bb = new BigDecimal("53453464646464.4535435");
        BigInteger b4 = new BigInteger("64757567588686876876876868686868686786786786786868867");
        BigInteger b2 = new BigInteger("64757567588686876876876868686868686786786786786868867");
        BigInteger b3 = b4.add(b2);
        double price = 9996569.22;
        NumberFormat n = NumberFormat.getCurrencyInstance();
        System.out.println(n.format(price));
        System.out.println(price);
        Date date = new Date();
        DateFormat df = DateFormat.getDateInstance();
        System.out.println(df.format(date));
        System.out.println(date);
        StringBuilder sb = new StringBuilder();
        // StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        // sb.ensureCapacity(100);
        sb.append("highfhgdlhfgkjhjkjhgjkghgjgjgjhghjgjgjhgjgjgjgjgjhgjhgjgjgjgdrgf");
        // sb.append("Ok");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        StringDemo d = new StringDemo();
        d.equals(d);
        Integer h1 = 100;
        Integer h2 = 100;
        System.out.println(h1.equals(h2));

        int g = 100;
        int g2 = 100;
        System.out.println(g == g2);
        String a = "Amit".intern();
        String b = "Amit";
        String c = new String("Amit").intern();
        System.out.println(a == b);
        System.out.println(a == c);
        b = "Ram";
        System.out.println(a == b);
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.compareTo(b));
        // 10 methods StringBuffer

    }
}
