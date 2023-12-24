package data_strcutures;

public class static_block{
    static int a = 4;
        static int b;
        static {


// STATIC BLOCK 
//THE STATIC BLOCK IS ONLY RAN ONCE, WHEN THE FIRST POBJECT IS CREATED
// YOU CANNOT ACCESS A NON-STATIC METHOD IN A STATIC BLOCK
// STATIC BLOCK CAN ONLY ACCESS A STATIC BLOCK



System.out.println("this is an static block");
            b = a*4;
        }
        public static void main(String[] args){
            static_block boj = new static_block();
            System.out.println(static_block.a + " " + static_block.b);
            static_block.b+=3;
            static_block obj2 = new static_block();
            System.out.println(static_block.a+ " "+ static_block.b);
        
        
        }
            
}




// INNER CLASS COPNCEPT
class inner_class{
    static class test{    
    // REMOVE STATIC YOU WILL GET ERROR
        String name;
        public test(String name){
        // put this as static and replace 
        //"this" keyword with class name = test
            this.name = name;
        }


    @Override 
    //BY DEFAULT "TOSTRING" METHOD EXTENDS OBJECT CLASS IN JAVA
    // THESE ARE CALLED ANNOTATIONS
    // WHEN SOUT(A) IS CALLED JAVA WILL CHECK FOR TOSTRING, IT IS HERE 
    // SO THE RETURN STATEMENT IS PRINTED
    // AND RANDOM VALUE IS NOT GENETARTED

    public String toString(){
        return name;
    }
// TO USE TEST CLASS WITHOUT STATIC KEYWORD DECLARE IT OUTSIDE THE INNER_CLASS
// ONCE YOU DECLARE IOT OUTSIDE THE INNER_CLASS THE "TEST" CLASS IS NO LONGER 
// DEPENDENT ON THE INNER_CLASS

    }
    public static void main(String[] args) {
        test a = new test("rohith");
        test b = new test("rohith2");
        //PRINTING AN OBJECT
        //THE OUTPUT IS - inner_class$test@251a69d7
        // CAUSE THIS IS HOW JAVA IMPLEMENTS THE OBJE CT INTERNALLY
        // INTERNALLY JAVA WILL CHEKCK IS THE CLASS OF THE OBJECT A CONTAINS "TOSTRING"
        // METHOD( TEST CLASS ), IT DOESNT SO JAVA USES ITS OWN "TOSTRING" METHOD 
        // AND THE OUTPUT IS CLASSNAME@HASHVALUE

        System.out.println(a);
        System.out.println(a.name);
        System.out.println(b.name);

    }
}



// SINGELTON CLASS
 class SINGELTON{
    private SINGELTON(){

    }

    private static SINGELTON instance;
    private static SINGELTON getINstance(){
        if (instance == null){
            instance = new SINGELTON();

        }
        return instance;
    }
    public static void main(String[] args) {
        SINGELTON obj = SINGELTON.getINstance();
        
    }
}