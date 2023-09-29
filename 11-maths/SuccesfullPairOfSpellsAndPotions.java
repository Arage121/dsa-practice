//https://leetcode.com/problems/successful-pairs-of-spells-and-potions/
import java.util.*;
public class SuccesfullPairOfSpellsAndPotions {
    public int[] successfulPairs(int[] s, int[] p, long suc) {
        int[] arr = new int[s.length];
        Arrays.sort(p);
        for(int i=0;i<s.length;i++){
            int l=0;
            int r=p.length-1;
            while(l<=r){
                int m = l+(r-l)/2;
                long prod = (long)s[i]*p[m];
                if(prod >= suc){
                    r = m-1;
                }else{
                    l = m+1;
                }
            }
            arr[i] = p.length-l;
        }
        return arr;
    }
}
