public class Test31 {

     Test31()
     {
         printGoldbachList(9, 20);
         printGoldbachList(1,2000,50);
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

     void printGoldbachList(int a, int b)
     {
          if(a%2==1) a++; // make sure start on even number
          for (int i = a ; i<=b ; i+=2)
          {
              printGoldbachPair(i);
          }

     }

     void printGoldbachList(int a, int b, int min)
     {
          if(a%2==1) a++; // make sure start on even number
          for (int i = a ; i<=b ; i+=2)
          {
              int [] pair = goldbachPair(i);
              if(pair[0] > min && pair[1] > min) printGoldbachPair(i);
          }
     }

      public static void main(String[] args)
      {
         new Test31();
     }
 }