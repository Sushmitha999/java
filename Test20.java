import java.util.*;

public class Test20 {
   public static void main(String[] args) {
      List<Integer> a = new ArrayList<Integer>(5);
      a.add(15);
      a.add(22);
      a.add(30);
      a.add(40);
     System.out.println(a);
      a.add(2,25);
      a.add(4,35);
     System.out.println(a);
   }
}   