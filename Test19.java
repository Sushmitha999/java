import java.util.*; 
public class Test19
{ 
    public static void main(String[] args) 
    { 
        List<Integer> al = new ArrayList<>(); 
        al.add(10); 
        al.add(20); 
        al.add(30); 
        al.add(40); 
        al.add(50);
	al.add(60); 
        Iterator itr = al.iterator(); 
        while (itr.hasNext()) 
        { 
            int x = (Integer)itr.next(); 
            if (x < 30) 
                itr.remove(); 
        } 
        System.out.println("new List : "+ al); 
    } 
} 