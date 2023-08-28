import java.util.ArrayList;

public class MazeProblem {
    // you have to print the number of ways in which the element will reach the target position in 2/2 matrix
    public static void main(String[] args) {
//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(findNoOfPaths(0, 0)); // at the end we are reaching 9 element position, and it's printing the no. of ways that we can take to get there
//        // you can only go either right or down
//        System.out.println(findPaths("", 0, 0));
//        System.out.println(findAllPaths("", 0, 0));
        boolean[][] nohurd = {
                {true, true, true},
                {true, false, true}, // here false is a hurdle
                {true, true, true}
        };
        findPathsWithHurdles("", nohurd, 0, 0);
    }

    public static int findNoOfPaths(int r, int c){
        if(r==2 || c==2) return 1;
        int count = 0;

        count += findNoOfPaths(r+1, c) + findNoOfPaths(r, c+1);

        return count;
    }

    public static ArrayList<String> findPaths(String p, int r, int c){ // we are only going right and down
        if(r==2 && c==2){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r < 2){ // if either we have gone till last row or col we will run either down only or right only because we don't want to go out of bound exception
            ans.addAll(findPaths("D"+p, r+1, c));
        }
        if(c < 2){
            ans.addAll(findPaths("R"+p, r, c+1));
        }
        return ans;
    }

    public static ArrayList<String> findAllPaths(String p, int r, int c){ // we are going right, down and diagonal also
        if(r==2 && c==2){   //R-right, D-down, I-diagonal
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r < 2){ // if either we have gone till last row or col we will run either down only or right only because we don't want to go out of bound exception
            ans.addAll(findAllPaths("D"+p, r+1, c));
        }
        if(r < 2 && c < 2){
            ans.addAll(findAllPaths("I"+p, r+1, c+1));
        }
        if(c < 2){
            ans.addAll(findAllPaths("R"+p, r, c+1));
        }
        return ans;
    }

    public static void findPathsWithHurdles(String p, boolean[][] nohurdles, int r, int c){
        if(r == nohurdles.length-1 && c == nohurdles[0].length-1){
            System.out.println(p);
            return;
        }

        if(!nohurdles[r][c]){ // if element at this position is false means there is hurdle present so we can't go on that path, then we stop and go back
            return;
        }

        if(r < nohurdles.length-1){
            findPathsWithHurdles(p+"D", nohurdles, r+1, c);
        }

        if(c < nohurdles[0].length-1){
            findPathsWithHurdles(p+"R", nohurdles, r, c+1);
        }
    }
}
