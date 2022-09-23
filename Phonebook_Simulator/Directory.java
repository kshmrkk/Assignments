package Phonebook_Simulator;
import java.io.*;
import java.util.*;

public class Directory {
    public static void main (String [] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        try {
            while (true) {
                System.out.println("\n\t\tWelcome to PhoneBook Simulator.");
                System.out.println("======================================");
                System.out.println("Please type [add] if you want to add number in PhoneBook Directory.");
                System.out.println("Please type [find] if you want to find number in PhoneBook Directory.");
                System.out.println("Please type [display] if you want to view all number in PhoneBook Directory.");
                System.out.println("Please type [delete] if you want to remove a number in PhoneBook Directory.");
                System.out.println("Please type [exit] if you want to end the program.");
                System.out.println("======================================");
                System.out.print("$");
                String command = sc.next();

                if (command.equals("add")) {
                    System.out.println("Enter name:");
                    String name = sc.next();
                    System.out.println("Enter number:");
                    String number = sc.next();
                    phoneBook.add(name, number);
                } else if (command.equals("find")) {
                    System.out.println("Enter name of what you are looking for:");
                    String name = sc.next();
                    phoneBook.find(name);
                } else if (command.equals("display")) {
                    System.out.println("Here all the listed numbers in PhoneBook");
                    phoneBook.display();
                } else if (command.equals("delete")) {
                    System.out.println("Enter the name that you want to delete:");
                    String name = sc.next();
                    phoneBook.delete_entry(name);
                } else if (command.equals("exit")) {
                    break;
                }
            }
            sc.close();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter correct value and try again");
        }
    }


}
