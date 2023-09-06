//https://www.codechef.com/SEP23D/problems/SLOWSTART
import java.util.*;
import java.lang.*;

    /* Name of the class has to be "Main" only if the class is public. */
    class SlowStart
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while(T-- > 0){
                int x = sc.nextInt();
                int h = sc.nextInt();

                System.out.println(func(x, h));
            }
        }

        public static int func(int x, int h) {
            int count = 0;

            // Calculate damage for the first five turns
            while (count < 5 && h > 0) {
                h -= x / 2;
                count++;
            }

            // If the opponent's health is not yet zero, continue attacking
            while (h > 0) {
                h -= x;
                count++;
            }

            return count;
        }

}
