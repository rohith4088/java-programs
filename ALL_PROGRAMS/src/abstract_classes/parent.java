package abstract_classes;
public abstract class parent {
    int age;
    public parent(int age){
        // CREATING CONSTRICTOR FOR ABSTRATCT CLASS IS ALSO POSSIBLE
        this.age = age;

    }
    static void hello(){
        System.out.println("this is a test to chekck is we can declare static method in abstract callses");
    }

    abstract void career();
    abstract void partner ();

}

