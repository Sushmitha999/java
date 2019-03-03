import java.util.*;
import java.util.stream.LongStream;
class Test
{
boolean isPrime(long num)
{
return !LongStream.rangeClosed(2,Math.round(Math.sqrt(num))).anyMatch(n->num%n==0);
}
}
public class Test11{
public static void main(String args[]){
Test t=new Test();
System.out.println(t.isPrime(21));
System.out.println(t.isPrime(43));
}}

