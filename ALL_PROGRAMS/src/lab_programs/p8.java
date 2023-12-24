package lab_programs;
import java.util.*;
class oddeven extends Exception{
    oddeven(){
        super("odd number excpetion");

    }
    oddeven( String msg){
        super(msg);
    }

}
class evenodd{
    void halfof(int num){
        try{
            if (num%2 != 0){
                throw new oddeven();
            }
            else if (num == 0){
                throw new oddeven();
            }
            else {System.out.println("the half of the number is"+num/2);}

        }catch(oddeven e){
            System.out.println(e.getMessage());
        }
    }
}
public class p8 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int num;
        System.out.println("enter your number");
        num = Integer.parseInt(sc.nextLine());
        evenodd l1 = new evenodd();
        l1.halfof(num);
    }
   
    
}
