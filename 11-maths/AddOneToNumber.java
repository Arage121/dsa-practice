//https://www.codingninjas.com/studio/problems/add-one-to-number_873367
import java.util.* ;

public class AddOneToNumber {
    public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr)
    {
        ArrayList<Integer> l = new ArrayList<>();
        int carry = 1;
        for(int i=arr.size()-1;i>=0;i--){
            int digit = arr.get(i)+carry;
            carry = digit/10;
            l.add(0, digit%10);
        }
        if(carry > 0){
            l.add(0, carry);
        }
        while(!l.isEmpty() && l.get(0) == 0){
            l.remove(0);
        }
        return l;
    }
}
