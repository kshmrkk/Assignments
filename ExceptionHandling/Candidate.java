package ExceptionHandling;
public class Candidate{
    String name;
    String gender;
    int sal;
    public Candidate(String name, String gender, int sal){
        this.name = name;
        this.gender = gender;
        this.sal = sal;
    }
    @Override
    public String toString(){
        return "Candidate [name=" + name + ", gender=" + gender + ", salary=" + sal + "]";
    }
}

