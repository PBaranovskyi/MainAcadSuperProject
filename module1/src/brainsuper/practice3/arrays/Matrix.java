package brainsuper.practice3.arrays;

/**
 * Created by citsym on 22.01.17.
 */
public class Matrix {

    public static void main(String[] args) {

        int[][] matrix = {{1,5,3},{1,10,3},{1,6,3}};

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }


        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int i1 = matrix[i].length - 1; i1 >= 0; i1--) {
                System.out.print(matrix[i][i1] + " ");
            }
            System.out.println();
        }
    }



}
