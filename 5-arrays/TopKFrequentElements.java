import java.util.*;
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int i : nums){
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0)+1);
        }

        for(int key : frequencyMap.keySet()){
            int freq = frequencyMap.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int[] res = new int[k];
        int counter = 0;

        for(int pos = bucket.length-1;pos>=0 && counter<k;pos--){
            if(bucket[pos] != null){
                for(Integer i : bucket[pos]){
                    res[counter++] = i;
                }
            }
        }
        return res;
    }
}
