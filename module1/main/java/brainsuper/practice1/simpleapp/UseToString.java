package brainsuper.practice1.simpleapp;

import java.util.Arrays;

/**
 * Created by citsym on 15.01.17.
 */
public class UseToString {


    public static void main(String[] args) {

        int[] arrayMain = getArray(10);


        if (arrayMain != null && arrayMain[0] ==4) {
            System.out.println(Arrays.toString(arrayMain));
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
