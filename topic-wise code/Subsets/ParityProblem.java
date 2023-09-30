public class ParityProblem {
    // you have to print the max length of subarray whose sum is even(but here we have used logic not subarrays found and then counting)
    static int parityProblems(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        if (sum % 2 == 0) {
            return arr.length; // Sum is already even, return the length of the array.
        } else if (oddCount > 0) {
            return arr.length - 1; // Make sum even by removing one odd element.
        } else {
            return 0; // No odd element available to make the sum even.
        }
    }
}