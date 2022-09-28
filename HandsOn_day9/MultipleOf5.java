package HandsOn_day9;

public class MultipleOf5 implements Runnable{
    private volatile int sum = 0;
    @Override
    public void run() {
        for (int i =5; i < 2100000000;  i += 5){
            sum += i;
        }
    }
    public int getSum(){
        return sum;
    }
}
