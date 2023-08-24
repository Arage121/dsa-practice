//Input currency in rupees and output in USD.
import java.util.*;
public class RupeesToDollars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        double dollars = money * 0.012;
        System.out.println(dollars+"$");
    }
}
