import java.util.Scanner;
/**
 * Write a description of class GallonsToLiters here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GallonsToLiters
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String answer;
        do{
            
            ask();
            System.out.print("Try Again?");
            answer = scanner.nextLine();
        }while(answer.equalsIgnoreCase("yes"));
        
    }
    
    public static void ask(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\f");
        System.out.print("Enter the starting number of Gallons: ");
        double start = scanner.nextDouble();
        System.out.print("Enter the ending number of Gallons: ");
        double end = scanner.nextDouble();
        System.out.print("Enter the step size in Gallons: ");
        double step = scanner.nextDouble();
        
        double output = start;
        
        while (output <= end){
            double calculated = output * 3.78541178;
            System.out.println(output + " gallons  =  "+calculated+"liters");
            output += step;
        }
        
    }
}
