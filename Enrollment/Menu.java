package Enrollment;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
    static Subjects a [] = new Subjects[100];
    static Students b [] = new Students[100];
    static int SubjectCount;
    static int StudentCount;
    public static void mainMenu()
    {
        System.out.println("\nEnrollment System");
        System.out.println("===================");
        System.out.println("Press [1] to Enter Subjects.");
        System.out.println("Press [2] to Enter Students.");
        System.out.println("Press [3] to Display all records.");
        System.out.println("Press [4] to Exit.");
    }
    public static int getMenuOption()
    {
        int option;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter choice:");
        option = in.nextInt();
        return option;
    }
    public static void displayAll() throws IOException
    {


        for(int i=0; i<SubjectCount; i++)
        {
            a[i].printSubInfo();
        }
        for(int j=0; j<StudentCount; j++)
        {
            b[j].printStudInfo();
        }

    }
    public static void AddNewSubject() throws IOException
    {
        System.out.print("\n[Subject Info]");
        a[SubjectCount] = new Subjects();
        a[SubjectCount].getSubInfo();
        SubjectCount++;
    }
    public static void AddNewStudent() throws IOException
    {
        System.out.print("\n[Student Info]");
        b[StudentCount] = new Students();
        b[StudentCount].getStudInfo();
        StudentCount++;
    }


    public static void main(String[] args) throws IOException {
        SubjectCount =0;
        StudentCount =0;

        int op=0;
        do
        {
            mainMenu();
            op = getMenuOption();
            switch(op)
            {
                case 1:
                    AddNewSubject();
                    break;
                case 2:
                    AddNewStudent();
                    break;
                case 3:
                    displayAll();
                    break;
                case 4:
                    System.out.println("Thank you for using this program for Enrollment!");
                    break;
                default:
                    System.out.println("Choice not found!");
            }
        }
        while(op !=4);
    }
}
