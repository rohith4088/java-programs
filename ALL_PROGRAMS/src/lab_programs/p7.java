package lab_programs;
abstract class employee{
    String name;
    Double basic_sal;
    double da;
    double hra;
    double it;
    employee(String n , Double b){
        name  = n;
        basic_sal = b;
        da = basic_sal * 0.7;
        hra = basic_sal * 0.3;
        it = basic_sal * 0.4;
    }
    abstract  double gross_sal();
}


class manager extends employee{
    double inc;
    manager(String n , double b){
        super(n,b);
    }
    double gross_sal(){
        inc = basic_sal*0.1;
        double gross = basic_sal + da + hra + inc -it;
        System.out.println("Employee Name : "+name);
        System.out.println("Designation : Manager ");
        System.out.println("Basic of Employee : "+basic_sal);
        System.out.println("DA of Employee : "+da);

        System.out.println("HRA of Employee : "+hra);

        System.out.println("IT of Employee : "+it);

        System.out.println("Annual Increment of Employee : "+inc);
         return gross;


    }
}

class technician extends employee{
    double inc;
    technician(String n , double b){
        super(n,b);
    }
    double gross_sal(){
        inc = basic_sal* 0.15;
        double gross = basic_sal + da + hra + inc -it;
        System.out.println("Employee Name : "+name);
        System.out.println("Designation : technician ");
        System.out.println("Basic of Employee : "+basic_sal);
        System.out.println("DA of Employee : "+da);

        System.out.println("HRA of Employee : "+hra);

        System.out.println("IT of Employee : "+it);

        System.out.println("Annual Increment of Employee : "+inc);
         return gross;


    }
}


public class p7 {
    public static void main(String[] args) {
        manager m = new manager("a", 400.0);
        employee e;

        e = m;
        System.out.println(e.gross_sal());

        technician t1 = new technician("aa", 89);
        e = t1;
        System.out.println(e.gross_sal());

    }
    
}
