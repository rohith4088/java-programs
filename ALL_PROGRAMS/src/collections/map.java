package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map {
    public static void main(String[] args) {
        Map<String , Integer> hm = new HashMap<>();
        hm.put("a", new Integer(100));
        hm.put("b", new Integer(10000)); 
        hm.put("c", new Integer(1009)); 
        //returing a set view
        Set<Map.Entry<String ,Integer>> st = hm.entrySet();
        for(Map.Entry<String , Integer> me :st){
            System.out.println(me.getKey());
            System.out.println(me.getValue());
        }
        
        
    }
}
