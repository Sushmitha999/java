import java.util.*;
class Last{
String kth(LinkedList<String>list,int k)
    {
  	if(k==0){
		return list.getFirst();
	}
	return kth(new LinkedList(list.subList(1, list.size())),k-1);
    }
}
class Test4{
public static void main(String args[])
{
LinkedList<String> li=new LinkedList <String>();  
li.add("java");
li.add("is");
li.add("a");
li.add("purely");
li.add("object");
li.add("oriented");
li.add("language");
Last l=new Last();
System.out.println(l.kth(li,3));
}
}