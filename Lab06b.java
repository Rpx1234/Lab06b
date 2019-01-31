//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab06b
{
 public static void main( String args[] )
 {
  
   
   StringEquality test = new StringEquality("hello","goodbye");
   out.println(test);
   out.println();
   
   test.setWords("one","two");
   out.println(test);
   out.println();
   
   test.setWords("three","four");
   out.println(test);
   out.println();
   
   test.setWords("TCEA","UIL");
   out.println(test);
   out.println();
   
   test.setWords("State","Champions");
   out.println(test);
   out.println();
   
   test.setWords("ABC","ABC");
   out.println(test);
   out.println();
  
   test.setWords("ABC","CBA");
   out.println(test);
   out.println();
   
   test.setWords("Same","Same");
   out.println(test);
   out.println();
  //add test cases
  
  
  
  
  
  
 }
}