//logical operations
public class Test35 {

    public static void main(String[] args) {

        System.out.println("Truth table for Logical Operators:\r\n");

        int p;
        int q;
        System.out.println("P\tQ\tP&Q\tP|Q\tP^Q");

        p = 1; q = 1;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println(p^q);

        p = 1; q = 0;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println(p^q);

        p = 0; q = 1;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println(p^q);

        p = 0; q = 0;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println(p^q);
    }
}
