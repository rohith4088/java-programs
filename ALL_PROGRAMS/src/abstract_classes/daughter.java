package abstract_classes;

public class daughter extends parent {



    public daughter(int age){
        super(45);
        //this.age = age;
    }
   @Override
    void career(){
        System.out.println("the name is pooja");

    }
    @Override
    void partner( ){
        System.out.println("the age is"+this.age);
    }
    
}
