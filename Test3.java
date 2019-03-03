import java.util.*;
class Last{
String lastbutone(List<String>elements)
    {
    	if(elements==null||elements.isEmpty())
    	{
    		throw new NoSuchElementException();
    	}
    	if(elements.size()==2)
    		return elements.get(0);
    	return lastbutone(elements.subList(1, elements.size()));
    }
}
class Test3{
public static void main(String args[])
{
List<String> li=new ArrayList <String>();  
li.add("java");
li.add("is");
li.add("a");
li.add("purely");
li.add("object");
li.add("oriented");
li.add("language");
Last l=new Last();
System.out.println(l.lastbutone(li));
}
}