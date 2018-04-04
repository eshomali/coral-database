//------------------------------------------------------------------------------
//  This class was created to test ScheduledExecutorService.
//------------------------------------------------------------------------------
package coral;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;



/**
 *
 * @author erin.rourke
 */
public class ScheduledExecutorServiceExample {
    public static void main(String[] args){
        ScheduledExecutorService execService = Executors.newScheduledThreadPool(5);
        execService.scheduleAtFixedRate(new Runnable(){
            public void run() {
                output();
            }
        }, 0, 2, TimeUnit.SECONDS);
    }
    
    public static void output(){
        System.out.println("<3\n");
    }
}
