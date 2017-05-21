package brainsuper.practice30;

/**
 * Created by citsym on 21.05.17.
 */
public class UsegeVarargs {

    @SafeVarargs
    static <T> T[] asArray(T... args) {
        return args;
    }

//    static <T> T[] arrayOfTwo(T a, T b) {
//        return asArray(a, b);
//    }

    public static void main(String[] args) {
        String[] bar = asArray("hi", "mom");

        System.out.println(bar);

    }
}
