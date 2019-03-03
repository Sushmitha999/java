import java.util.*;
class Last{
LinkedList<Integer> reverselist(LinkedList<Integer>k)
    {
    	LinkedList<Integer>r=new LinkedList<Integer>();
    	for(Integer e:k)
    	{
    		r.addFirst(e);
    	}
    	return r;
    }
}
class Test6{
public static void main(String args[])
{
LinkedList<Integer> li=new LinkedList <Integer>();  
li.add(1);
li.add(4);
li.add(7);
li.add(13);
li.add(18);
li.add(28);
li.add(41);
Last l=new Last();
LinkedList<Integer> p=new LinkedList<Integer>();
	p=l.reverselist(li);
	for(int i=0;i<p.size();i++)
	{
		System.out.print(p.get(i)+" ");
	}
}
}