package brainsuper.practice20;

import java.util.*;

/**
 * Created by citsym on 26.03.17.
 */
public class UseMaps {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        hm.put("one", 1);
        hm.put("two", 2);
        hm.put("tree", 3);
        hm.put("four", 4);
        hm.put("five", 5);

        Set<Map.Entry<String, Integer>> entries = hm.entrySet();

        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();


        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            System.out.println("Key: " + next.getKey() + " Value: " + next.getValue() );
        }


    }
}
