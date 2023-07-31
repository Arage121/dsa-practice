//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.*;
public class SumtillX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n;
        int a=0;
        while(true){
            n = sc.nextInt();
            if(n == 0) break;
            sum += n;
            if(a < n) a = n;
        }
        System.out.println(sum);
        System.out.println("Greatest number among them is: " + a);
    }
}
