//https://leetcode.com/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/
public class RemoveIfBothNeighborsAreSame {
    public boolean winnerOfGame(String colors) {
        int consecutiveA = 0;
        int consecutiveB = 0;
        int countA = 0;
        int countB = 0;
        for(char c: colors.toCharArray()){
            if(c == 'A'){
                consecutiveA++;
                consecutiveB = 0;
                if(consecutiveA >= 3){
                    countA += consecutiveA-2;
                }
            }else if(c == 'B'){
                consecutiveB++;
                consecutiveA = 0;
                if(consecutiveB >= 3){
                    countB += consecutiveB-2;
                }
            }
        }
        return countA > countB;
    }
}
