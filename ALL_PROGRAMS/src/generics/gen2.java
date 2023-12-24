package generics;

import java.util.Arrays;

public class gen2<T> {
    private Object[] data;
    private static int  DEAFAULT_SZIE = 10;
    int size = 0;//also working as index value
    public gen2() {
        this.data = new Object [DEAFAULT_SZIE];

    }
    
    public  void add(T num ){
        
        data[size++] = num;
    }
    
    @Override
    public String toString(){
        return Arrays.toString(data);
    }
    public static void main(String[] args) {
        gen2<Integer> l = new gen2<>();
        l.add(200);
        System.out.println(l);
        //System.out.println(l.ad);
    }
}
