package inheritance;



class a {
    void printa(){
        System.out.println("inside class a ");
    }
}

class b extends a{
    void printb(){
        System.out.println("inside class b");
    }
}
public class multilevel{
    public static void main(String[] args) {
        b l1 = new b();
        l1.printa();
        l1.printb();
    }
}
