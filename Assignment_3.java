import java.util.Scanner;
import java.util.ArrayList;
//Create and array of 5 Employees and sort them based on their years of experience.
public class Assignment_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an count number of employee for array size:");
        int number = input.nextInt();
        int array[] = new int[number];
        System.out.println("Array size " + number + " initiated.\n");
        for (int i = 0; i < number; i++) {
            System.out.println("Now enter the year of experience of employee number:" +(i+1));
            array[i] = input.nextInt();
        }
        System.out.println("sorting: ");
        System.out.println(array); //Before sort
        sort(array);
        System.out.println(array); //After sort
        System.out.println("The highest number in the array is " + max(array));
        System.out.println("The smallest number in the array is " + min(array));
    }
    public static int sort(int[] arg) {
        int arrange = 0;
        for (int i = 1; i < arg.length - 1; i++) {
            for (int j = i + 1; j < arg.length; j++) {

                if (arg[i] > arg[j]) {
                    arrange = arg[i];
                    arg[i] = arg[j];
                    arg[j] = arrange;

                }
            }
        }
        return arrange;
    }
    public static int max(int[] arg) {
        if (arg.length == 0) {
            System.out.println(" empty arguement list ");
            return 0;
        }
        int largest = arg[0];
        for (int i = 1; i < arg.length; i++) {
            if (arg[i] > largest) {
                largest = arg[i];
            }
        }
        return largest;
    }
    public static int min(int[] arg) {
        if (arg.length == 0) {
            System.out.println(" empty arguement list ");
            return 0;
        }
        int smallest = arg[0];
        for (int i = 1; i < arg.length; i++) {
            if (arg[i] < smallest) {
                smallest = arg[i];
            }
        }
        return smallest;
    }


}
