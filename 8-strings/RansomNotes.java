//https://leetcode.com/problems/ransom-note/description/
public class RansomNotes {
    public boolean canConstruct(String ransomNote, String magazine){ //understand this one properly
        int arr[]=new int[26];

        for(char ch:magazine.toCharArray())
            arr[ch-'a']++;

        for(char ch:ransomNote.toCharArray()){
            if(arr[ch-'a']==0)return false;
            arr[ch-'a']--;
        }
        return true;

    }
}
