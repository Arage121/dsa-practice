public class FrequenciesOfLimitedArrElements {
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        P++;
        for(int i=0;i<N;i++){
            int idx = arr[i]%P-1;
            if(idx>=0 && idx<N){
                arr[idx]+=P; // counting frequency
            }
        }

        for(int i=0;i<N;i++){
            arr[i] /= P;
        }
    }

    //more easier approach using hashmap
//    public static void frequencyCount(int arr[], int N, int P)
//    {
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < N; i++) {
//            if (arr[i] >= 1 && arr[i] <= N) {
//                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
//            }
//        }
//
//        for(int i=1;i<=N;i++){
//            arr[i-1] = map.getOrDefault(i, 0);
//        }
//    }
}
