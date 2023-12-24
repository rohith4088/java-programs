package nested_class;

public class class_member {
    private String name;
     class test{
        void msg(String name ){
            System.out.println("the name is "+name);
        }
    }
    public static void main(String[] args) {
        class_member l = new class_member();
        class_member.test l1 = l.new test();
       l1.msg("rohith");

        
    }
    
}
