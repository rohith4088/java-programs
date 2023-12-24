package generics;
import java.util.*;
public class lowerbound {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        pscm(list1);
        List<Number> list2 = Arrays.asList(5,6,8,98);
        pscm(list2);

    }
    public static void pscm(List<? super Integer> list1){
        System.out.println(list1);
    }
}
