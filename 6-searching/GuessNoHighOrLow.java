//https://leetcode.com/problems/guess-number-higher-or-lower/
// based on binary search
public class GuessNoHighOrLow {
    /**
     * Forward declaration of guess API.
//     * @param  num   your guess
     * @return 	     -1 if num is higher than the picked number
     *			      1 if num is lower than the picked number
     *               otherwise return 0
     * int guess(int num);
     */
        public int guessNumber(int n) {
            if(n==1) return 1;
            int s = 1;
            int e = n;
            int m;
            while(s<=e){
                m = s+(e-s)/2;
                if(guess(m) == 0) return m;
                else if(guess(m) == -1) e = m-1;
                else s = m+1;
            }
            return s;
        }

        public int guess(int num){
            //this is not the real function, actually in leetcode it is the helper function provided by them
            return -1;
        }
}
