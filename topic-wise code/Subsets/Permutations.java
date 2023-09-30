import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
     String a = "abc";
        System.out.println(permutations("", a));
        System.out.println(permutationsCount("", a));
    }

    public static ArrayList<String> permutations(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<=p.length();i++){
           String first = p.substring(0,i);
           String last = p.substring(i, p.length());
           ans.addAll(permutations(first+ch+last, up.substring(1)));
        }
        return ans;
    }

    public static int permutationsCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String last = p.substring(i, p.length());
            count += permutationsCount(first+ch+last, up.substring(1));
        }
        return count;
    }
}
