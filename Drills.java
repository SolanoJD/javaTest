/**
 * Write a description of class Drills here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Drills
{
    public static void main (String [] args){
        System.out.println("\f");  // flush the buffer (erase the screen)
        
        //************* Ex A **************************
        // write a void method, paycheck, below main that calculates and prints
        //  a worker's paycheck, given the number of hours, and pay rate
        payCheck(40, 7.75);
        payCheck(20, 9.25);
        payCheck(50, 12.50);
    
        //************ End Ex A **********************/
        //************* Ex B **************************
        // write a void method area below main that calculates and prints
        //  the surface area of a cylinder, given the radius and height
        
        area( 0.5, 3);
        
        area( 2, 2);
        
        // call area one more time to do the last test in the test plan 
        
        //************ End Ex B **********************/
        //************* Ex C **************************
        // write a void method feetAndInches below main that calculates 
        // and prints the number of feet and inches in a given number of 
        // inches
        
        feetAndInches(40);
        
        // call your method two more times to finish the test plan
        

        
        //************ End Ex C **********************/
        //************* Ex D **************************
        // write a void method averageSale below main that calculates 
        // and prints the the average sale of a comic book sold at
        // a convention
        averageSale(500,47);
        averageSale(434,13);
        averageSale(122,15);
               
        // call your method three times to verify the test plan
        

        
        //************ End Ex D **********************/
        
    }
    // Define method paycheck here
    public static void payCheck(double hours, double payRate){
        double pay = hours * payRate;
        System.out.println("Your paycheck is: "+ pay);
        
    }


    
    // Define method area here
    public static void area(double radius, double height){
        double surfaceArea = 2*3.14*radius*height+2*3.14*(radius*radius);
        System.out.println("The area of the cylinder is "+surfaceArea );
    }
    
    // Define method feetAndInches here
    public static void feetAndInches(double inches){
        double feetInches = inches / 12;
        System.out.println("You input: "+ inches + ". That is: "+ feetInches+ 
        "feet long");
    }
    
    
    // Define method averageSale here
    public static void averageSale(double revenue, double numSold){
        double avg = revenue / numSold;
        System.out.println("Your book made: "+revenue+" in revenue and sold "
        + numSold + " times! The average sale was: "+avg);
    }
    
    

    
}
