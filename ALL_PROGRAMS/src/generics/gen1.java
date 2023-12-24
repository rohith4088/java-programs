package generics;


public class gen1<T, V extends Number> {
    private T num;
    V num2;
    //public gen1(T num) {
        //this.num = num;
    //}
    //final static int  num1 = 10;
    //void get(T num){
        //this.num = num;
    //}
    void gettwo(T num , V num2){
        this.num = num;
        this.num2 = num2;
    }
    T show(){
        return num;
    }
    V show2(){
        return num2;

    }
    void showtypes(){
        System.out.println(num.getClass().getName());
        System.out.println(num2.getClass().getName());
    }

    static<T,V> void gendisplay(T num , V num2){
        // same as showtypes
        // just to demonstarte generics method in java
        System.out.println(num.getClass().getName()+" = "+ num);
        System.out.println(num2.getClass().getName()+" = "+ num2);
    }
    public static void main(String[] args) {
        gen1<Integer,Double> k = new gen1<>();
        //gen1 <Double> k1 = new gen1<Double>();
        k.gettwo(10,20.0);
        
        //k1.get(30.00);
        //gen1<String> k2 = new gen1<>();
        //k2.get("rohoth");
        
       
        //System.out.println(k.show()); 
        //System.out.println(k.show2());
        //System.out.println(k1.show());
        //k.showtypes();
        gen1.gendisplay(90, 89.000);
    }
}
