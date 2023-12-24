package nested_class;
abstract class person{
    abstract void eat();
}
public class anonymus {
    public static void main(String[] args) {
        person p = new person() {
            void eat(){System.out.println("hello friends");}
        };
        p.eat();
    }

}
