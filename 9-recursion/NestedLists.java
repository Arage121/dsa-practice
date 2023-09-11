import java.util.*;
public class NestedLists { // got this question in my recent Interview, nested list how to print them as single list

    public static void main(String[] args) {
        List<Object> res = new ArrayList<>();
        res.add(1);
        res.add(2);
        List<Object> nes1 = new ArrayList<>();
        nes1.add(3);
        nes1.add(4);
        List<Object> nes2 = new ArrayList<>();
        nes2.add(5);
        nes2.add(6);
        res.add(nes1);
        res.add(nes2);
        System.out.println(res);
        System.out.println(flatten(res));
    }

    public static List<Integer> flatten(List<Object> obj){
        List<Integer> ans = new ArrayList<>();
        for(Object e: obj){
            if(e instanceof Integer){
                ans.add((Integer) e);
            }else{ // you can also write as else if(e instanceof List)
                ans.addAll(flatten((List<Object>) e)); // if the e is not an Integer it's a list i.e nested list inside main list of type object
            }
        }
        return ans;
    }
}
