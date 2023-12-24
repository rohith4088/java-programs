package exception;

public class multiple_catch{
    public static void main(String[] args) {
        try{
            //int x = 0;
            //int num = 67/x;
            int x1[] = new int[5];
            System.out.println(x1[20]);
            //System.out.println(num);
           
        } catch(ArithmeticException e){
            System.out.println("dont do this bro");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("what bro change it");
        }
        catch(Exception e){
            System.out.println("the god");
        }
        System.out.println("exiting try-catch block");
        
    }
}
    

