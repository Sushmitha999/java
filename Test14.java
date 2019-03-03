import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
class Test{
    List<Integer>primeRange(int start, int end) {
        boolean[] primes = new boolean[end + 1];
        Arrays.fill(primes, true);
        for (int i = 2; i < primes.length; i++) {
            for (int j = i + 1; j < primes.length; j++) {
                primes[j] = !primes[j] || j % i == 0 ? false : true;
            }
        }

        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = start; i < primes.length; i++) {
            if (primes[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
}
public class Test14
{
public static void main(String args[])
{
Test t=new Test();
List<Integer> li=new ArrayList<Integer>();
li=t.primeRange(2,45);
System.out.println(li);
}
}