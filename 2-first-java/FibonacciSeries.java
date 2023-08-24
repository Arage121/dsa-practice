//To calculate Fibonacci Series up to n numbers.
import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int i=2;i<=n;i++){
            int temp = b;
            b = b+a;
            a = temp;
        }
        System.out.println(b);
    }
}
