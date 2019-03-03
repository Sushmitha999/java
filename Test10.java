//removing dupes
import java.util.*;
class Test{
     List<List<Integer>> pack(List<Integer> list) {
        Integer lastElement = null;
        List<List<Integer>> packedList = new ArrayList<List<Integer>>();
        List<Integer> elements = new ArrayList<Integer>();
        for (Integer el : list) {
            if (!Objects.equals(lastElement, el)) {
                elements = new ArrayList<Integer>();
                packedList.add(elements);
            }
            elements.add(el);
            lastElement = el;
        }
        return packedList;
    }
}
public class Test10{

public static void main(String args[])
{
Test t=new Test();
Integer[] arr={1,1,1,1,2,2,3,3,4};
List<List<Integer>> li=new ArrayList<List<Integer>>();
li=t.pack(Arrays.asList(arr));
System.out.println(li);
}

}