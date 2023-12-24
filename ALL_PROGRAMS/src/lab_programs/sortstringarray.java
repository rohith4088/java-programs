package lab_programs;
import java.util.Scanner;

public class sortstringarray {
    public static void main( String[] main){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n  = sc.nextInt();
        String a[] = new String[n];
        System.out.println("enter the elements of the string");
        for(int i =0 ; i<a.length ; i++){
            a[i] = sc.nextLine();
        }
        System.out.println("the elements of the sprted array is:");
        sortstringarray.getsortedstrngarray(a);

    }
    public static void getsortedstrngarray(String[] a){
        String [] input = a;
        for ( int i = 0 ; i<a.length ; i++){
            for ( int j = i+1 ; j<a.length ; j++){
                if(a[i].compareToIgnoreCase(a[j])>0) {
                    String temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;

                }
            }
        } 
        for ( int i = 0 ; i<a.length ; i++){
            System.out.print(input[i]+ " ");
        }
    }
}
