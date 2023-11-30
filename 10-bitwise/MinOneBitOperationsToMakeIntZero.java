public class MinOneBitOperationsToMakeIntZero {
    int min = Integer.MAX_VALUE;
    public int minimumOneBitOperations(int n) { // understand this one properly
        if (n <= 1) return n;
        int count = 0;
        while ((1<<count) <= n) count++;
        return ((1<<count)-1) - minimumOneBitOperations(n-(1<<(count-1)));
    }
}
