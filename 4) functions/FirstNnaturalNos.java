//Write a function that returns the sum of first n natural numbers.
import java.util.*;
public class FirstNnaturalNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = natural(n);
        System.out.println(ans);
    }
    public static int natural(int n){
        return n*(n+1)/2;
    }
}
