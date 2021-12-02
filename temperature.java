import java.util.*;
import java.math.*;

class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        if (N == 0)
            System.out.println("0");
        else {
            int T;
            int min = Integer.MAX_VALUE;
            /* Search the temperature of minimum absolute valueReads
               Note a subtilty of the exercice : a temperature T>0 is prefered over -T */
            for (int i = 0; i < N; i++) {
                T = in.nextInt();
                if (Math.abs(T) < Math.abs(min) || (T == -min && T > 0))
                    min = T;
            }
            System.out.println(min);
        }
    }
}
