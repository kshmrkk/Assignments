package HandsOn_day8;
//Implement a queue for your favourite playlist of songs where you can add songs and also play songs.
// It should also give your how many songs are remaining in your playlist.
public class Playlist {
    private int arr[];
    private int front;
    private int rear;
    private int capacity;
    private int count;


    Playlist(int size){
        arr = new int[size];
        this.capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(String item){
        System.out.println("Inserting Music:" +item);
        rear = (rear+1)%capacity;
        arr[rear]= Integer.parseInt(item);
        count++;
    }

    public int dequeue(){
        int x = arr[front];
        System.out.println("Removing Music:"+x);
        count--;
        return x;
    }

    public String peek(){
        return String.valueOf(arr[front]);
    }

    public String size(){
        return String.valueOf(count);
    }


}
