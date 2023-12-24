package data_strcutures;

import java.util.*;

// public class palindrome {
//     public static void main(String[] args) {
//         System.out.println("String Palindrome Test");
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter any string: ");
//         String inputString = in.nextLine();
//         System.out.println("a. Check palindrome using stack");
//         System.out.println("b. Check palindrome using queue");
//         System.out.print("Enter choice: ");
//         String ch = in.nextLine();
//         switch (ch.charAt(0)) {
//             case 'a':
//             case 'A':
//                 if (usingStack(inputString))
//                     System.out.println("The input String "
//                             + inputString + " is a palindrome.");
//                 else
//                     System.out.println("The input String " + inputString + " is not a palindrome.");
//                 break;
//             case 'b':
//             case 'B':
//                 if (usingQueue(inputString))
//                     System.out.println("The input String " + inputString + " is a palindrome.");
//                 else
//                     System.out.println("The input String " + inputString + " is not a palindrome.");
//                 break;
//             default:
//                 System.out.println("Invalid Choice enter the character! (TRY AGAIN)");
//                 break;

//         }
//         in.close();
//     }

//     static boolean usingStack(String string) {
//         Stack<Character> stack = new Stack<>();
//         for (int i = 0; i < string.length(); i++)
//             stack.push(string.charAt(i));
//         String reverseString = "";
//         while (!stack.isEmpty())
//             reverseString = reverseString + stack.pop();
//         if (string.equals(reverseString))
//             return true;
//         else
//             return false;
//     }

//     static boolean usingQueue(String string) {
//         Queue<Character> queue = new LinkedList<>();
//         for (int i = string.length() - 1; i >= 0; i--)
//             queue.add(string.charAt(i));
//         String reverseString = "";
//         while (!queue.isEmpty())
//             reverseString = reverseString + queue.remove();
//         if (string.equals(reverseString))
//             return true;
//         else
//             return false;
//     }
// }

// DOING ON OWN
class palindrome1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("palindrome using stack and queues");
        System.out.println("enetr your string ");
        String test = sc.nextLine();
        System.out.println("a. checking using stack");
        System.out.println("b. checking using queue");
        System.out.println("eneyr your choice");
        String ch = sc.nextLine();
        switch (ch.charAt(0)) {
            case 'a':
            case 'A':
                if (usingStack(test))
                    System.out.println("the string is a palindrome");
                else
                    System.out.println("not a palindrome");
                break;
            case 'b':
            case 'B':
                if (usingQueue(test))
                    System.out.println("the string is a palindrome");
                else
                    System.out.println("this is not a palindrome");
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        sc.close();
    }

    static boolean usingStack(String test) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < test.length(); i++) {
            stack.push(test.charAt(i));
        }
        String rev = "";
        while (!test.isEmpty())
            rev = rev + stack.pop();
        if (test.equals(rev))
            return true;
        else
            return false;
    }

    static boolean usingQueue(String test) {
        Queue<Character> queue = new LinkedList<>();
        for (int i = test.length() - 1; i <= 0; i--) {
            queue.add(test.charAt(i));
        }
        String rev = "";
        while (!queue.isEmpty())
            rev = rev + queue.remove();
        if (test.equals(rev))
            return true;
        else
            return false;
    }
}