package lab_programs;
import java.util.*;
// interface Arthematic{
//     int operation(int a , int b);
// }
// public class lambda_interface {



    
//     public static void main(String[] args){
//         int x, y;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enetr the two operands:");
//         x = sc.nextInt();
//         y = sc.nextInt();
//         Arthematic addition = (int a , int b) -> (a+b);
//         System.out.println("addtion is :"+addition.operation(x, y));
//         Arthematic subtraction = (int a , int b) -> (a-b);
//         System.out.println("subtarction is :"+subtraction.operation(x, y));
//         Arthematic multiplication = (int a , int b) -> (a*b);
//         System.out.println("multiplication is :"+multiplication.operation(x, y));
//         Arthematic division = (int a , int b) -> (a/b);
//         System.out.println("division is :"+division.operation(x, y));




//     }

    
// }





// // SECOND EXAMPLE
// //NO PARAMETER LAMBDA EXPRESSION
// // interface h{
// //     void greet(String a);
// // }
// // class le{
// //     public static void main(String[] args) {
// //         String hello = ("rohith") -> {
// //             System.out.println("hello");
// //         };
// //         hello.greet("rohith");
// //     }
// // }




// //PRACTICE 1

// // interface arthematic{
// //     int operartion(int a, int b);
// // }
// // public class lambda_interface{
// //     Scanner sc  = new Scanner(System.in);
// //     int x = sc.nextInt();
// //     int y = sc.nextInt();
// //     arthematic addition  = (int a ,int b) -> (a+b);
// //     System.out.println(addition.operation(x,y));
// //     arthematic subtraction = (int a, int b) -> (a+b);
// //     System.out.println(subtarction.operation(x,y));
// //     arthematic multiplication = (int a,int b) ->(a*b);
// //     System.out.println(multiplication.operartion(x,y));
// //     arthematic division = (int a, int b) -> (a/b);
// //     System.out.println(division.operation(x,y));

// // }



//PRATICE TWO
interface arthematic{
    int operation(int x , int y);
}
public class lambda_interface{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two operands");
        int x = sc.nextInt();
        int y = sc.nextInt();
        arthematic addition = (int a , int b) -> (a+b);
        System.out.println(addition.operation(x, y));
        arthematic subtraction = (int a , int b) ->(a-b);
        System.out.println(subtraction.operation(x, y));
        arthematic multiplication = (int a , int b) -> (a*b);
        System.out.println(multiplication.operation(x, y));
        arthematic division = (int a, int b) -> (a/b);
        System.out.println(division.operation(x, y));
    }
}



