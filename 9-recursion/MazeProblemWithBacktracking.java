import java.util.ArrayList;

public class MazeProblemWithBacktracking { // important
    public static void main(String[] args) {
       boolean maze[][] = {
               {true, true, true},
               {true, true, true,},
               {true, true, true}
       };

        findPathsAllDirectionsBacktrack("", maze, 0, 0);
    }

    public static void findPathsAllDirectionsBacktrack(String p, boolean[][] maze, int r, int c){

        // we can go up, down, right, left to find all the paths

        // so actually we are facing a very big problem in this if u make recursion tree u will understand that after some recursion calls,  if we don't
        // make some restrictions to don't go back to the same path where we are coming from then it will reach a call i.e func(p, bool arr, 0,0) so this means
        // we are went back to the starting point of recursion and it will become endless loop thus creating stack overflow error and never ending output.
        // for this reason we will mark the elements false which have already taken i.e gone through those elements so that we can't go back there.
        // so it simply means we are marking the areas false that are already visited( it means that false area we have already have this in our current path),
        // but making false the areas which have already visited, it will change the
        // values in real array. Due to this different paths will be not be able to use that area in their path but this should not happen that's why while we are
        // going back in recursion calls that is returning to previous function call we will change the false values to its original value i.e true
        // basically while we are moving back we restore the maze as it was, so we are basically redoing what we did in that function call and this is known as backtracking.
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){ // if element at this position is false means there is hurdle present so we can't go on that path, then we stop and go back
            return;
        }

        // we are considering this element/block/area in our path
        maze[r][c] = false; // as it is already visited for that current recursion call

        if(r < maze.length-1){ // down
            findPathsAllDirectionsBacktrack(p+"D", maze, r+1, c);
        }

        if(c < maze[0].length-1){ // left
            findPathsAllDirectionsBacktrack(p+"R", maze, r, c+1);
        }

        if(r > 0){ // up
            findPathsAllDirectionsBacktrack(p+"U", maze, r-1, c);
        }

        if(c > 0){ // left
            findPathsAllDirectionsBacktrack(p+"L", maze, r, c-1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function/current recursion call
        maze[r][c] = true;

        // and these two lines where we change element to false, and back to true at that current recursion call ending
        // causes this code to become backtracking
    }
}
