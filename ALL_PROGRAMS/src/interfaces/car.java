package interfaces;

public class car  implements engine , media, brake{

  
    public void start() {
        
        System.out.println("i start");
        
    }

    
    public void stop() {
       
        System.out.println("i stop");
        
    }

   
    public void acclerate() {
        
        System.out.println("i accc^");   
    }



    public void brake1() {
        System.out.println("i brake");
        
    }
    public void brake2(){
        brake.brake2();
    }


    
    
}
