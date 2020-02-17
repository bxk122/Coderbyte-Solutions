//Have the function QuestionsMarks(str) take the str string parameter, which will contain single digit numbers, letters, and 
//question marks, and check if there are exactly 3 question marks between every pair of two numbers that add up to 10. If so, 
//then your program should return the string true, otherwise it should return the string false. If there aren't any two numbers
//that add up to 10 in the string, then your program should return false as well.

//For example: if str is "arrb6???4xxbl5???eee5" then your program should return true because there are exactly 3 question marks 
//between 6 and 4, and 3 question marks between 5 and 5 at the end of the string.

import java.util.*; 
import java.io.*;

class Main {

  public static String QuestionsMarks(String sen)
   {
    sen = sen.replaceAll("[^0-9?]", ""); 
    boolean check = false;
    for(int i = 0; i < sen.length()-2; i++) 
    {
        if ((sen.substring(i,i+3).matches("[0-9]+[?]+[0-9]"))){
          if ((Integer.parseInt(sen.substring(i,i+1)) + (Integer.parseInt(sen.substring(i+2,i+3))) == 10)) 
            {
                return "false";
            }
        }
    }
    for(int i = 0; i < sen.length()-4; i++) 
    {
        if ((sen.substring(i,i+4).matches("[0-9]+[?]+[?]+[0-9]"))){
          if ((Integer.parseInt(sen.substring(i,i+1)) + (Integer.parseInt(sen.substring(i+3,i+4))) == 10)) 
            {
                return "false";
            }
        }
        if ((sen.substring(i,i+5).matches("[0-9]+[?]+[?]+[?]+[0-9]")))
        {
            if ((Integer.parseInt(sen.substring(i,i+1)) + (Integer.parseInt(sen.substring(i+4,i+5))) == 10)) 
            {
                check = true;
            }
            else if((Integer.parseInt(sen.substring(i,i+1)) + (Integer.parseInt(sen.substring(i+4,i+5))) != 10)) 
            {
                check = false;
            }
               
        }   
    }
    if (check == true) 
    {
        return "true";
    }
    return "false";
  }
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(QuestionsMarks(s.nextLine())); 
  }

}
