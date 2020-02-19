//Have the function AlphabetSoup(str) take the str string parameter being passed and return the string with the letters in 
//alphabetical order (ie. hello becomes ehllo). Assume numbers and punctuation symbols will not be included in the string.

import java.util.*; 
import java.io.*;

class Main {  
    public static String AlphabetSoup(String str) {
        char[] strChars = str.toCharArray();
        Arrays.sort(strChars);
        return new String(strChars);
    }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(AlphabetSoup(s.nextLine())); 
  }

}
