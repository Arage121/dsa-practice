import java.util.*;
public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        // perfect number is a number whose all factors sum equals to itself
        for(int i=1;i <= n/2;i++){
            if(n%i == 0){
                sum += i;
            }
        }
        if(sum == n) System.out.println(n+" is a perfect number");
        else System.out.println(n+" is not a perfect number");
    }
}
