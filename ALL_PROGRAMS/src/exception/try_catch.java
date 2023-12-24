package exception;
public class try_catch{
    public static void main(String[] args) {
        try{
            int x = 0;
            int num = 67/x;
            System.out.println(num);
            System.out.println("enetring try block");
        } catch(ArithmeticException e){
            System.out.println("dont do this bro");
        }
        System.out.println("exiting try-catch block");


    }
        
}

