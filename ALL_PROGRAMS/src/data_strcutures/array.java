package data_strcutures;

import java.util.Arrays;

class arrayd{
    public static void main(String[] args){
        int a[] = new int[7];
        for (int i = 0 ; i < 7; i++ ){
            a[i] = i+1;
        }
        for (int i = 0 ; i < 7; i++ ){
            System.out.println("array["+i+"]="+a[i]);
        }
        System.out.println(a.length);

    }
}

// implemntin arrays.equals
class arrays{
    public static void main (String[] args){
        int a[] = {1,2,3,4,5};
        int b[] = {23,4,354,657,876};
        System.out.println(Arrays.equals( a,  b));

    }
}

// fills method

class filss{
    public static void main(String[] args){
        int a[] = {1,2,3,4};
        int k = 10;
        Arrays.fill(a,k);
        
        System.out.println(Arrays.toString(a));
    } 
}

// coppyof() operator
class copys{
    public static void main(String[] args){
        int a[] = {1,2,3,4};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(Arrays.copyOf(a,10)));

    }
}

// copyOfrange() operator
class copyss{
    public static void main(String[] args){
        int a[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(Arrays.copyOfRange(a,1,4)));

    }
}

// sort() function

class sorty{
    public static void main(String[] args){
        int a[] = {1,489,3435,32454634,6323,3525};
        System.out.println(Arrays.toString(a));
        //System.out.println(a);
        Arrays.sort(a);

        System.out.println(Arrays.toString(a));
    }
}

// biinary search()
class binsorty{
    public static void main(String[] args){
        int a[] = {1,489,3435,32454634,6323,3525};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a,489));
    }
}

// public class array {
// 	static int Stack[]=new int[50];
// 	static int top=-1;

// 	static void push(int ele) {
// 		Stack[++top]=ele;
// 	}
// 	static int pop() {
// 		if(top==-1) {
// 			System.out.println("Underflow");
// 			return -1;
// 		}
// 		else {
// 			return(Stack[top--]);
// 		}
// 	}

// 	static int posteval(String exp) {

// 		for(int i=0;i<exp.length();i++) {
// 			char c=exp.charAt(i);

// 			if(Character.isDigit(c)) {
// 				push(Character.getNumericValue(c));
// 			}
// 			else {
// 				 int opnd2 = pop(); 
//        			 int opnd1 = pop();   
//         		switch(c) 
//         		{ 
//             		case '+':	push(opnd1+opnd2); break; 
//             		case '-': 	push(opnd1-opnd2); break; 
//             		case '/': 	push(opnd1/opnd2); break; 
//             		case '*': 	push(opnd1*opnd2); break; 
//             		default:    System.out.println("\n\tInvalid Operator.");
//                         	System.exit(0);
//         		}
//         	}
// 		}

// 	return Stack[top];		
// 	}

// 	public static void main(String[] args) {
// 		TODO Auto-generated method stub
// 		Scanner s=new Scanner(System.in);

// 		System.out.println("Enter the postfix expression");
// 		String in=s.nextLine();
// 		System.out.println("The postfix expression is"+in);

// 		int result=posteval(in);
// 		System.out.println("The result is"+result);

// 	}

// }



// public class array{

// }
// public static void main(String[] args)
//      {
//            Scanner read = new Scanner(System.in);
// System.out.println("Enter string with parenthesis [],{},or( )"); String str = read.nextLine();
// if (str.isEmpty())
//                 System.out.println("Empty String");
//            else
// System.out.println(checkBalance(str)); read.close();
//      }

// public static String  checkBalance(String str)
//      {
//            Stack stack = new Stack();
//            for (int i = 0; i < str.length(); i++)
//            {
// char ch = str.charAt(i);
// if (ch == '[' || ch == '(' || ch == '{')
// stack.push(ch);
// else if ((ch==']' || ch=='}' || ch == ')') && (!stack.isEmpty()))
// if(((char)stack.peek()=='(' && ch==')')||((char) stack.peek()=='{'&&ch=='}')== ']')) || ((char) stack.peek() == '[' && ch