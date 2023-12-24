package queue_stack;

public class dynamic_queue extends circular_queue {
    public dynamic_queue(){
        super();
    }
    public dynamic_queue(int size){
        super(size);
    }
    @Override
    public boolean add(int n){
        if (this.isfull()){
            int [] temp = new int[data.length*2];
            for(int i = 0; i<data.length;i++){
                temp[i] = data[(front + i)% data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        return super.add(n);

    }
}
