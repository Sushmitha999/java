import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
class Test
{
List<Integer> duplicate(List<Integer> list) {
        return list.stream().flatMap(e -> Stream.of(e, e)).collect(toList());
    }
}
public class Test25
{
	public static void main (String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Test t=new Test();
		System.out.println(t.duplicate(list));
	}
}