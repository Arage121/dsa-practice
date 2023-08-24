//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/
import java.util.*;
public class MaxNoCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        int n = candies.length;
        for(int i=0;i<n;i++){
            if(maxCandies < candies[i]) maxCandies = candies[i];
        }
        ArrayList<Boolean> arr = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies >= maxCandies){
                arr.add(true);
            }
            else{
                arr.add(false);
            }
        }
        return arr;
    }
}
