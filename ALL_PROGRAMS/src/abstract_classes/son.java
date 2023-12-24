package abstract_classes;

public class son extends parent  {


    public son(int age){
        super(56);

        //this.age = age;


    }
    @Override

    void career() {
        System.out.println("the name is rohith ");
    }
    @Override
    void partner(){
        System.out.println("the age is "+age);
    }
    
}


