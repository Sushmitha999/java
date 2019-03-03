import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.AbstractMap.SimpleEntry;
class Test
{
List<Integer> dropEverynth(List<Integer> list, int n)
{
  if (n == 0) {
            return list;
        }
        return IntStream.range(0, list.size())
                .mapToObj(i -> new SimpleEntry<>(list.get(i), i))
                .filter(entry -> (entry.getValue() + 1) % n != 0)
                .map(SimpleEntry::getKey)
                .collect(Collectors.toList());
}
}
public class Test24
{
	public static void main (String[] args)
	{
		List<Integer> list = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
Test t=new Test();
		System.out.println(t.dropEverynth(list,3));
	}
}