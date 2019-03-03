import java.util.Scanner;
//prime factors of a number
public class Test12 {
   public static void main(String args[]){
	int number=24;
      for(int i = 2; i< number; i++) {
         while(number%i == 0) {
            System.out.println(i+" ");
            number = number/i;
         }
      }
      if(number >2) {
         System.out.println(number);
      }
   }
}