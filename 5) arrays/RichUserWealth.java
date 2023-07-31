//https://leetcode.com/problems/richest-customer-wealth/
public class RichUserWealth {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for(int i=0;i<accounts.length;i++){
            int sum = 0;
            for(int j=0;j<accounts[i].length;j++){
                sum += accounts[i][j];
            }
            if(ans < sum) ans = sum;
        }
        return ans;
    }
}
