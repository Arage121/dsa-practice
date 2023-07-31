//Define a program to find out whether a given number is even or odd.
import java.util.*;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(eveorodd(x));
    }
    public static boolean eveorodd(int a){
        return a%2==0;
    }
}
