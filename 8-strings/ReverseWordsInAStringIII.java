//https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        char[] c = s.toCharArray();
        int i=0;
        for(int j=0;j<c.length;j++){
            if(c[j] == ' '){
                reverse(c, i, j-1); // we have to take j-1 as j contains only blank space
                i=j+1;
            }
        }
        reverse(c, i, c.length-1); // reverse last word(as at the end it's not containing space so it will not reverse in the upper loop')
        return new String(c);
    }
    public void reverse(char[] c, int s, int e){
        while(s<e){
            char temp = c[s];
            c[s] = c[e];
            c[e] = temp;
            s++;
            e--;
        }
    }
}
