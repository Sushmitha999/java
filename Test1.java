import java.util.*;
class Last{
int last(LinkedList<Integer> elements) {
        return elements.getLast();
    }
}
class Test1{
public static void main(String args[])
{
LinkedList<Integer> al=new LinkedList<Integer>();
al.add(1);
al.add(3);
al.add(5);
al.add(7);
al.add(9);
Last l=new Last();
System.out.println(l.last(al));
}
}