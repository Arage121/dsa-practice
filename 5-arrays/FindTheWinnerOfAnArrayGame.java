//https://leetcode.com/problems/find-the-winner-of-an-array-game/description/
public class FindTheWinnerOfAnArrayGame {
    public int getWinner(int[] arr, int k) {
        int n = arr.length;
        if (k >= n - 1) {
            // If k is greater than or equal to n - 1, the maximum element will be the winner.
            int max = 0;
            for (int i = 0; i < n; i++) {
                max = Math.max(max, arr[i]);
            }
            return max;
        }

        int wins = 0;
        int current = arr[0];

        for(int i=1;i<n;i++){
            if(arr[i] > current){
                wins = 1;
                current = arr[i];
            }else{
                wins++;
            }

            if(wins == k) return current;
        }
        return current;
    }
}
