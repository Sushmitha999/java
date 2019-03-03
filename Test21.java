import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;
class Test{
List<Integer> range(int start, int end) {
        return IntStream.rangeClosed(start, end).boxed().collect(toList());
    }
}

public class Test21 {
   public static void main(String[] args) {
      Test t=new Test();
System.out.println(t.range(2,45));  
   }
}   