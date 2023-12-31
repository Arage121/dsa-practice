//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class FindthefirstoccurenceinaString {
        public int strStr(String haystack, String needle) { // sliding window approach, understand properly
            int hLen = haystack.length();
            int nLen = needle.length();
            int nIndex = 0;
            for(int i=0; i<hLen; i++){
                // as long as the characters are equal, increment needleIndex
                if(haystack.charAt(i)==needle.charAt(nIndex)){
                    nIndex++;
                }
                else{
                    // start from the next index of previous start index
                    i=i-nIndex;
                    // needle should start from index 0
                    nIndex=0;
                }
                // check if needleIndex reached needle length
                if(nIndex==nLen){
                    // return the first index
                    return i-nLen+1;
                }
            }
            return -1;
        }
}
