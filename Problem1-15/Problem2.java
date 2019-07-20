/*Given an array of integers, return a new array such that each element at index i of the 
  new array is the product of all the numbers in the original array except the one at i.
  For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
  If our input was [3, 2, 1], the expected output would be [2, 3, 6].*/

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;

public class DAY2 {

    public static void main(String[] args) {
        
        try
        {
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           
           int n=Integer.parseInt(br.readLine());
           BigInteger[] OldList=new BigInteger[n];
           BigInteger[] NewList=new BigInteger[n];
           BigInteger sum=new BigInteger("1");
  
           for(int i=0;i<n;i++)
           {
               OldList[i]=BigInteger.valueOf(Long.parseLong(br.readLine()));
           }
           for(int i=0;i<n;i++)
           {
               NewList[i]=sum;
               sum=OldList[i].multiply(sum);
           }
           sum=OldList[n-1];
           for(int i=n-2;i>=0;i--)
           {
             NewList[i]= NewList[i].multiply(sum);
             sum=OldList[i].multiply(sum);
           }
           for(int i=0;i<n;i++)
           System.out.print(NewList[i]+" ");
        }
        catch(Exception e)
        {
            
        }
    }
}
