package generics;

import java.util.Arrays;

public class student_comparable implements Comparable<student_comparable> {
    int roll;
    float marks;

    public student_comparable(int roll, Float marks) {
        this.marks = marks;
        this.roll = roll;
    }


    @Override
     public int compareTo(student_comparable o) {

        int diff = (int) (this.marks - o.marks);
         return diff;

     }

    @Override
    public String toString() {
        return marks+ "";
        // TODO Auto-generated method stub
        
    }

    public static void main(String[] args) {
        student_comparable stu1 = new student_comparable(30, 45.00f);
        student_comparable stu2 = new student_comparable(45, 67.00f);
        student_comparable stu3 = new student_comparable(46, 68.00f);
        student_comparable stu4 = new student_comparable(47, 69.00f);
        student_comparable stu5 = new student_comparable(48, 70.00f);
        student_comparable[] list = { stu1, stu2, stu3, stu4, stu5 };
   
        System.out.println(Arrays.toString(list));  

        
        Arrays.sort(list);// WILL NOT WORK WITHOUR TOSTRING OVERRIDE

        System.out.println(Arrays.toString(list));
        
    


        // if ( stu1.compareTo(stu2)<0) System.out.println("student one is lower than
        // student 2");

    }

     
     

}
