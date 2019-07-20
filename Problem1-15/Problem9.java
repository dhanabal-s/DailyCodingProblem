//Problem Statement
/*
Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.
For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.
Follow-up: Can you do this in O(N) time and constant space?
*/
package dailycodingchallange;

import java.util.Scanner;
public class DAY9 {

   
    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         System.out.println("Enter the no.of Values:");
         int noOfVal=scanner.nextInt();
         int[] Value=new int[noOfVal];
         System.out.println("Enter the Values:");
         for(int i=0;i<noOfVal;i++)
         {
             Value[i]=scanner.nextInt();
         }
         int[] Sum=new int[noOfVal];
         Sum[0]=Value[0];
         Sum[1]=Value[1];
         int i,max=Sum[0];
         for(i=2;i<noOfVal;i++)
         {
             if(max+Value[i]>=max&&max+Value[i]>=Value[i])
             {
                 Sum[i]=max+Value[i];
             }
             else if(max+Value[i]<Value[i])
             {
                 Sum[i]=Value[i];
             }
             else if(max+Value[i]<max)
             {
                 Sum[i]=max;
             }
             if(max<Sum[i-1])
                 max=Sum[i-1];
         }
         if(max<Sum[i-1])
             max=Sum[i-1];
         System.out.println("Maximum Value is:"+max);
    }
    
}
