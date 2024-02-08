/**
 * Write a description of class Challenge here.
 *
 * @author (JD Solano)
 */
public class Challenge
{
    public static void main(String[] args){
        quadratic(1,-6,8);
    }
    
    public static void quadratic(double a,double b,double c){
        double equaOne = ((0-b) + Math.sqrt((b*b)-4*a*c))/(2*a);
        double equaTwo = ((0-b) - Math.sqrt((b*b)-4*a*c))/(2*a);
        System.out.println("X1 is equal to: "+ equaOne+ ". X2 is equal to: "+equaTwo);
    }
}
