//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class NoOfStepsToReduceNoToZero {
        public int numberOfSteps(int num) {
            if(num == 0) return 0;
            if(num%2==0){
                return numberOfSteps(num/2)+1;
            }
            return numberOfSteps(num-1)+1;
        }
}
