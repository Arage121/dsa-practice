//https://leetcode.com/problems/reverse-string/
public class ReverseString {
    public void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        while(start<end){
            swap(s, start, end);
            start++;
            end--;
        }
    }
    public void swap(char[] a, int s, int e){
        char temp = a[s];
        a[s] = a[e];
        a[e] = temp;
    }
}
