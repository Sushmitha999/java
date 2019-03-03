import java.util.*;
class Test
{
List<Integer> slice(List<Integer> list, int start,int end)
{
return list.subList(start-1,end);
}
}
public class Test23
{
	public static void main (String[] args)
	{
		List<Integer> list = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
Test t=new Test();
		System.out.println(t.slice(list,3,6));
	}
}