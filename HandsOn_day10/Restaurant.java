package HandsOn_day10;

import java.util.Scanner;

public class Restaurant {
    public static void main (String [] args) throws InterruptedException{

        Waiter waiter;
        Thread t;

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Waiter.put();
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Waiter.get();
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }

            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
}
