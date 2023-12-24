package data_strcutures;
public class method_overloading{
    int sum(int a , int b){
        return a+b;
    }
    int sum(int a , int b , int c){
        return c = a+b;
    
    }
    public static void main(String[] args) {
        method_overloading obj1 = new method_overloading();
        obj1.sum(5,3);
        obj1.sum(1,2,3);
        System.out.println();


    }
}