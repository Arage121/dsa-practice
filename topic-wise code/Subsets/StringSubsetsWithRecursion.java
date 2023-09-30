import java.util.*;
public class StringSubsetsWithRecursion {
    public static void main(String[] args) {
      String s = "abc";
        System.out.println(subs("", s));
    }

    public static ArrayList<String> subs(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subs(p+ch, up.substring(1));
        ArrayList<String> right = subs(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
