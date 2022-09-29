package HandsOn_day11;
import HandsOn_day1.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class GradeStream {
    public static void main (String []args){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Mahendra", "A", 95 ));
        students.add(new Student("Mark", "B", 80 ));
        students.add(new Student("Kevin", "C", 79 ));
        students.add(new Student("Mae", "D", 75 ));
        students.add(new Student("Kyle", "A", 90 ));
        Collections.sort(students, (a,b)-> a.getName().compareTo(b.getName()));
        System.out.println("The list of students:");
        students.forEach(s -> System.out.println(s.getName()+" - "+s.getRollNo()+" | Remarks: "+ s.getGrade()+"\n\n"));

        List <Student> result = students.stream()
                                .filter(r -> r.getGrade().equals("A"))
                                .toList();
        for(Student remarks: result){
            System.out.println("Students who got A remarks:\n"+remarks.getName()+" - " +remarks.getGrade());

        }










    }


}
