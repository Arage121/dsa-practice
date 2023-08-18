//https://leetcode.com/problems/reverse-string/
public class ReverseString {
        public void reverseString(char[] s) {
            swap(s, 0, s.length-1);
        }
        public void swap(char[] a, int s, int e){
            if(s>=e) return;
            char temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            swap(a,s+1,e-1);
        }
}
