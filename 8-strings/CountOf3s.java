//https://www.codingninjas.com/studio/problem-of-the-day/
public class CountOf3s {
    public static long countOf3(int x) {
        if(x < 3) return 0;
        if(x==3) return 1;
        long count = 0;
        for(int i=3;i<=x;i++){
            String a = i+"";
            for(int j=0;j<a.length();j++){
                if(a.charAt(j) == '3') count++;
            }
        }
        return count;

//        if (x < 3) return 0; more optimized code
//
//        long count = 0;
//        int powerOf10 = 1;
//        int remainder = 0;
//        int quotient = x;
//
//        while (quotient > 0) {
//            int currentDigit = quotient % 10;
//            quotient /= 10;
//
//            if (currentDigit > 3) {
//                count += (quotient + 1) * powerOf10;
//            } else if (currentDigit == 3) {
//                count += (quotient * powerOf10) + (remainder + 1);
//            } else {
//                count += quotient * powerOf10;
//            }
//
//            remainder += currentDigit * powerOf10;
//            powerOf10 *= 10;
//        }
//
//        return count;
    }
}
