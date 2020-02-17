//Have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string. 
//If there are two or more words that are the same length, return the first word from the string with that length. 
//Ignore punctuation and assume sen will not be empty.

import java.util.*; 
import java.io.*;

class Main {

  public static String LongestWord(String sen) 
  {
    
      String a = sen.replaceAll("[^a-zA-Z0-9]"," ");
      String[] arr = a.split(" ");
      int i = 0;
      int j = 1;
      while(i < arr.length && j < arr.length)
      {
             if(arr[i].length() < arr[j].length()) 
              {
                  sen = arr[j];
                  i=j;
                  j++;
              }
              else if((arr[i].length() >= arr[j].length())) 
              {
                  sen = arr[i];
                  j++;
              }
    
    } 
    return sen;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }

}
