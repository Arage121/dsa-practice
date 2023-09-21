//https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1
public class ReverseWords {
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        String[] words = S.split("\\.");
        reverse(words);
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<words.length;i++){
            ans.append(words[i]);
            if(i<words.length-1) ans.append(".");
        }
        return ans.toString();
    }

    void reverse(String[] words){
        int s = 0;
        int e = words.length-1;
        while(s<e){
            String temp = words[s];
            words[s] = words[e];
            words[e] = temp;
            s++;
            e--;
        }
    }
}
