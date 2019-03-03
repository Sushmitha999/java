import java.util.*; 

import java.util.stream.Stream;  
public class Test8 { 
    static <T> Stream<T> flatten(T[][] arrays) 
    { 
        List<T> list = new ArrayList<>(); 
        for (T[] array : arrays) { 
            Arrays.stream(array).forEach(list::add); 
        } 
        return list.stream(); 
    } 
  
    public static void main(String[] args) 
    { 
 
        Integer[][] arr = { 
            { 1, 2, 3 }, 
            { 4, 5}, 
            { 6, 7, 8 },
	    { 9, 10, 11}
        }; 
        Integer[] flatArray = flatten(arr).toArray(Integer[] ::new); 
 
        System.out.println(Arrays.toString(flatArray)); 
    } 
} 