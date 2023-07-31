//Write a function that returns all prime numbers between two given numbers.
import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a;i<=b;i++){
           if(prime(i)) System.out.print(i+" ");
        }
    }
    public static boolean prime(int p){
        if(p <= 1) return false;
        for(int i=2;i*i<=p;i++){
            if(p%i == 0) {
                return false;
            }
        }
        return true;
    }
}
