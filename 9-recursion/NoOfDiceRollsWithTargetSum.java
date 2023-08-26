import java.util.ArrayList;

public class NoOfDiceRollsWithTargetSum {
    public static void main(String[] args) {
        System.out.println(dice("", 4));
        System.out.println(diceNfaces("", 4, 10));
    }

    public static ArrayList<String> dice(String p, int target){
        if(target == 0){
            ArrayList<String> s = new ArrayList<>();
            s.add(p);
            return s;
        }

        ArrayList<String> ans = new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++){ // for 1 dice that has 6 faces
            ans.addAll(dice(p+i, target-i));
        }
        return ans;
    }

    //for n no. of faces of a dice
    public static ArrayList<String> diceNfaces(String p, int target, int faces){
        if(target == 0){
            ArrayList<String> s = new ArrayList<>();
            s.add(p);
            return s;
        }

        ArrayList<String> ans = new ArrayList<>();
        for(int i=1;i<=faces && i<=target;i++){ // for 1 dice that has 6 faces
            ans.addAll(diceNfaces(p+i, target-i, faces));
        }
        return ans;
    }
}
