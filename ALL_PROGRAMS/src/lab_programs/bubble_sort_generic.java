package lab_programs;

import java.util.Arrays;

// public class bubble_sort_generic<T extends Comparable<? super T>> {
//     private T[] array;

//     bubble_sort_generic(T[] array){
//         this.array = array;
//     }
//     private T[] bubblesort(){
//         for( int i = array.length;i>1 ; i-- ){
//             for(int j = 0 ; j<i-1 ; j++){
//                 if(array[j].compareTo(array[j+1])>0){
//                     swapelements(j,array);
//                 }
    
//             }
//         }
//         return array;
//     }
//     public void swapelements(int index , T[] arr){
//         T temp = arr[index];
//         arr[index] = arr[index+1];
//         arr[index+1] = temp;

//     }
//     public static void main(String[] args) {
//         Integer arr[] = {2,1,4,6,546,4,643,64,7};
//         bubble_sort_generic<Integer> l1 = new bubble_sort_generic<>(arr);
//         Integer[] s1 = l1.bubblesort();
//         System.out.println("the soretd array is "+Arrays.toString(s1));
//     }

// }







// PRACTICE
// public class bubble_sort_generic<t extends Comparable<? super t>>{
//     private t[] array;
//     bubble_sort_generic(t[] array){
//         this.array = array;
//     }
//     private t[] bubblesort(){
//         for( int i = array.length ; i>1 ; i--){
//             for(int j = 0 ; j<i-1 ; j++){
//                 if(array[j].compareTo(array[j+1])>0){
//                     swapelements(j,array);
//                 }
//             }
//         }
//         return array;
//     }
//     public void swapelements(int index , t[] arr){
//         t temp = arr[index];
//         arr[index] = arr[index+1];
//         arr[index+1] = temp;

//     }
//     public static void main(String[] args) {
//         Integer[] arr = {1,2,1,4,2,412,45,3,5,5,53,5,35,3};
//         bubble_sort_generic<Integer> l1 = new bubble_sort_generic<>(arr);
//         Integer[] s1 = l1.bubblesort();
//         System.out.println("the sorted array is"+s1);
//     }
// }


public class bubble_sort_generic<t extends Comparable<? super t>>{
    t[] array;
    bubble_sort_generic(t[] array){
        this.array = array;
    }
    private t[] bubblesort(){
        for(int i = array.length ; i>1 ; i--){
            for(int j = 0 ;j<i-1 ; j++ ){
                if(array[j].compareTo(array[j+1])>0){
                    swapelements(j,array);

                }

            }
        }
        return array;
    }
    public void swapelements(int index , t[] arr){
        t temp = arr[index];
        arr[index] = arr[index+1];
        arr[index+1] = temp;

    }
    public static void main(String[] args) {
        Integer[] arr = {1,1,2,1,323,243,23,323,322213,333345432,213,21};
        bubble_sort_generic<Integer> l1 = new bubble_sort_generic<>(arr);
        Integer[] s1 = l1.bubblesort();
        System.out.println(s1);


    }
}
