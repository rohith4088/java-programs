package data_strcutures;
import java.util.Scanner;

class sample{
    int x=12;
    
    
    public static void main(String[] args){
        sample obj1 = new sample();
        System.out.println(obj1);
        
    }
}

class Bike1{  
    //creating a default constructor  
    Bike1()
    {System.out.println("Bike is created");}  
    //main method  
    public static void main(String args[]){  
    //calling a default constructor  
    Bike1 b = new Bike1();  
    }  
    }  
   
    
    // parametrasied constructor
    class Student4{  
        int id;  
        String name;  
        //creating a parameterized constructor  
        Student4(int i,String n){  
        id = i;  
        name = n;  
        }  
        //method to display the values  
        void display(){System.out.println(id+" "+name);}  
       
        public static void main(String args[]){  
        //creating objects and passing values  
        Student4 s1 = new Student4(111,"Karan");  
        Student4 s2 = new Student4(222,"Aryan");  
        //calling method to display the values of object  
        s1.display();  
        s2.display();  
        }
       
    
}  
    


// static keyword
class Test 
{ 
    // static method 
    static void reva() 
    { 
        System.out.println("from reva"); 
    } 
  
    public static void main(String[] args) 
    { 
          // calling m1 without creating any object of class Test 
           reva(); 
    } 
} 


class Java{
     static int i = 10;
     static String s = "REVA UNIVERSITY";
    //This is a static method
    static int m;
    static int n;

    // static block
    static{
          n = 90;
          m = 10;
    }
    public static void main(String args[]) 
    {
        System.out.println(n);
        System.out.println(m);
    }
 }
 


 class JavaExample3{
    static int var1;
    static String var2;
    //This is a Static Method
    static void disp(){
        System.out.println("Var1 is: "+var1);
        System.out.println("Var2 is: "+var2);
    }
    public static void main(String args[]) 
    {
        disp();
        int a = 32;
        int b = 34;
        a = a>>2;
       
        System.out.println(a);
   
        String f="hello";
        String d= "java " + (b+1);
        System.out.println(d);
    }
  }





  class charecter{

  }



class chr2{
    public static void main(String[] args){
        char c;
            System.out.println("enetr the char");
            Scanner sc = new Scanner(System.in);
            c  = sc.next().charAt(2);
            System.out.println(c);
    }

}




class book{
    static int booknumber;
    static String bookname ;

    public static void getbookdata(){
        Scanner read = new Scanner("System.in");
        
        booknumber = read.nextInt();
       
        bookname = read.nextLine();

    }
    public void display(){
        System.out.println("the name is "+booknumber);
        System.out.println("the number is "+bookname );
    }
    public static void main(String[] args){
        book b = new book();
        b.getbookdata();
        b.display();
    }
}
