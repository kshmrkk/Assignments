package Factory_Design;

public class FactoryMain {
    public static void main (String a[]){
        OperatingSystemFactory osf = new OperatingSystemFactory();
        Sports obj = osf.getInstance("Hey");
        obj.play();



    }
}
