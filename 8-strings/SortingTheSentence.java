//https://leetcode.com/problems/sorting-the-sentence/
public class SortingTheSentence {
        public String sortSentence(String s) {
            String[] arr = s.split(" "); // {"is2", "sentence4", "This1", "a3"}
            String[] st = new String[arr.length]; // 4
            for(int i=0;i<arr.length;i++){
                int wordLength = arr[i].length()-1; // is2 length is 3
                int index = arr[i].charAt(wordLength)-'0'-1; // '2'-'0'-1 = 1
                st[index] =  arr[i].substring(0, wordLength);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(st[0]);
            for(int i=1;i<arr.length;i++){
                sb.append(" "+st[i]);
            }
            return sb.toString();
        }
}
