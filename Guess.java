import java.util.Scanner;
/**
 * Write a description of class Guess here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Guess
{
    public static void main(String[] args){
        ask();
    }

    public static int ask(){
        Scanner guess = new Scanner(System.in);
        double secret = Math.floor(Math.random()*10)+1;
        System.out.print("\f");
        System.out.println("I've got a number 0 to 10.");
        int num;
        do{
            System.out.println("Whats your guess?");
            num = guess.nextInt();
            if(num<secret){
                System.out.println("Guess higher");
            }
            else if(num>secret){
                System.out.println("Guess lower");
            }
            else if(num==secret){
                System.out.println("Correct!");

            }
        }while(secret != num);
        return num;
    }
}
