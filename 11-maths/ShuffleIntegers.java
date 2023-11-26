//https://www.geeksforgeeks.org/problems/shuffle-integers2401/1
public class ShuffleIntegers {
    void shuffleArray(long arr[], int n)
    {
        // we are making C values which will be that value form which we can get both A and B
        // Ci = Ai + Bi * x;
        // you can or take any x between 10^3(as it is the max value of arr values in range(constraints given)) and
        // less than the integer max value i.e 2^31, i have taken 10^4
        int x = 10000;
        int mid = n/2;
        for(int i=0;i<mid;i++){
            arr[i] = arr[i]+arr[i+mid]*x; // we have make the Ci values till half of the array
        }
        // now from these Ci values we will get Ai and Bi and put at their respective places like the question
        int j=n-1; // starting putting right values from last
        for(int i=mid-1;i>=0;i--){
            arr[j] = arr[i]/x; //after devision of Ci/x the quotient will be Bi that will be put at last
            arr[j-1] = arr[i]%x; // after devision of Ci/x the remainder will be Ai that will be put at second last
            j -= 2; // now two arr values have filled that's why we will decrease the last pointer by 2
        }
    }
}
