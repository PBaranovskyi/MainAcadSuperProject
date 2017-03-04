package brainsuper.practice12.worldWithoutPolymorfizm;

import java.util.Arrays;

/**
 * Created by citsym on 26.02.17.
 */
public class ArraysUtils {

    private ArraysUtils() {
    }

    public  static <T> T[] addElementToArray(T[] elements, T element) {
        T[] newCarArray = Arrays.copyOf(elements, elements.length + 1);
        newCarArray[newCarArray.length - 1] = element;

        return newCarArray;
    }

}
