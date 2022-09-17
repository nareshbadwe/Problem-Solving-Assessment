package Java_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CombinationFromCoins {

	public static final int[] DENO = {1,2,5,10};
    public static final int AMOUNT = 35;
    public static int count = 0;
  
    public static void change(int amount) {
      change(amount, new ArrayList<>(),0);  
    }
  
    private static void change(int rem, List<Integer> coins, int pos) {    
      if (rem == 0) {
        count++;
        System.out.println(count+")"+coins);
        return;
      }
      
      while(pos<DENO.length){            
        if (rem >= DENO[pos]) {
          coins.add(DENO[pos]);
          change(rem - DENO[pos], coins,pos);
          coins.remove(coins.size() - 1);  //backtrack
        }
        pos++;
      }  
    }
  
    public static void main(String[] args) {
          change(AMOUNT);
    }  
}
