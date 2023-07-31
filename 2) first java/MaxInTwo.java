//Take 2 numbers as input and print the largest number.
import java.util.*;
public class MaxInTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b) System.out.println(a+ " is greater");
        else System.out.println(b+ " is greater");
    }
}
