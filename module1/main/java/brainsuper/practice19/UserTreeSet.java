package brainsuper.practice19;

import java.util.*;

/**
 * Created by citsym on 25.03.17.
 */
public class UserTreeSet {

    public static void main(String[] args) {


        Comparator<Integer> reverseLogic = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };
        Arrays.sort(new Integer[]{1, 32, 434, 545, 343}, reverseLogic);






        Set<Integer> set = new TreeSet<>(reverseLogic);

        set.add(453);
        set.add(3);
        set.add(53);
        set.add(53);
        set.add(53);
        set.add(53);
        set.add(53);
        set.add(53);
        set.add(45);

        System.out.println(set);


        Set<Car> cars = new TreeSet<>();


        Collection collection = UseCollections.fillWithCars(cars);


        System.out.println(collection);

    }
}
