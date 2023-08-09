//https://leetcode.com/problems/median-of-two-sorted-arrays/
public class MedianOfTwoSortedArr {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int m1 = -1, m2 = -1;
        int i1 = 0, i2 = 0;

        for (int i = 0; i <= totalLength / 2; i++) {
            m1 = m2;
            if (i1 < nums1.length && (i2 >= nums2.length || nums1[i1] < nums2[i2])) {
                m2 = nums1[i1];
                i1++;
            } else {
                m2 = nums2[i2];
                i2++;
            }
        }

        if (totalLength % 2 == 0) {
            return (m1 + m2) / 2.0;
        } else {
            return m2;
        }
    }
}
