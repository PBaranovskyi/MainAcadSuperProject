package brainsuper.practice3.arrays;

import sun.jvm.hotspot.debugger.cdbg.Sym;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by citsym on 22.01.17.
 */
public class UseArraysUtils {

    public static void main(String[] args) {

        int[] array = {4, 6, 23, 1, 234, 2, 4, 5};

        System.out.println(Arrays.toString(array));
        System.out.println(array + " Labuda ");


        Arrays.sort(array);


        System.out.println(Arrays.toString(array));

        int index =  Arrays.binarySearch(array, 300);

        System.out.println("Index from search " + index);


        System.out.println("==============Strings============");



        String[] months = {"January", "January", "January", "January", "Fabruary", "March", "April", "May", "June", "July"};

//        Arrays.sort(months);

        Arrays.parallelSort(months);


        System.out.println(Arrays.toString(months));

        int monthIndex =  Arrays.binarySearch(months, "January");

        System.out.println("January is in " + monthIndex);

        System.out.println("=============Sorting========");
//
//        Random random = new Random();
//
//        long currentTimeBefore = System.currentTimeMillis();
//
//        int[] hugeArray = new int[100_000_000];
//
//        for (int i = 0; i < hugeArray.length; i++) {
//            hugeArray[i] = random.nextInt();
//        }
//
//        long currentTimeAfter = System.currentTimeMillis();
//
////        for (int i : hugeArray) {
////            System.out.print(i + " ");
////        }
//
//        System.out.println("time : " + (currentTimeAfter - currentTimeBefore));
//
//        long currentTimeBeforeSort = System.currentTimeMillis();
//
//        Arrays.parallelSort(hugeArray);
//
//        long currentTimeAfterSort = System.currentTimeMillis();
//
//        System.out.println("time  sort: " + (currentTimeAfterSort - currentTimeBeforeSort));


        System.out.println("==============");



        Arrays.fill(months, null);


        String[] params = {"test", "test2"};

        System.out.println(Arrays.toString(args));
        System.out.println(Arrays.toString(params));


        System.out.println("Check the parameters " +  Arrays.equals(args, params));


        System.out.println("==============Coppy array");



        params = Arrays.copyOf(params, 3);
        params[2] = "test3";

        System.out.println(params[2]);

        System.out.println("==============Coppy array 2");

        String[] newStrings = new String[4];

        System.arraycopy(params, 0, newStrings, 0, 3);

        newStrings[3] = "test4";

        System.out.println("New array " + Arrays.toString(newStrings));


        System.out.println("============= Delete element");

        System.arraycopy(newStrings, 2, newStrings, 1, 2);

        newStrings[newStrings.length-1] = null;

        System.out.println("New array after delete" + Arrays.toString(newStrings));



    }
}
