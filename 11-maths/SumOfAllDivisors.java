//https://practice.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1
public class SumOfAllDivisors {
    public static void main(String[] args) {
        System.out.println(sumOfDivisors(5));
    }
    static long sumOfDivisors(int N) {
        long sum = 0;
        for(int i=1;i<=N;i++){
            sum+=i*(N/i);
        }
        return sum;
    }
}
