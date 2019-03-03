import java.util.*;
class Last{
int num(List<Integer>list,int i)
    {
  	if(list.isEmpty())
{
return i;
}
return num(list.subList(1,list.size()),i+1);
    }
}
class Test5{
public static void main(String args[])
{
List<Integer> li=new ArrayList <Integer>();  
li.add(1);
li.add(4);
li.add(7);
li.add(13);
li.add(18);
li.add(28);
li.add(41);
Last l=new Last();
System.out.println(l.num(li,0));
}
}