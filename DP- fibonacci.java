import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int fibn = fib(n);
    int[] dp = new int[n+1];
    Arrays.fill(dp , -1);
    // System.out.println(fibn);
    // fibn = fibMemoize(n, dp);
    // System.out.println(fibn);
    fibn = fibTab(n, dp);
    System.out.println(fibn);
    
 }
 
  public static int fib(int n)
  {
      if(n==1 || n==0)
      {
          return n;
      }
      
      int fibn1 = fib(n-1);
      int fibn2 = fib(n-2);
      int fibn = fibn1 + fibn2;
      
      return fibn;  
      
  }
  
  public static int fibMemoize(int n , int[] dp)
  {
      if(n==1 || n==0)
      {
          dp[n] = n
          return dp[n];
      }
      if(dp[n]!=  -1)
      {
          return dp[n];
      }
      int fibn1 = fibMemoize(n-1, dp);
      int fibn2 = fibMemoize(n-2, dp);
      int fibn = fibn1 + fibn2;
      
      dp[n] = fibn;
      
      return dp[n];
  }
  
  public static int fibTab(int n, int[] dp)
  {
      dp[0] = 0;
      dp[1] = 1;
      
      for(int i=2; i<n+1; i++)
      {
          dp[i] = dp[i-1] +dp[i-2];
      }
      
      return dp[n];
  }
  
  
  //  ****** Rajneesh bahiya technique  *******
  
  public static int fibMemoizeConvertToTabulation(int N , int[] dp)
  {
      /* copy the memoization function and do the below things
         1. identify the for loop(start and end values) and put everything in for block and find the direction of dp array, i.e. how it is getting solved
         2. remove memoization code
         3. replace all return with continue key
         4. replace the recursive calls with the dp equivalents
      */    
         
         for(int n=0 ; n<=N; n++)
         {
              if(n==1 || n==0)
              {
                  dp[n] = n
                  continue;              
              }


              int fibn1 = dp(n-1);    //fibMemoize(n-1, dp);
              int fibn2 = dp(n-2);    //fibMemoize(n-2, dp);

              int fibn = fibn1 + fibn2;

              continue;
        }
  }
  
  
  
  
  

}
