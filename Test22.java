import java.util.*;
public class Test22
{
	public static<T> void shuffle(List<T> list)
	{
		Random random = new Random();

		for (int i = list.size() - 1; i >= 1; i--)
		{
			int j = random.nextInt(i + 1);
			T obj = list.get(i);
			list.set(i, list.get(j));
			list.set(j, obj);
		}
	}

	public static void main (String[] args)
	{
		List<Integer> list = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		shuffle(list);
		System.out.println(list);
	}
}