// DebugFive4.java
// Outputs highest of four numbers
import javax.swing.*;
public class FixDebugFive4
{
   public static void main (String args[]) 
   {
      int one, two, three, four;
      String str, output;
      str = JOptionPane.showInputDialog(null,"Enter an integer");
      one = Integer.parseInt(str);
      str = JOptionPane.showInputDialog(null,"Enter an integer");
      two = Integer.parseInt(str);
      str = JOptionPane.showInputDialog(null,"Enter an integer");
      three = Integer.parseInt(str);
      str = JOptionPane.showInputDialog(null,"Enter an integer");
      four = Integer.parseInt(str);
      if(one > two && one > three && one > four)            // if one is highest
         output = "Highest is " + one;
      else                                                  // else one is not highest
         if(two > one && two > three && two > four)         // if two is highest
            output = "Highest is " + two;
         else                                               // else one and two are not highest
           if(three > one && three > two && three > four)  // if three is highest
              output = "Highest is " + three;
           else                                             // else one, two and three are not highest
              output = "Highest is " + four;
      JOptionPane.showMessageDialog(null, output);
   }
}


