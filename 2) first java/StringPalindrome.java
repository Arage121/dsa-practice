//To find out whether the given String is Palindrome or not.
import java.util.*;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String rev = "";
        for(int i=a.length()-1;i>=0;i--){
            rev = rev+a.charAt(i);
        }
        if(a.equals(rev)) System.out.println(a+" is a palindrome");
        else System.out.println("It's not a palindrome");
    }
}
