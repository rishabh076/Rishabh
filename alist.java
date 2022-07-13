import java.util.ArrayList;

import java.util.Collections;

public class alist {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);
        int element=list.get(0);
        System.out.println(element);
        list.add(1,2);
        System.out.println(list);
        list.set(2, 7);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        int size= list.size();
        System.out.println(size);
        Collections.sort(list);
        System.out.println(list);

        
    }
    
}
