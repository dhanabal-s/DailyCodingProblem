/*
 This problem was asked by Amazon.

There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time.
Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.

For example, if N is 4, then there are 5 unique ways:
1, 1, 1, 1
2, 1, 1
1, 2, 1
1, 1, 2
2, 2

What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive integers X? 
For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time.
 */
package dailycodingchallange;

import java.util.Scanner;
public class DAY12 {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of StairCase:");
        int NoOfStairCase=sc.nextInt();
        System.out.println("Enter No.of Values in Set:");
        int posIntInX=sc.nextInt();
        int[] X=new int[posIntInX];
        System.out.println("Enter the Set Values:");
        for(int i=0;i<posIntInX;i++)
        {
            X[i]=sc.nextInt();
        }
        int[] NoOfClimb=new int[NoOfStairCase+1];
        NoOfClimb[0]=1;
        for(int i=1;i<NoOfStairCase;i++)
            NoOfClimb[i]=0;
        for(int i=0;i<=NoOfStairCase;i++)
        {
            for(int j=0;j<posIntInX;j++)
            {
                if(i-X[j]>=0)
                {
                    NoOfClimb[i]+=NoOfClimb[i-X[j]];
                    
                }
            }
            System.out.println("No.of Unique Ways is:"+NoOfClimb[i]);
        }
        System.out.println("No.of Unique Ways is:"+NoOfClimb[NoOfStairCase]);
    }
    
}
