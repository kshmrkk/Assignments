package Assignments_Day6;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
public class LibraryMain {
    public static void main (String [] args){
        int ch = 0;
    Scanner input = new Scanner(System.in);
        System.out.print("Enter the count members in Library:");
        int count = input.nextInt();
        ArrayList<LibraryDetails> details = new ArrayList<>();
    do {
        System.out.println("Press [1] to Add New Member");
        System.out.println("Press [2] to View Member");
        System.out.println("Press [3] to View Address Member");
        System.out.println("Press [4] to Exit");
        System.out.println("\n");
        System.out.print("Please input your choice:");
        ch = input.nextInt();
        System.out.println("\n");
        switch(ch){
            case 1://add data
                for (int i = 0; i < count; i++) {
                    System.out.print("Input name of Library " + (i + 1) + ": ");
                    String name = input.next();
                    System.out.print("Input college name of the student " + (i + 1) + ": ");
                    String address = input.next();
                    System.out.print("Input the Student Number " + (i + 1) + ": ");
                    int LibNum = input.nextInt();
                    LibraryDetails obj = new LibraryDetails(name, address, LibNum);
                    details.add(obj);
                }
                break;
            case 2://view data
                LibraryDetails.display();
                break;

            case 3://view address
                System.out.println("Input the address:");
                String search = input.next();
                for (LibraryDetails temp : details)
                    if (temp.address.equals(search)) {
                        System.out.println(temp);

                    }
                break;
            case 4://exit
                System.exit(0);
            default:
                System.out.println("Invalid choice!!! Please make a valid choice. \n\n");
            }
    } while
    (ch <'1' || ch> '4');
}
}