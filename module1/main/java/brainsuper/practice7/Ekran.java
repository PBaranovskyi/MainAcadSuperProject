package brainsuper.practice7;

import java.util.Arrays;

/**
 * Created by citsym on 04.02.17.
 */
public class Ekran {

    int o, l;
    private static String name;

    public static void main(String[] args) {
        System.out.println("Line1 \\n line2");
        System.out.println("Line1 \n line2");
        System.out.println("Line1 'some' line2");

        int[] arr = new int[6];

        System.out.println(Arrays.toString(arr));

        System.out.println(new Object());


        int[] arr1;

        int[] arr2 = new int[3];

        char[] arr3 = {'a', 'b'};

        System.out.println("CHECK DEBUG :" + Arrays.toString(arr3));

        arr1 = arr2;

//        arr1 = arr3;

        char c = '%';
        int i = 'F';

        i = c;


//      f

        System.out.println(arr1[0] + ":" + arr1[1]);

        int[][] array2 = {{1, 2, 3}, {}, {1, 2, 3, 4, 5}};

        int d, k;

        float[] f1[], f2;

        int[][] array;


        int anar[] = new int[5];

        System.out.println(anar[0]);


        String[] ejgStr =

                new String[][]{{null}, new String[]{"a", "b", "c"}, {new String()}}[0];


        String some = ejgStr[0];

        System.out.println(some);


        String name = getName();


        bussinessLogicMethod(name);

    }

    private static void bussinessLogicMethod(String name) {

        if (name != null) {
            System.out.println(name.toUpperCase());
        }

    }

    public static String getName() {

        //

        return null;
    }
}
