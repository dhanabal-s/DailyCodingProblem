//Problem Statement
/*
 Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
You can assume that the messages are decodable. For example, '001' is not allowed.
 */
package dailycodingchallange;

import java.io.*;
import java.io.InputStreamReader;
import java.util.Scanner;
public class DAY7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try
       {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        char[] a=s.toCharArray();
        int arr[]=new int[a.length];
        int n=a.length;
        if(a[n-1]==0)
            arr[0]=0;
        else
            arr[0]=1;
        if(a[n-2]=='0')
            arr[1]=0;
        else
        {
            arr[1]=1;
            if(a[n-2]<=50&&a[n-1]>48&&a[n-2]!='0')
            {
                arr[1]=2;
            }
        }
        for(int i=n-3,j=2;i>=0;i--,j++)
        {
            if(a[i]==48)
                arr[j]=0;
            if(a[i]>48)
                arr[j]=arr[j-1];
            if(a[i]>48&&a[i]<=50&&a[i+1]>=48)
                arr[j]+=arr[j-2];
        }
        System.out.println(arr[n-1]);
       }
       catch(Exception e)
       {
           
       }
    }
    
}
