package stringPrograms;

import java.util.Locale;

public class palindrome {

    public static void main(String[] args) {

        palindrome pal = new palindrome();
        System.out.println(pal.inbuiltMethod("abcba"));
        System.out.println(pal.inbuiltMethod(""));

        pal.method2("abcbal");
    }

    public boolean inbuiltMethod(String s){

        s = s.toLowerCase();
        if(s.length() == 0) {

           return false;
       }
       StringBuilder sb = new StringBuilder(s);
       String reverse = String.valueOf(sb.reverse());

      if(s.equalsIgnoreCase(reverse)) {
          return true;
      }
      else
          return false;
    }

    public void method2(String str){

        if(str.length() == 0)
        {
            System.out.println("Given "+ str +" is empty");
        }
        else {
            char[] strArray = str.toCharArray();

            String reverse = "";

            for (int i = str.length() - 1 ; i >= 0  ; i--) {
                reverse = reverse + strArray[i];
            }
            if (reverse.equals(str)) {
                System.out.println("Given " + str + " is palindrom");
            }
            else
                System.out.println("Given " + str + " is not palindrom");

        }

    }

}
