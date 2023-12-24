package queue_stack;

import java.util.Scanner;

public class stackmain {
    public static void main(String[] args) throws stack_exception {
        // custom_stack stack = new custom_stack(5);
        // Scanner sc = new Scanner(System.in);

        // // stack.add("agh");
        // // stack.add("afr");
        // // stack.add("tgvr");
        //  //System.out.println("the pop value is"+stack.pop());
        //  //System.out.println(stack.pop());
        // // System.out.println(stack.pop());
        // // System.out.println(stack.pop());
        // stack.display();
        

        //System.out.println("the peek value is "+stack.peek());




        // int i;
		// String result="";
		// Scanner input=new Scanner(System.in);
		
		// custom_stack st=new custom_stack();
		// System.out.println("Enter the string");
		// String name = input.nextLine();
		// char[] arraystring = name.toCharArray();
		// for(i=0;i<arraystring.length;i++)
		// 	st.add(arraystring[i]);
		// for(i=0;i<arraystring.length;i++)
		// 	result = result + st.pop();
		
		// System.out.println("Reversed string is " + result);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        boolean flag  = true;
        custom_stack stack = new custom_stack(size);
        while(flag){
            System.out.println("1. add");
            System.out.println("2. remove");
            System.out.println("3. peek");
            System.out.println("4 . exit");
            int n = sc.nextInt();
            switch(n){
                case 1:int ele = sc.nextInt();
                if(stack.add(ele)) System.out.println();
                break;
                case 2:
                System.out.println(stack.pop());
                break;
                case 3: System.out.println(stack.peek()); 
                break;
                case 4: System.exit(0);
                default: System.out.println("invalid input");
                break;

                
                

            }
        }




    }
    
}
