package Enrollment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Students {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    ArrayList<String> arrayCode = new ArrayList<String>();
    int studentid;
    String studentname;
    String studentcourse;
    String subjectcode;
    String subjectdescrip;


    public Students(){

    }
    public Students(String sid, String sname, String scour){
        setSid(sid);
        setSname(sname);
        setScour(scour);
    }


    public Students( String subcode, String subdesc){
        setSubcode(subcode);
        setSubdesc(subdesc);
    }

    public int getSid(){
        return studentid;
    }
    public String getSname(){
        return studentname;
    }
    public String getScour(){
        return studentcourse;
    }
    public String getSubcode(){
        return subjectcode;
    }
    public String getSubdesc(){
        return subjectdescrip;
    }

    public void setSid(String sid){
        studentid = Integer.parseInt(sid);
    }
    public void setSname(String sname){
        studentname = sname;
    }
    public void setScour(String scour){
        studentcourse = scour;
    }

    public void setSubcode(String subcode){
        subjectcode = subcode;
    }
    public void setSubdesc(String subdesc){
        subjectdescrip = subdesc;
    }
    public void getStudInfo() throws IOException {

        int numdeps =0;
        System.out.print("\nEnter Student ID:");
        studentid= Integer.parseInt(br.readLine());
        System.out.print("Enter Student Name: ");
        studentname= br.readLine();
        System.out.print("Enter Student Course:");
        studentcourse= br.readLine();


        System.out.println("How many subjects?: ");

        numdeps = Integer.parseInt(br.readLine());
        String cc1, cc2;
        for(int i=0;i<numdeps;i++){
            System.out.println("[1]Enter Subject code: ");
            subjectcode=br.readLine();
            System.out.println("[2]Enter Subject description: ");
            subjectdescrip=br.readLine();
            arrayCode.add("\nSubject Code: " + (subjectcode) + " \nSubject Description: " + (subjectdescrip));
        }


    }
    public void printStudInfo(){

        System.out.println("\nSTUDENT");
        System.out.println("ID:" + getSid());
        System.out.println("Name:" + getSname());
        System.out.println("Course:" + getScour());
        for (String value : arrayCode) {
            System.out.println(value); }


    }
}
