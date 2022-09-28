package HandsOn_day10;

public class Thread1 implements Runnable {
    String arg;
    Synchronization obj;
    Thread t;


    public Thread1(Synchronization obj, String arg){
        this.obj = obj;
        this.arg = arg;
        t = new Thread(this);
        t.start();
    }

    public void run(){
        obj.Synchronization(arg);
    }
}
