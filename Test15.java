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
}
public class Test15
{
public static void main(String args[])
{
Test t=new Test();
System.out.println(t.gcd(4,16));
System.out.println(t.gcd(6,21));
}
}