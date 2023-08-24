//Write a function to check if a given triplet is a Pythagorean triplet or not.
//(A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
import java.util.*;
public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(triplets(a, b, c));
    }
    public static boolean triplets(int a, int b, int c){
        int hyp = Math.max(a, Math.max(b, c));
        int base = Math.min(a, Math.min(b, c));
        int per = 0;
        if(a<hyp && a>base) per=a;
        else if(b<hyp && b>base) per=b;
        else per=c;

        return (hyp*hyp) == (per*per)+(base*base);
    }
}
