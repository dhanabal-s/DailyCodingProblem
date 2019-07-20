/*Given an array of integers, find the first missing positive integer in linear time and constant space.
 *In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
 *For example, the input [3, 4, -1, 1] should give 2.
 *The input [1, 2, 0] should give 3.
 *You can modify the input array in-place.*/
 
import java.util.Scanner;

public class DAY4 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i;
        
        for(i=0;i<n;i++)
        {
            int k=sc.nextInt();
            
            if(k>0)
            {   
                arr[k-1]=2;     
            }
        }
        
        for(i=0;i<n;i++)
        {
            if(arr[i]!=2)
            {
                System.out.println(i+1);
                break;
            }
        }
        
        if(i==n)
        {
            System.out.println(n+1);   
        }
    }
}
