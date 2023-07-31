//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // S.I = P*R*t/100
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        int SI = (p*r*t)/100;
        System.out.println(SI);
    }
}
