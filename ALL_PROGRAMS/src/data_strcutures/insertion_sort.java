package data_strcutures;
public class insertion_sort {
    public static void sorty(int array[]){
        int n = array.length;
        for ( int j=0; j<n ; j++){
            int key = array[j];
            int i = (j-1);
            while(i>-1 && array[i] > key){
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = key;
        }
        
    }
    public static void main ( String[] args){
        int arr [] = {3,3,4,2,4,3,5};
        sorty(arr);
        for (int i:arr){
            System.out.println(i+"");
            

        }
    }
}
