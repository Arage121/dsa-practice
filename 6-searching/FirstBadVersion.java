//https://leetcode.com/problems/first-bad-version/
public class FirstBadVersion {
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
        public int firstBadVersion(int n) {
            int s = 1;
            int e = n;
            int m;
            while(s<e){
                m = s+(e-s)/2;
                if (isBadVersion(m)) {
                    e = m; // The first bad version is on the left half
                } else {
                    s = m + 1; // The first bad version is on the right half
                }
            }

            return s; // left == right, which is the first bad version
        }
        public boolean isBadVersion(int n){
            //this is not the real function, actually in leetcode it is the helper function provided by them
            return true;
        }
}
