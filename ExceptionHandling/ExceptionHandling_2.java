package ExceptionHandling;
import java.util.*;
public class ExceptionHandling_2 {
    public static class Component{
        public static void main (String[]args) throws InvalidSalaryException{
            String name;
            String gender;
            int sal;
            Candidate can;
            Scanner input = new Scanner (System.in);
            System.out.println("---Candidate details---");
            System.out.print("Enter Candidate Name:");
            name = input.next();
            System.out.print("Enter Candidate gender:");
            gender = input.next();
            System.out.print("Enter Candidate salary:");
            sal = input.nextInt();
            if(sal < 10000) {
                throw new InvalidSalaryException("Salary cannot be less than 10000");
            }
            else {
                can = new Candidate(name,gender,sal);
            }
            System.out.println(can);

        }
    }
    static class InvalidSalaryException extends Exception{
        public InvalidSalaryException(String s) {
            super(s);
        }
    }
}
