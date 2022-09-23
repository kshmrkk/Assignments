package Assignments_Day6;

public class StudentDetails {
    String name;
    String college;
    int StudentNo;
    public StudentDetails(String name, String college, int StudentNo){
        super();
        this.name = name;
        this.college = college;
        this.StudentNo = StudentNo;
    }
    @Override
    public String toString(){
        return ("Student Name:"+name +"| Colllege:"+college+ "| Student Number: " + StudentNo);
    }


}
