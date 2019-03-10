//encoding
public class Test28 {

      Test28()
      {
          System.out.println(encode("Hello World"));
      }
      String encode(String s)
      {
          String encoding = "";
          s=s.toLowerCase();
          String [] words = s.split("\\s+");
          for (String word : words)
          {
              for(int i = 0; i<word.length() - 1 ; i++)
              {
                  encoding = encoding + ((int)word.charAt(i)-96) + ",";
              }
              encoding = encoding + ((int)word.charAt(word.length()-1)-96) + " ";
          }

          return encoding;
      }

      public static void main(String[] args) {
          new Test28();
      }
  }