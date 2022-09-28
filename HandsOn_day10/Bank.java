package HandsOn_day10;

public class Bank {
    public static void main (String[] args){
        Synchronization obj = new Synchronization();
        Thread1 t1 = new Thread1(obj,"Withdrawing:1000\n");
        Thread1 t2 = new Thread1(obj, "Withdrawing:2000\n");
        Thread1 t3 = new Thread1(obj, "Withdrawing:3000\n");
        try {
            t1.t.join();
            t2.t.join();
            t3.t.join();

        }
        catch (InterruptedException e){
            System.out.println("Interrupted::");
        }
    }

}
