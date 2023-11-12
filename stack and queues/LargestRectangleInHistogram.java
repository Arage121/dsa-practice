//https://leetcode.com/problems/largest-rectangle-in-histogram/
public class LargestRectangleInHistogram { // understand it properly
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] leftBoundaries = new int[n];
        int[] rightBoundaries = new int[n];

        // Precompute left boundaries
        for (int i = 0; i < n; i++) {
            int left = i - 1;
            while (left >= 0 && heights[left] >= heights[i]) {
                left = leftBoundaries[left];
            }
            leftBoundaries[i] = left;
        }

        // Precompute right boundaries
        for (int i = n - 1; i >= 0; i--) {
            int right = i + 1;
            while (right < n && heights[right] >= heights[i]) {
                right = rightBoundaries[right];
            }
            rightBoundaries[i] = right;
        }

        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int area = heights[i] * (rightBoundaries[i] - leftBoundaries[i] - 1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}
