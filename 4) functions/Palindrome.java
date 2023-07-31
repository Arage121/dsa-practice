//Write a function to find if a number is a palindrome or not. Take number as parameter.
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(palindrome(x));
    }
    public static boolean palindrome(int x){
        int o_n = x;
        int rev = 0;
        while(x > 0){
            int rem = x%10;
            x /=10;
            rev = rev*10+rem;
        }
        return rev == o_n;
    }
}
