package data_strcutures;
import java.util.Random;
class radmos{
    public static void main(String[] args){
        Random rd = new Random();
        int a [] = new int [5];
        for ( int i =0 ;i<a.length; i++){
            a[i] = rd.nextInt();
        }
        for (int i =0 ; i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}