package queue_stack;



public class custom_queue {
    int[] data;
    private static final int  DEFAULT_SIZE = 10;
    int end  = 0;
    public custom_queue(){
        this(DEFAULT_SIZE);
    }
    public custom_queue(int size) {
        this.data = new int[size];
    }
    public boolean isfull(){
        return end  == data.length;
    }
    public boolean isempty(){
        return end == 0;
    }
    public boolean add(int n){
        if(isfull()){
            return false;
        }
        data[end] = n;
        end++;
        return true;
    }
    public int  pop() throws Exception{
       if (isempty()){
        throw new Exception("queue is empty");

       }
       int removed  = data[0];
       for(int i = 1; i<end ; i++){
        data[i-1] = data[i];
       }
       end --;
       return removed;
    }
    public void display(){
        for(int i =0; i<end ; i++){
            System.out.println(data[i]+"  ");
        }
    }
    

}
