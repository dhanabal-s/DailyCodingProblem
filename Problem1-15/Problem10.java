/*This problem was asked by Apple.

Implement a job scheduler which takes in a function f and an integer n, and calls f after n milliseconds.*/
package dailycodingchallange;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Timer;
import java.util.Date;
public class DAY10 extends Thread{

    /**
     * @param args the command line arguments
     */
     
   public void run()
   {
       System.out.println(Thread.currentThread());
       System.out.println("Job Scheduler Executed");
   }
    public static void main(String[] args) throws InterruptedException {
        
        DAY10 D=new DAY10();
      Thread f=new Thread();
        D.start();
        Thread.sleep(1000);
        
    }
    
}
