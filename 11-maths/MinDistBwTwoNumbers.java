//https://www.geeksforgeeks.org/problems/minimum-distance-between-two-numbers/1
public class MinDistBwTwoNumbers {
    int minDist(int a[], int n, int x, int y) {
        int minX = -1;
        int minY = -1;
        int mindist = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(a[i] == x){
                minX = i;
                if(minY != -1){
                    mindist = Math.min(mindist, minX-minY);
                }
            }else if(a[i] == y){
                minY = i;
                if(minX != -1){
                    mindist = Math.min(mindist, minY-minX);
                }
            }
        }
        return (minX!=-1 && minY!=-1)?mindist:-1;
    }
}
