#DailyCodingProblem/Problem#1

This problem was recently asked by Google.
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

import java.io.*;
import java.io.IOException;
import java.util.*;
public class DAY1 {
    public static void main(String[] args) {
        try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n=Integer.parseInt(br.readLine());
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(br.readLine());
            }
            int k=Integer.parseInt(br.readLine());
            HashSet<Integer> h=new HashSet<Integer>();
            for(int i=0;i<n;i++)
            {
                if(h.contains(a[i]))
                {
                    System.out.println("true");  
                    break;
                }
                else if(i==n-1)
                {
                    System.out.println("false");
                }
                else
                {
                    h.add((k-a[i]));
                }
            }
            System.out.println(h);
        }
        catch(Exception e)
        {
            
        }
    }
}
