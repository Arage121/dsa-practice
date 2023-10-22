//https://leetcode.com/problems/happy-number/
public class HappyNumber {
    public boolean isHappy(int n) { // using slow and fast pointer approach of linked list
        int slow = n;
        int fast = n;
        do{
            slow = findSquare(slow); // one time move
            fast = findSquare(findSquare(fast)); //two times move
        }while(slow!=fast);

        if(slow == 1) return true;
        return false; //if slow is not equal to 1, then it means a cycle is present and it will run infinitely
    }

    private int findSquare(int num){
        int ans = 0;
        while(num > 0){
            int rem = num%10;
            ans += rem*rem;
            num /= 10;
        }
        return ans;
    }
}
