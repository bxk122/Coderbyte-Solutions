//Have the function FindIntersection(strArr) read the array of strings stored in strArr which will contain 2 elements: 
//the first element will represent a list of comma-separated numbers sorted in ascending order, the second element will 
//represent a second list of comma-separated numbers (also sorted). Your goal is to return a comma-separated string containing
//the numbers that occur in elements of strArr in sorted order. If there is no intersection, return the string false.

//For example: if strArr contains ["1, 3, 4, 7, 13", "1, 2, 4, 13, 15"] the output should return "1,4,13" because those 
//numbers appear in both strings. The array given will not be empty, and each string inside the array will be of numbers 
//sorted in ascending order and may contain negative numbers.

import java.util.*; 
import java.io.*;

class Main {

   public static String FindIntersection(String[] strArr) 
  {
    String[] c = strArr[0].split(", "); 
    String[] d = strArr[1].split(", "); 
    int i = 0;
    int j = 0;
    StringBuilder stbuild = new StringBuilder();
    String k = "";
    
    while(i < c.length && j < d.length) 
    {
        
            if(Integer.parseInt(c[i]) == Integer.parseInt(d[j])) 
            {
                stbuild.append(c[i]+",");
                k = stbuild.toString();
                i++;
                j++;
                
            }
            else if(Integer.parseInt(c[i]) < Integer.parseInt(d[j]))
            {
                i++;
                
            }
            else 
            {
                j++;
                
            }
    
    }
    if(k.length() == 0 )
      strArr[0] = "false";
    else {
       k = k.substring(0,k.length()-1);
    strArr[0] = k;
    }
    
    return strArr[0];
   
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FindIntersection(s.nextLine())); 
  }

}
