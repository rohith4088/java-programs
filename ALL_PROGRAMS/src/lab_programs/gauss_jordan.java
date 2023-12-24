package lab_programs;
import java.util.*;
public class gauss_jordan {
    public static int n;
    public static void ConvertToDiagonal(float[][]a, int n){
        float ratio;
        for(int i = 0; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                if (j!=i){
                    ratio = a[j][i]/a[i][i];
                    for(int k = 0 ; k<n+1 ; k++){
                        a[j][k] = a[j][k] -ratio*a[i][k];
                    }
                }
                System.out.println("intermediatte form is :");
                for(int x = 0; x<n ; x++){
                    for( int y = 0 ; y<n+1 ; y++){
                        System.out.println(a[x][y]);
                    }
                }
            }
        }
    }
    public static void PirntUnknows(float[][]a , int n){
        System.out.println("the number of unknows are ; ");
        for (int i = 0 ; i<n ; i++){
            System.out.println(a[i][n]/a[i][i]);
        }
    }
    public static void main(String[] args){
        int i , j , k , x , y ;
        Scanner sc = new Scanner(System.in);
        float ratio;
        System.out.println("enter the number of unknows ; ");
        n = sc.nextInt();
        float [][] a = new float [n][n+1];
        System.out.println("enter the augmented matrix ; ");
        for (int i2 = 0 ; i2<n ; i2++){
            for(int j2 = 0 ; j2<n+1 ; j2++){
                a[i2][j2] = sc.nextFloat();
            }
        }
        ConvertToDiagonal(a, n);
        PirntUnknows(a, n);
    }
    //public final static Scanner STDIN_SCANNER = new Scanner(System.in);
    
}