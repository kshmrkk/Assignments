package Phonebook_Simulator;
import java.io.*;
import java.util.*;
public class PhoneBook {
    private Hashtable phoneBook;

    public PhoneBook(){
        this.phoneBook = new Hashtable();
    }

    public void add(String name, String number){
        if(this.phoneBook.containsKey(name)){
            System.out.println(name+" existing.");
        }
        else{
            this.phoneBook.put(name,number);
            System.out.println(name+" was added successfully.");
        }
    }

    public void find(String name){
        if (this.phoneBook.containsKey(name)){
            String number = (String) this.phoneBook.get(name);
            System.out.println(name+ "'s number is "+number+".");
        }
        else{
            System.out.println("No person named "+name +" exists.");
        }
    }

    public void display(){
        Enumeration names;
        names = this.phoneBook.keys();
        int total = 0;
        while(names.hasMoreElements()){
            String str = (String) names.nextElement();
            System.out.println("Name: "+str + "\n" +"Phone Number:"+ this.phoneBook.get(str));
            total++;
        }
        System.out.println("Total "+total +" persons.");
    }

    public void delete_entry(String name){
        if(this.phoneBook.containsKey(name)){
            this.phoneBook.remove(name);
            System.out.println(name+" was deleted successfully.");
        } else {
            System.out.println("No person named '"+name+"' exists.");
        }
    }


}
