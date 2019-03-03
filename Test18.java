import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//random numbers
class Test{
 List<Integer> random(List<Integer> list, int n) {
        return new Random().ints(n, 0, list.size()).mapToObj(list::get).collect(Collectors.toList());
    }
}
public class Test18
{
public static void main(String args[])
{
Test t=new Test();
List <Integer> li =new ArrayList<Integer>();
for(int i=2;i<14;i=i+2)
{
li.add(i);
}
System.out.println(t.random(li,4));
}
}