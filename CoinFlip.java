//this made by jd solano tested by me on blueJ
import java.util.Random;
public class CoinFlip{
  public static void main(String[] args){
    Random r = new Random();
    int heads =0;
    int tails =1;
    r.nextInt(2);
    if(r.nextInt(2)==0){
      System.out.println("Heads");
    }
    else{
      System.out.println("Tails");
    }
  }
}
