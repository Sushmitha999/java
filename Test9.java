//removing dupes
import java.util.*;
class Test{
   List<Integer> compress(List<Integer> list) {
        List<Integer> result = new ArrayList<Integer>();
        Integer lastElement = null;
        for (Integer e : list) {
            if (!Objects.equals(lastElement, e)) {
                result.add(e);
            }
            lastElement = e;
        }
        return result;
    }
}
public class Test9{

public static void main(String args[])
{
 List<Integer> li= new ArrayList<Integer>();
li.add(1);
li.add(1);
li.add(2);
li.add(3);
li.add(3);
li.add(3);
li.add(3);
List<Integer> n=new ArrayList<Integer>();
Test t=new Test();
n=t.compress(li);
for(int i=0;i<n.size();i++)
{
	System.out.print(n.get(i)+" ");
}
}

}