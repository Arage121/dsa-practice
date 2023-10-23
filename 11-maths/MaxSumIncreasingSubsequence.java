public class MaxSumIncreasingSubsequence {
    public static void main(String[] args) {
        int N = 5, arr[] = {1, 101, 2, 3, 100};
        System.out.println(maxSumIS(arr, N));
    }

    public static int maxSumIS(int arr[], int n)//understand this one properly
    {
        int[] msis = new int[n];

        for (int i = 0; i < n; i++) {
            msis[i] = arr[i];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && msis[i] < msis[j] + arr[i]) {
                    msis[i] = msis[j] + arr[i];
                }
            }
        }

        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            if (msis[i] > maxSum) {
                maxSum = msis[i];
            }
        }

        return maxSum;
    }
}
