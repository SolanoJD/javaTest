import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Write a description of class PartB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PartB
{
    public static void main (String [] args)
    {
        System.out.print("\f");
        //**************  Prob 1 ************************
        // Run this code, then generalize it. Make a method outside main called countLetters        
        //   the method takes a String and a char and counts how many 
        //   times the char appears in the String
        //      use the following calls to test your method:
        //
        System.out.println("Number of x's in xerox = " + countLetters("xerox", 'x'));
        System.out.println("Number of s's in mississippi = " + countLetters("mississippi", 's'));
        /*
        String fruit = "banana";
        int count = 0;
        int length = fruit.length();
        int index = 0;
        while (index < length) {
            if (fruit.charAt(index) == 'a') {
                count = count + 1;                     // or count++;
            }
            index = index + 1;                         // or index++;
        }
        System.out.println("Number of a's found = " + count);                

        //*************** end Prob 1 ************************/
        //**************  Prob 2 ************************

        boolean flag = true, test = false; 
        char letter = 'g', grade = 'a';
        int x = 5, y = 10;
        String s = "hello", t = "goodbye";

        //System.out.println("Adding a boolean and a boolean gives "  +  (flag + test));
        System.out.println("Adding a String and a char gives "  +  (s + letter));
        //*************** end Prob 2 ************************/
        //**************  Prob 3 ************************     
        // develop your methods for the Palindrome problem and test with these calls
        //   add a few more tests of your own

        System.out.println("First letter of coffee is " + first("coffee"));
        System.out.println("Last letter of coffee is " + last("coffee"));
        System.out.println("Middle letters of coffee are " + middle("coffee"));
        System.out.println("Middle letters of so are " + middle("so"));
        // 
        System.out.println("Is otto a palindrome? " + isPalindrome("otto"));
        System.out.println("Is racecar a palindrome? " + isPalindrome("racecar"));
        System.out.println("Is racecars a palindrome? " + isPalindrome("racecars"));

        //*************** end Prob 3 ************************/
        /**************  Prob 4 ************************     
        // test your isPalindromeIter method here

        //*************** end Prob 4 ************************/
        /**************  Prob 5 ************************     
        // read the contents of the file "words.txt" and print out only the palindromes

        //*************** end Prob 5 ************************/        

    }

    public static int countLetters(String word, char letter){

        int count = 0;
        int length = word.length();
        int index = 0;
        while (index < length) {
            if (word.charAt(index) == letter) {
                count = count + 1;                     // or count++;
            }
            index = index + 1;                         // or index++;
        }
        
        return count;
    }
    public static char first(String word){
        return word.charAt(0);
    }
    public static char last(String word){
        int index = word.length()-1;
        return word.charAt(index);
    }
    public static String middle(String word){
        int index = word.length()-1;
        return word.substring(1, index);
    }
    public static boolean isPalindrome(String word){
        int index = word.length()-1;
        int start = 0;
        if(index<=1){
            return true;
        }
        else if(index == 2){
            if(first(word) == last(word)){
                return true;
            }
        }
        else{
            while(start<index){
                if(first(word) !=last(word)){
                    return false;
                }
                start++;
                index--;
            }
        }
        return true;
    }
}
