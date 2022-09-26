package HandsOn_day8;
import java.util.*;
public class PlaylistMain {
    public static void main (String []args){
        Playlist queue = new Playlist(5);
        System.out.println("My playlist");
        queue.enqueue("Dead mans hand by KSHMR");
        queue.enqueue("TOCA by KSHMR");
        queue.enqueue("Megalodon by KSHMR");
        queue.enqueue("Strong by KSHMR & R3HAB");
        queue.enqueue("Wildcard by KSHMR");

        System.out.println("First music is:" +queue.peek());

        queue.dequeue();

        System.out.println("Next music is:" +queue.peek());
        System.out.println("The count of inserted songs:" +queue.size());






    }
}
