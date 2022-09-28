package HandsOn_day10;

import java.util.Scanner;

public class Waiter {
    public void put() throws InterruptedException{
        synchronized (this){
            System.out.println("Preparing the meal.");
            wait();
            System.out.println("Waiting for the next meal");
        }
    }
    public void get() throws InterruptedException{
        Thread.sleep(1000);
        Scanner input = new Scanner(System.in);
        synchronized (this){
            System.out.println("The food is ready to serve!");
            input.nextLine();
            System.out.println("Serving the meal.");
            notify();
            Thread.sleep(2000);
        }
    }
}
