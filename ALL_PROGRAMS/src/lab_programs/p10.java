package lab_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class student{
    String name;
    String address;
    int age;
    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }
    public void setage(int age){
        this.age = age;
    }
    public int getage(){
        return age;
    }
    public void setaddress(String address){
        this.address = address;
    }
    public String getaddress(){
        return address;
    }

}




public class p10 {
    public static void main(String[] args) {
        List stu= new ArrayList();
        student st1= new student(); 
        st1.setage(101); 
        st1.setname("Amit"); 
        st1.setaddress("no 36");
        student st2= new student(); 
        st2.setage(102); 
        st2.setname("Amitw"); 
        st2.setaddress("no 363");
        stu.add(st1);
        stu.add(st2);
        ListIterator l2 = (ListIterator)stu.listIterator();
        while(l2.hasNext()){
            student s = (student)l2.next();
            System.out.print(" "+s.getage()); 
            System.out.print(" "+s.getname()); 
            System.out.println(" "+s.getaddress());
        }
        while(l2.hasPrevious()){
            student s2 = (student)l2.previous();
            System.out.print(" "+s2.getage()); 
            System.out.print(" "+s2.getname()); 
            System.out.println(" "+s2.getaddress());

        }



    }

}
