package HandsOn_day9;

public class DisplayThread {
    private static int parallelSolution() throws InterruptedException{
        int totalSum = 0;
        MultipleOf5 multipleOf5 = new MultipleOf5();
        Thread secondThread = new Thread(multipleOf5);
        secondThread.start();
        secondThread.join();
        totalSum += multipleOf5.getSum();

        return totalSum;
    }


    public static void main(String[] args) throws InterruptedException  {
        long startTime = System.currentTimeMillis();
        int sum = parallelSolution();
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        System.out.println("The total sum = " + sum);
        System.out.println("Elapsed time is " + elapsedTime);
    }

}
