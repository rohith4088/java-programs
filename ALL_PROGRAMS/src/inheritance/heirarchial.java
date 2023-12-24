package inheritance;

class animal {
    void printa(){
        System.out.println("ima an animal");
    }
}
class dog extends animal{
    void printb(){
        System.out.println("im a dog");
    }
}
class cat extends animal{
    void printc(){
        System.out.println("ima a cat");
    }
}
public class heirarchial{
    public static void main(String[] args) {
        dog d = new dog();
        d.printa();
        d.printb();
        cat c = new cat();
        c.printa();
        c.printc();
    }
}
// package inheritance;
// class animal{
//     void printa(){
//         System.out.println(("im the parent class"));
//     }
// }
// class dog extends animal{
//     void printd(){
//         System.out.println("im a dog");
//     }
// }
// class cat extends animal{
//     void printc(){
//         System.out.println("im a cat");
//     }
// }
// public class heirarchial{
//     public static void main(String[] args) {
//         dog d  = new dog();
//         d.printa();
//         cat c = new cat();
//         c.printa();




//     }
// }