import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
}
public class Test16
{
public static void main(String args[])
{
Test t=new Test();
System.out.println(t.coprime(2,3));
System.out.println(t.coprime(6,21));
}
}