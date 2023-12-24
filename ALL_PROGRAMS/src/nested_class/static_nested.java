package nested_class;

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