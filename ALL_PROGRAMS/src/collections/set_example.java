package collections;


import java.util.HashSet;

import java.util.Set;
import java.util.TreeSet;

public class set_example{
    public static void main(String[] args) {
        Set<Integer> hs  = new HashSet<>();
        hs.add(20);
        hs.add(23);
        hs.add(24);
        hs.add(24);
        hs.add(19);
        System.out.println(hs);
        
        Set <Integer> ts = new TreeSet<>(hs);
        System.out.println(ts);
        
       
    }
}
