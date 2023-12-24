package nested_class;

public class metho_localclass {
    void mymethod(){
        class test{
            void string(){
                System.out.println("inner class within a method");
            }
        }
        test l2 = new test();
        l2.string();

    }
   public static void main(String[] args) {
    metho_localclass l1 = new metho_localclass();
    l1.mymethod();
   }

}
