//https://leetcode.com/problems/largest-3-same-digit-number-in-string/
public class LargestThreeSameDigitNoInString {
    public String largestGoodInteger(String num) {
        String maxGood = "";

        for(int i=0;i<=num.length()-3;i++){
            String substr = num.substring(i, i+3);
            if(goodString(substr) && substr.compareTo(maxGood) > 0){
                maxGood = substr;
            }
        }

        return maxGood;
    }

    public boolean goodString(String s){
        return s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2);
    }
}
