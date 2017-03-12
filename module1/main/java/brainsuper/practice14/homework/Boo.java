package brainsuper.practice14.homework;

/**
 * Created by citsym on 05.03.17.
 */
 class Foo {
    static String s;
    Foo(String s) {
        this.s = s;
        System.out.println("Constructor");
    }
    static {
        System.out.println("Static block");
    }
}
public class Boo {
    public static void main(String[] args) {
        Foo b1 = new Foo("1");
        b1.s = "df";
    }
}