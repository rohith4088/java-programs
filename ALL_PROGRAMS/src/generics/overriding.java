package generics;

class parent {
   
    void eat(){
        System.out.println(" this is eat of human");
    }
}

class child{
    
    void eat(){
        System.out.println("rhis is eat of child");
    }
}
public class overriding{
    public static void main(String[] args) {
        parent p = new parent();
        p.eat();
        child c = new child();
        c.eat();
    }
}