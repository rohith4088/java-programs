package nested_class;

public class Main {
    public static void main(String[] args) {
        class_member l1 = new class_member();
        class_member.test l2 = l1.new test();
        l2.msg("rohith1113");
    }
}
