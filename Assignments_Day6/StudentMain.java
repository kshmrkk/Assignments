package Assignments_Day6;

import java.util.*;
public class StudentMain {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Students:");
        int num = input.nextInt();
        ArrayList <StudentDetails> details = new ArrayList<>();
        for (int i = 0; i < num; i++){
            System.out.print("Input name of student "+(i+1)+": ");
            String name = input.next();
            System.out.print("Input college name of the student "+(i+1)+": ");
            String college = input.next();
            System.out.print("Input the Student Number "+(i+1)+": ");
            int StudentNo = input.nextInt();
            StudentDetails obj = new StudentDetails(name,college,StudentNo);
            details.add(obj);
        }

        System.out.println("Input the name of college:");
        String search = input.next();
        for (StudentDetails temp : details)
            if (temp.college.equals(search)) {
                System.out.println(temp);
            }
    }
}
