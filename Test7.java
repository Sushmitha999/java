import java.util.*;
class Last{
LinkedList<String> reverselist(LinkedList<String>k)
    {
    	LinkedList<String>r=new LinkedList<String>();
    	for(String e:k)
    	{
    		r.addFirst(e);
    	}
    	return r;
    }
boolean isPalindrome(LinkedList<String> list)
{
	LinkedList<String>p=new LinkedList<String>();

	p=reverselist(list);
	return Objects.equals(list,p);
}
}
class Test7{
public static void main(String args[])
{
LinkedList<String> li=new LinkedList <String>();  
li.add("malayalam");
li.add("malayalam");
Last l=new Last();
System.out.println(l.isPalindrome(li));
}
}