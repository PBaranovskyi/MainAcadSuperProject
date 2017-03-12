package brainsuper.practice1.homework;

/**
 * Created by citsym on 15.01.17.
 */
public class UseHome {
    public static void main(String[] args) {
        String[] binary = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        int a = 6;
        int b = 3;
        int c = a & b;
        int d = a | b;
        int e = a ^ b;

        System.out.println("a = "+binary[a]+" "+a);
        System.out.println("b = "+binary[b]+" "+b);
        System.out.println("c = "+binary[c]+" "+c);
        System.out.println("d = "+binary[d]+" "+d);
        System.out.println("e = "+binary[e]+" "+e);

    }
}
