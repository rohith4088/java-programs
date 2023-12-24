package queue_stack;

public class circular_queue {
    protected int[]data;
    private static final int  DEFAULT_SIZE = 10;
    int end  = 0;
    int front  = 0;
    int size = 0;

    public circular_queue(){
        this(DEFAULT_SIZE);
    }
    public circular_queue(int size) {
        this.data = new int[size];
    }
    public boolean isfull(){
        return size == data.length;
    }
    public boolean isempty(){
        return size == 0;
    }
    public boolean add(int n){
        if (isfull()){
            return false;
        }
        data[end++] = n;
        end = end%data.length;
        size++;
        return true;

    }
    public int remove(){
        if(isempty()){
            System.out.println("the queue is empty");

        }
        int removed = data[front++];
        front  = front % data.length;
        size++;
        return removed;
    }
    public void front(){
        System.out.println("the fonrt element is"+ data[front]);
    }
    public void display(){
        int  i = front;
        
        do{
            System.out.println(data[i]+"->");
            i++;
            i %= data.length;
        }while(i != end);{
            System.out.println("end");
        }
    }
}
