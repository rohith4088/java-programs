package generics;
import java.util.Arrays;

public class custom_ARRAYLIST {
    private int[] data;
    private static int  DEAFAULT_SZIE = 10;
    private int size = 0;//also working as index value
    public custom_ARRAYLIST() {
        this.data = new int [DEAFAULT_SZIE];

    }
    public void add(int num ){
        if (isfull()){
            resize();  
        }
        data[size++] = num;
    }
    private boolean isfull(){
        return size == data.length;

    }
    private void resize(){
        int[] temp =  new int[data.length*2];
        for(int i = 0 ; i < data.length ; i++){
            temp[i] = data[i];

        }
        data = temp;

    }
    public int remove(){
        int removed  =  data[--size];//NOT DELETING ONLY POINTING
        return removed;
    }
    public int get (int index){
        return data[index];

    }
    public int size(){
        return size;
    }
    public void set( int index , int value){
        data[index] = value;
    }
    @Override
    public String toString(){
        return Arrays.toString(data);

    }
    public static void main(String[] args) {
        
        custom_ARRAYLIST list = new custom_ARRAYLIST();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list); 

    }
     


}
