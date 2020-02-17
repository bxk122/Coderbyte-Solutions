//Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it.
//For example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24.
//For the test cases, the range will be between 1 and 18 and the input will always be an integer.

import java.util.*; 
import java.io.*;

class Main {

  public static int FirstFactorial(int num)
   {
     int a = num;
    for(int i = 1; i < a; i++) 
    {
      num = i * num;
    }
    return num;
  }

  public static void main (String[] args) {  
       
    Scanner s = new Scanner(System.in);
    System.out.print(FirstFactorial(s.nextLine()));

  }

}
