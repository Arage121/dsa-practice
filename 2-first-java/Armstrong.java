//To find Armstrong Number between two given number.
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=n;i<=m;i++){
            int ans = 0;
            int on = i;
            int temp = i;
            while (temp > 0){
                int rem = temp%10;
                ans = ans + (rem*rem*rem);
                temp = temp/10;
            }
            if(ans == on) System.out.print(on + " ");
        }
    }
}
