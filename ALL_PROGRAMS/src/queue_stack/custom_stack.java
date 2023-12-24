package queue_stack;
public class custom_stack {
    protected int[] data;
    private static  final  int DEFAULT_SIZE = 10;
    public  int ptr = -1;
    public custom_stack(){// SETTING THE STACKS INIITIAL SIZE
        this(DEFAULT_SIZE);
    }
    public custom_stack(int size) {
        this.data = new int[size];
    }
    public int pop() throws stack_exception{
        if(isempty()){
            throw new  stack_exception ("cannot pop an empty stack");
        }
        int removed  = data[ptr];
        ptr--;
        return removed;
    }
    public boolean add(int n){
        if(isfull()){
            System.out.println("stack is full");
        }
        ptr++;
        data[ptr] = n;
       
         //data[++ptr] = n;
        return true;  
    }
    public int peek() throws stack_exception{
        if(isempty()){
            throw new stack_exception("cannot peek an empty stack");
        }
        return data[ptr-1];
    }
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
}
