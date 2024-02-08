/**
   This program computes test average for three test scores
   tested on blueJ by me
*/

public class TestAverage
{
   public static void main (String [] args)
   {
      System.out.println("\f");  // flush the buffer (erase the screen)

      // call your method three times here
      average3(78,83,93);
      average3(80,90,100);
      average3(10,30,120);
      
   }  

   // define the method average3 here
   public static void average3(double scoreOne, double scoreTwo, double scoreThree){
       double avg = (scoreOne+scoreTwo+scoreThree)/3;
       System.out.println("The average of the three is: "+ avg);
    }
}
