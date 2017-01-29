package brainsuper.practice3.arrays;

/**
 * Created by citsym on 22.01.17.
 */
public class UseArrays {

    public UseArrays(int param){
        System.out.println(param);
    }

    public static void main(String[] args) {

        int[] arr = new int[10];


//        System.out.println(args[0]);
//        System.out.println(args[1]);


        arr[5] = 10;

        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }


        System.out.println();

        String[] strings = new String[5];

        strings[0] = "Petya";

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }

        System.out.println();

        for (String string : strings) {
            System.out.print(string + " ");
        }

        System.out.println();

        for (int item : arr) {
            System.out.print(item + " ");
        }

        System.out.println();

        String[] months = {"January", "Fabruary", "March", "April", "May", "June", "July"};

        months[2] = null;

        for (String month : months) {
            System.out.print(month + " ");
        }

        System.out.println("============================");
//        months[7] = "August";
//
//        System.out.println(months[7]);



        int[][] arrMulty = new int[3][];

        arrMulty[0] = new int[15];
        arrMulty[1] = new int[7];
        arrMulty[2] = new int[3];

        for (int[] ints : arrMulty) {
            for (int item : ints) {
                System.out.print(item + " ");
            }
            System.out.println();

        }


        System.out.println("============================");


        int[][] arrMulty2 = new int[10][5];

        arrMulty2[6] = new int[2];

        for (int[] ints : arrMulty2) {
            for (int item : ints) {
                System.out.print(item + " ");
            }
            System.out.println();
        }


    }
}
