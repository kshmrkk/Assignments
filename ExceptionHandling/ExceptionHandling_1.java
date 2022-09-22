package ExceptionHandling;
import java.util.*;
public class ExceptionHandling_1 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number of elements:");
        int num = input.nextInt();
        int arr[] = new int[num];
        try{
            for(int i=0;i<num;i++){
                System.out.println("Please enter element");
                arr[i] = input.nextInt();
            }
        }
        catch(InputMismatchException e){
            System.out.println("Please enter integer value only");
        }
        System.out.println("Please enter index of elements which you want to print");
        int index = input.nextInt();
        try{
            System.out.println("The element is :" + arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter correct index value and try again");
        }
    }
}
