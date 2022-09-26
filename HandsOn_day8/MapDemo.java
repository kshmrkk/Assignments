package HandsOn_day8;
import java.util.HashMap;
import java.util.Map;
public class MapDemo {
    public static void main (String []args){
        Map <String, String> names = new HashMap<>();

        names.put("Shane", "Electrical Engineer");
        names.put("Samuel", "Chemical Engineer");
        names.put("Sean", "Computer Engineer");
        names.put("Sandeep", "Civil Engineer");
        names.put("Shrey", "Instrumental Control Engineer");


        names.forEach((k,v) -> System.out.println("Name:"+k +"\nCourse:"+v));
    }



}
