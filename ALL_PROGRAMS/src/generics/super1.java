package generics;



class p{
    String name  = "rohith";
    public p() {
        System.out.println(" insde super class  conrtictor");
    }

    void printp(){
        System.out.println("inside  super class method p");
    }
    
}
class c extends p {
    public c(){
        super();
    }
    void printc(){
        //System.out.println("inside c");
        super.printp();
       System.out.println(super.name);
        
    }
    
  
}
public class super1{
    public static void main(String[] args) {
        c l = new c();
        l.printc();
       
    }
}