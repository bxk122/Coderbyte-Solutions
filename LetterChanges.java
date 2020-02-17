//Have the function LetterChanges(str) take the str parameter being passed and modify it using the following algorithm. 
//Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a). 
//Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string.

import java.util.*; 
import java.io.*;

class LetterChange {

   public static String LetterChanges(String str) 
      {
        String k = "";
        int len = str.length();
            for(int i = 0; i < len; i++)
            {
              char c = str.charAt(i);
              int ascii = (char) c;
              if((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122) ) 
              {
                  int newAscii = ascii + 1;
                  char d = (char) newAscii;
                  if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u') 
                  {
                      d = Character.toUpperCase(d);
                  }
                  k = k + Character.toString(d);
              }
              else 
              {
                  k = k + str.charAt(i);
              }
            }
        return k;
      }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterChanges(s.nextLine())); 
  }

}
