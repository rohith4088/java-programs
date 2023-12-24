package generics;
import java.util.Arrays;
import java.util.List;
// THE STATEMENT "T EXTENDS NUMBER IS A TYPEBOUD USING WILDCARDS USED FOR TIGHT CHECKING"
public class wildcards<T extends Number> {
    
    private Object[] data;
    private static int  DEAFAULT_SZIE = 10;
    private int size = 0;//also working as index value
    public wildcards() {
        this.data = new Object [DEAFAULT_SZIE];

    }
    public void getlist(List <? extends Number> list){
        // do something
        // HERE YOU CAN PASS TYHE SUBCLASSES OF NUMBER CLASS 

    }
    public  void add(T num ){
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
    public T remove(){
        T removed  =  (T)(data[--size]);//NOT DELETING ONLY POINTING
        return removed;
    }
    public T get (int index){
        return (T) data[index];

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
        
        //custom_gen_arraylist list = new custom_gen_arraylist();
        //list.add(10);
        //list.add(20);
        //list.add(30);
        //list.add(40);
        //System.out.println(list); 

        wildcards<Integer> list = new wildcards<>();
        //NOW HERE IN THE GENERIC I CAN ONLY ADD INTEGER OR ANY NUMERIC FORM AND NOT 
        // STRIG OR ANY OTHER TYPE  BECAUSE OF THE WILDCARDS USED IN THE CLASS DEF.

        list.add(1000);
        for(int i = 0 ; i<7; i++){
            list.add(i);
        }
        System.out.println(list);
        list.size();

        System.out.println(list.size);
    }
    


}
    

