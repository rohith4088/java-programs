package lab_programs;
import java.util.*;
import java.lang.Math;
// public class square {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enetr the number");
//         int n  = sc.nextInt();
//         double epsilon = 1.0e-15;
//         double x = n;
//         while (Math.abs(x-n/x)>epsilon*x){
//             x = (x+n/x)/2.0;
//         }
//         System.out.println(x);


//     }
    
// }
public class square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  number ");
        int n = sc.nextInt();
        double eplison = 1.0e-15;
        double x = n;
        while(Math.abs(x-n/x)> eplison*x){
            x = (x+n/x)/2.0;

        }
        System.out.println(x);
    }
}