package data_strcutures;
import java.util.Scanner;
public class primes{
public static void main (String[] args){
    Scanner rd= new Scanner(System.in);
    int n= rd.nextInt();
    int[] array = new int [n];

    System.out.println("Enter the elements of the array: ");
    for(int i=0; i<n; i++)
    {
        array[i] = rd.nextInt();
    }
//Elements in the array are looped one by one using for loop.
    for(int i=0; i<array.length; i++){
        boolean isPrime = true;

//Using for loop and if condition, prime numbers are identified from all the numbers that are entered in the array.
        for (int j=2; j<i; j++){

            if(i%j==0){
                isPrime = false;
                break;
            }
        }
     
//All the prime numbers or the numbers that satisfy the if condition are displayed as output. 
        if(isPrime)

            System.out.println(i + " are the prime numbers in the array ");
    }

}
}
