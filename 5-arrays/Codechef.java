/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int[] ans = new int[n];
		int a = n;
		for(int i=0;i<n && a>0;i++){
		    ans[i] = arr[i]*a;
		    a--;
		}
		
		int max = 0;
		for(int i: ans){
		    max = Math.max(max, i);
		}
		
     System.out.println(max);
	}
}
