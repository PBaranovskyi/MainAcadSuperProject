package brainsuper.simpleapp;

import java.util.Arrays;

/**
 * Created by citsym on 15.01.17.
 */
public class UseToString {
    public static void main(String[] args) {

        int[] array = getArray(4);

        if (array != null && array[0] ==4) {
            System.out.println(Arrays.toString(array));
        }

        System.out.println(TypesOfData.ALIAS_VALUE);

    }

    private static int[] getArray(int lenght) {

        if (lenght < 5) {
            return null;
        }

        int[] array;
        array = new int[10];

        array[0] = 4;
        array[1] = 6;

        return array;
    }
}
