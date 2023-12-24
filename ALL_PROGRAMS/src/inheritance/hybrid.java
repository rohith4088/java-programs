package inheritance;



interface C{
    void show();
}
 interface B{
    void show1();
}
class A{
    void disp2(){
        System.out.println("IM INSIDE CLASS A");
    }
}
class d extends A implements C,B{

    @Override
    public void show() {
        System.out.println("interface c");
        
    }
    public void showd(){
        System.out.println("inside class d");
    }
    @Override
    public void show1(){
        System.out.println("body of interface b");
    }

   
        

    }
public class hybrid extends d{
        public static void main(String[] args) {
        hybrid l1 = new hybrid();
            l1.show(); l1.show1(); l1.disp2();
            
            
            
        }
        
    }
    

