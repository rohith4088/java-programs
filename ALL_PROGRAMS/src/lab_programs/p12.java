package lab_programs;


import java.util.ArrayList;




// public class p12 {
  
// private static Double add(ArrayList<? extends Number> num) { 
// double sum=0;
// double den =2.0;
// for(Number n:num) {
// if((n.doubleValue()%den)!=0)
// { sum = sum+n.doubleValue();
// System.out.println(n.doubleValue()); }
// }
// return sum; }
// public static void main(String[] args) {
// ArrayList<Integer> l1=new ArrayList<Integer>(); 
// l1.add(10);
// l1.add(20);
// l1.add(21);
// l1.add(35);
// l1.add(42);
// l1.add(55);
// System.out.println("displaying the sum= "+add(l1));
// } }


public class p12{
    public static Double add(ArrayList<? extends Number> num){
        Double sum = 0.0;
        Double den = 2.0;
        for(Number n: num){
            if(n.doubleValue() % den !=0){
                sum = sum+ n.doubleValue();
                System.out.println(n.doubleValue());
            }


        }
        return sum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(23);
        l1.add(22);
        l1.add(21);
        l1.add(27);
        l1.add(26);
        System.out.println("the sum is"+add(l1));

    }
}



