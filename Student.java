package HandsOn_day1;

public class Student {

    //Attributes; instance variables
    private String name;
    private int rollNo;
    private String grade;

    static String collegeName;

    public Student(String name, String grade, int rollNo){
        super();
        this.name = name;
        this.rollNo =rollNo;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String address) {
        this.grade = grade;
    }
}


