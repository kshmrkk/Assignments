package Factory_Design;

public class OperatingSystemFactory {
    public Sports getInstance(String str){
        if(str.equals("Kick"))
            return new FootBall();
        else if(str.equals("Swing"))
            return new Badminton();
        else
            return new Human();

    }
}
