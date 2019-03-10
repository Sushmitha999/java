public class Test30{

    Test30()
     {
         printGoldbachPair(28);
         printGoldbachPair(1856);
     }

   boolean isPrime(int a)
     {
         if(a==1) return false;
         if(a==2) return true;

          boolean prime = true;
          int count = 2;

          do
          {
              if (a%count==0)
              {
                  prime = false;
              }
              count++;
          } while(prime == true && count*count <=a);

          return prime;
     }
     int [] goldbachPair(int n)
     {
          int count = 2;
          int [] pair = new int[2];
          boolean foundPair = false;
          while(foundPair == false && count <= n/2)
          {
              if(isPrime(count) && isPrime(n-count))
              {
                  foundPair = true;
                 pair [0] = count;
                  pair [1] = (n-count);
              }
              count++;
          }
          return pair;
     }

     void printGoldbachPair(int n)
     {
          int [] pair = goldbachPair(n);
          System.out.println(pair[0] + " + " + pair [1] + " = " + n);
     }


      public static void main(String[] args)
      {
         new Test30();
      }
  }
