public class Test29 {

      Test29()
      {
          System.out.println(decode("9 14,5,22,5,18 19,1,23 1 16,21,18,16,12,5 3,15,23"));
      }

      String decode(String s)
      {
          String decoding = "";
          String [] words = s.split("\\s+");
          for (String word : words)
          {
              String [] codes = word.split(",");
              for (String code: codes)
              {
                  int c = Integer.parseInt(code.trim());
                  decoding = decoding + (char)(c+96);
             }
              decoding = decoding + " ";
          }
          return decoding;
      }

      public static void main(String[] args) {
          new Test29();
      }
  }