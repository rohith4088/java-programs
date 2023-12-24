package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iterator {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(12);
        l.add(32);
        l.add(9);
        l.add(8);
        l.add(5);
        Iterator<Integer> it = l.iterator();
        while(it.hasNext()){
            int l1 = it.next();
            System.out.println(l1);
        }
        ListIterator<Integer> lt = l.listIterator();
        while(lt.hasNext()){
            int l2 = lt.next();
            System.out.println(l2);
        }
    }
}
