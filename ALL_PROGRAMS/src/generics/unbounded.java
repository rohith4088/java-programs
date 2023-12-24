package generics;
import java.util.*;
public class unbounded {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        pscm(list1);
        List<Number> list2 = Arrays.asList(5,6,8,98);
        pscm(list2);
        List<String> list3 = Arrays.asList("rohith","is ","a");
        System.out.println(list3);

    }
    public static void pscm(List<?> list){
        System.out.println(list);
    }

}
