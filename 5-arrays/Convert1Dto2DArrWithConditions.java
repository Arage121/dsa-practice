//https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/
import java.util.*;
public class Convert1Dto2DArrWithConditions {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int[] freq = new int[201];
        int maxFreq = 0;
        for(int num : nums){
            freq[num]++;
            maxFreq = Math.max(maxFreq, freq[num]);
        }

        for(int i=0;i<maxFreq;i++){
            result.add(new ArrayList<>());
        }

        for(int i=1;i<201;i++){
            if(freq[i] == 0) continue;
            int row=0;
            for(int j=0;j<freq[i];j++){
                result.get(row).add(i);
                row++;
            }
        }

        return result;
    }
}
