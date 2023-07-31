//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.*;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int m = max(a, b, c);
        System.out.println(m+" is the largest among three");
        int n = min(a, b, c);
        System.out.println(n+ " is the lowest among three");
    }
    public static int max(int a, int b, int c){
        int max = 0;
        if(a>b && a>c) max = a;
        else if(b>a && b>c) max = b;
        else max = c;
        return max;
        // return Math.max(a, Math.max(b, c));
    }
    public static int min(int a, int b, int c){
        int min = 0;
        if(a<b && a<c) min = a;
        else if(b<a && b<c) min = b;
        else min = c;
        return min;
        // return Math.min(a, Math.min(b, c));
    }
}
