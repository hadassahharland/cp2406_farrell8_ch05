// DebugFive3.java
// Determines whether item number on order is valid
// Over 999 invalid
// Less than 111 Invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher Housewares Department
import java.util.Scanner;
public class FixDebugFive3
{
   public static void main (String args[])
   {
      int item;
      String output;
      final int HIGH = 111;
      final int CUTOFF = 999;
      final int LOW = 500;
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter item number");
      item = input.nextInt();
      if(item <= LOW)           // item less than or equal to LOW
         output = "Item number too low";
      else                      // reachable for item greater than LOW
        if(item >= HIGH)        // item greater than or equal to HIGH
          output = "Item number too high";
        else                    // reachable for item between LOW and HIGH
          if(item <= CUTOFF)    // item less than or equal to CUTOFF
             output = "Valid - in Automotive Department";
          else                  // reachable for item between CUTOFF and HIGH
             output = "Valid - Item in Housewares Department";
       System.out.println(output);
   }
}


