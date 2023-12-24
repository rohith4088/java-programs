package generics;

import java.util.Arrays;
public class custom_gen_arraylist<T>{
    private Object[] data;
    private static int  DEAFAULT_SZIE = 10;
    int size = 0;//also working as index value
    public custom_gen_arraylist() {
        this.data = new Object [DEAFAULT_SZIE];

    }
    public  void add(Object num ){
        if (isfull()){
            resize();  
        }
        data[size++] = num;
    }
    private boolean isfull(){
        return size == data.length;

    }
    private void resize(){
        Object[] temp =  new Object[data.length*2];
        for(int i = 0 ; i < data.length ; i++){
            temp[i] = data[i];

        }
        data = temp;

    }
    public Object remove(){
        Object removed  =  (Object)(data[--size]);//NOT DELETING ONLY POINTING
        return removed;
    }
    public Object get (int index){
        return (Object) data[index];

    }
    public int size(){
        return size;
    }
    public void set( int index , int value){
        data[index] = value;
    }
    public Object  peek(){
        return  (int)data[0];
    }
     @Override
     public String toString(){
         return Arrays.toString(data);

    }
    public static void main(String[] args) {
        
        //custom_gen_arraylist list = new custom_gen_arraylist();
        //list.add(10);
        //list.add(20);
        //list.add(30);
        //list.add(40);
        //System.out.println(list); 

        custom_gen_arraylist<Integer> list = new custom_gen_arraylist<>();
        list.add(1000);
        for(int i = 0 ; i<10; i++){
            list.add(i);
        }
        System.out.println(list);
        list.size();

        System.out.println(list.size);


        System.out.print(list.peek());
    }
    


}
