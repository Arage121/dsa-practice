//https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1
public class EquilibriumPoint {
    public static int equilibriumPoint(long arr[], int n) {
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        long leftSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum) {
                return i + 1;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
