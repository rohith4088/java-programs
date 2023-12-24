package basic_java;

public class command_line {
    public static void main(String[] args) {
        for(int i = 0; i<args.length ; i++){
            System.out.println("args[" + i + "]: " + args[i]);// arguments are passed at runtime
        }
    }
}
