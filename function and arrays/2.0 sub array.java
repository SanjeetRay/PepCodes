/*
> subsequence in strings = sub set in array. 
  > it is non contiguous
  > total no of subsequence/sub set (2^n)
> whereas substring in string = subarray in arrays. 
  > it is contiguous
  > total no of substring/sub array (n(n+1)/2)
  for a array of size 3 with elements :  10 20 30
  subarray would be(6) : 
  10
  10 20
  10 20 30  <--- all contguous no two element have gap in between them
  20
  20 30 
  30 
  
substring of abc --> [ a, ab, abc, b, bc, c ]
subsequence -->
[
   ---
   -b-
   --c
   -bc
   a--
   ab-
   a-c  <--- non contiguous two elements can have gap between them
   abc
 ]


arr[3] = 10|20|30|40

10	
10	20	
10	20	30	
10  20  30  40
20	
20	30	
20	30	40
30	
30	40
40

*/
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int[n];
    for(int i =0 ; i<arr.length; i++)
       arr[i] = scn.nextInt();
       
    for(int i=0; i<arr.length; i++)
    {
        for(int j =i; j<arr.length; j++)
        {
            for(int k=i; k<=j; k++)
            {
                System.out.print(arr[k]+"\t");
            }
            System.out.println();
        }
    }
 }

}
