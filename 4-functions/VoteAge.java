//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
import java.util.*;

public class VoteAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(vote(age));
    }
    public static boolean vote(int x){
        return x >= 18 && x <= 100;
    }
}
