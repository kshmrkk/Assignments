package HandsOn_day10;
//write the withdraw method without synchronization
// and with synchronization to show the effects.
public class Synchronization {
    synchronized void Synchronization (String arg){
        System.out.println("---Processing---");
        System.out.print(arg);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Thread Interrupted::");
        }
        System.out.println("---End of Process----");


    }

}
