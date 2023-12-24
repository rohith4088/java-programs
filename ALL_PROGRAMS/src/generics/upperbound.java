package generics;

import java.util.*;

public class upperbound {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 3, 4, 5);
        List<String> list2 = Arrays.asList("rohith");
        System.out.print(show(list1));
        //System.out.println(sum(list1));
        System.out.println(list2);
        // System.out.println(sum(list2));
        //System.out.println(show(list3));
    }

    public static int show(List<? extends Number> list) {
        System.out.println(list);
        return 0;
    }
    // public static Double sum(List<? extends Number> list){
    //     Double sum = 0.0;
    //     for(Number i : list){
    //         sum+= i.doubleValue();
    //     }
    //     return sum;

    // }

}

