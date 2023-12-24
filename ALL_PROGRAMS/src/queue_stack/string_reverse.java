package queue_stack;

import java.util.Scanner;

public class string_reverse {
    protected char[] data;
    private static  final  int DEFAULT_SIZE = 10;
    public  int ptr = -1;
    public string_reverse(){// SETTING THE STACKS INIITIAL SIZE
        this(DEFAULT_SIZE);
    }
    public string_reverse(int size) {
        this.data = new char[size];
    }
    public char pop() throws stack_exception{
        if(isempty()){
            throw new  stack_exception ("cannot pop an empty stack");
        }
        char removed  = data[ptr];
        ptr--; 
        return removed;
    }
    public boolean add(char n){
        if(isfull()){
            System.out.println("stack is full");
        }
        ptr++;
        data[ptr] = n;
       
         //data[ptr++] = n;
        return true;  
    }
    // public int peek() throws stack_exception{
    //     if(isempty()){
    //         throw new stack_exception("cannot peek an empty stack");
    //     }
    //     return data[ptr];
    // }
    public boolean isfull() {

        return ptr == data.length-1;
    }
    public boolean isempty(){
        return ptr == -1;

    }
    public void display(){
        for(int i = 0 ; i<=ptr ;i++){
            System.out.println(data[i]);
            //System.out.println(ptr);
        }
    }
    public static void main (String[] args) throws Exception {
        int i ;
        String result = "";
        Scanner sc= new Scanner(System.in);
        string_reverse s = new string_reverse();
        String name = sc.nextLine();
        char[] res = name.toCharArray();
        for(i = 0; i<res.length ; i++){
            s.add(res[i]);
        }
        for(i = 0; i<res.length ; i++){
           result = result + s.pop();
        }
        System.out.println(result);


    }
}

