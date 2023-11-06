//https://www.hackerrank.com/challenges/game-of-two-stacks/problem
import java.util.*;
public class GameOfTwoStacks {
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        int totalSum = 0;
        int countA = 0;
        int countB = 0;
        int result = 0;

        for(Integer i : a){
            if(totalSum + i > maxSum) break;
            totalSum += i;
            countA++;
        }

        result = countA;

        for(Integer i : b){
            totalSum += i;
            countB++;
            while(totalSum>maxSum && countA>0){
                totalSum -= a.get(countA-1);
                countA--;
            }
            result = (totalSum <= maxSum) ? Math.max(countA+countB, result) : result;
        }
        return result;
    }
}
