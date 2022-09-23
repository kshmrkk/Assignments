package Assignments_Day6;
//There are several members in a library.
// Write a menu driven java program to add new member, view all members and view members by given address.
import java.util.ArrayList;
public class LibraryDetails {
    String name;
    String address;
    int LibNum;
    public LibraryDetails(String name, String address, int LibNum){
        super();
        this.name = name;
        this.address = address;
        this.LibNum = LibNum;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public class LibArray {
        ArrayList<LibraryDetails>list=new ArrayList<LibraryDetails>();
        public void add(String name,String address,String LibNum)
        {
            list.add(new LibraryDetails(name,address,LibNum));
        }
        public void display() {
            for(int i=0;i<list.size();i++)
            {
                System.out.println(list.get(i).toString());
            }
        }
        public void address(String s)
        {
            list.stream().filter(str->str.getAddress().equalsIgnoreCase(s)).forEach(System.out::println);
        }
    }



}
