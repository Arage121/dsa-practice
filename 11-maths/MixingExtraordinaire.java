//https://www.codechef.com/SEP23D/problems/MIX2
import java.util.*;
import java.lang.*;
/* Name of the class has to be "Main" only if the class is public. */
class MixingExtraordinaire
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] juices = new int[n];
            for (int i = 0; i < n; i++) {
                juices[i] = sc.nextInt();
            }
            
            long totalMixes = calculateMixes(juices);
            System.out.println(totalMixes);
        }
        
        sc.close();
    }
    
    public static long calculateMixes(int[] juices) {
        long totalMixes = 0;
        long totalJuice = 0;
        
        for (int i = 0; i < juices.length; i++) {
            totalJuice += juices[i];
            totalMixes += (long)juices[i] * (totalJuice - juices[i]);
        }
        
        return totalMixes;
    }
}
