package generics;

class a {
    String a;
    String  b,c;
    private String x;
    public a(String a,String  b,String  c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public a(){System.out.println("this is a constrctor called by this keyword");}

    public a(String x){// calling a default constructor using a parametreised construtcor

        this();
        this.x = x;
    }
     public void m(){
        System.out.println("calling this from m using this keyword");
    }
    public void n(){
        this.m();    }
    
    public void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        

    }
    
        
    

     @Override
     public String toString(){
        return x;
        

     }
}

public class thiss{
    public static void main(String[] args) {
         a l = new a("rohiht");
         a l2 = new a("a","b" ,"c");
        System.out.println(l);
        l2.display();
       
        // l.n();
     
        // l2.display();
        
    }
}