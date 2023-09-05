//https://leetcode.com/problems/sort-characters-by-frequency/
import java.util.*;
public class SortCharactersByFrequency { //hard question, understand properly
    class Solution {
        class Pair{
            char ch;
            int count;
            Pair(char ch, int count){
                this.ch = ch;
                this.count = count;  // here count is frequency of that char
            }
        }
        public String frequencySort(String s) {

            ArrayList<Pair> arr=new ArrayList<>();

            int ump[]=new int[123];

            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                ump[ch]++;
            }

// ascii range of upper case character -> 65 to 90
//  ascii range of lower case character->97 to 122
//  ascii range of  0 to 9 character -> 48 to 57

// we  are starting lopp  48 becz string contains character from between 0 to 9
            for(int i=48;i<=122;i++){
                if(ump[i]>0){ // if it's not greater than 0 that means it is not containing any char
                    arr.add(new Pair((char)i,ump[i])); // it will add the char and its frequency
                }

            }


            Collections.sort(arr, new Comparator<Pair>(){
                        public int compare(Pair a,Pair b){

                            return b.count-a.count;
                        }
                    }

            );

            StringBuilder sb=new StringBuilder();
            for(Pair pr:arr){
                if(pr.count==1){
                    sb.append(pr.ch);
                }else{
                    for(int i=1;i<=pr.count;i++){
                        sb.append(pr.ch);
                    }
                }


            }

            return sb.toString();
        }
    }
}
