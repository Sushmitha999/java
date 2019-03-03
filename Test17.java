import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//Euler's totient function:no. of integers co prime to a given number
class Test{
    int gcd(int first, int second) {
        if (first == 0) {
            return second;
        } else if (second == 0) {
            return first;
        } else if (first > second) {
            return gcd(first - second, second);
        } else {
            return gcd(first, second - first);
        }
    }
boolean coprime(int first, int second) {
        return gcd(first, second) == 1;
    }
long phi(int m) {
        return IntStream.rangeClosed(1, m).filter(r->coprime(r, m)).count();
    }
}
public class Test17
{
public static void main(String args[])
{
Test t=new Test();
System.out.println(t.phi(7));
System.out.println(t.phi(21));
}
}