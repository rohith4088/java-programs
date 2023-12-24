package lab_programs;
public class oops_Lamp {
    boolean lampon = false;
    void togglelamp(){
        lampon =! lampon;

    }
    boolean GetLampSate(){
        return lampon;
    }
    void ReturnStatus(){
        if(GetLampSate()){
            System.out.println("the lamp is on");
        }
        else{
            System.out.println("the lamp is off");
        }
    }
    public static void main(String[] args){
        oops_Lamp L1 = new oops_Lamp();
        L1.togglelamp();
        L1.GetLampSate();
        L1.ReturnStatus();
        


    }

}
