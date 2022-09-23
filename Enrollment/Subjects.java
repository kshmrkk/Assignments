package Enrollment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Subjects {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    String Subjcode;
    String Subjdesc;
    String Subjsched;
    String Subjunits;

    public Subjects() {
    }
    public Subjects(String code, String desc, String sched, String units){
        setCode(code);
        setDesc(desc);
        setSched(sched);
        setUnits(units);
    }
    public String getCode(){
        return Subjcode;
    }
    public String getDesc(){
        return Subjdesc;
    }
    public String getSched(){
        return Subjsched;
    }
    public String getUnits(){
        return Subjunits;
    }
    public void setCode(String code){
        Subjcode = code;
    }
    public void setDesc(String desc){
        Subjdesc = desc;
    }
    public void setSched(String sched){
        Subjsched = sched;
    }
    public void setUnits(String units){
        Subjunits = units;
    }
    public void getSubInfo() throws IOException {
        System.out.print("\nEnter Subject Code:");
        Subjcode= br.readLine();
        System.out.print("Enter Subject Description: ");
        Subjdesc= br.readLine();
        System.out.print("Enter Subject Schedule: ");
        Subjsched= br.readLine();
        System.out.print("Enter Subject Units: ");
        Subjunits= br.readLine();
    }
    public void printSubInfo (){
        System.out.println("\nSUBJECT");
        System.out.println("Code:" + getCode());
        System.out.println("Description:" + getDesc());
        System.out.println("Schedule: " + getSched());
        System.out.println("Units:" + getUnits());
    }
}
