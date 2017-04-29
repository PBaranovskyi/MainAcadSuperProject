package brainsuper.practice25;

import java.util.Comparator;

/**
 * Created by citsym on 29.04.17.
 */
public class RevComparator implements Comparator<Integer> {

    int value;

    public RevComparator(int length) {

        value = length;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1 - value;
    }
}
