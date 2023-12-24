package basic_java;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the two operands");
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println("the operations are :");
            System.out.println("1. addition (+)  2. subtraction(-) 3. multiplication (*) 4. division (/)");
            System.out.println("enter your choice");
            char op = sc.next().charAt(0);
            switch(op){
                case '+':System.out.println("the addition is: "+ (n+m));
                break;
                case '-':System.out.println("the subtraction is: "+( n - m) );
                break;
                case '*':System.out.println("the multiplication is: "+ (n*m));
                break;
                case '/':System.out.println("the division: "+ (n/m));
                break;
                default: System.out.println("invalid input");
                break;
                

            }

            
        }
        
    }
}
