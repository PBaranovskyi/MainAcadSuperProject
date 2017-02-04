package brainsuper.practice7;

/**
 * Created by citsym on 04.02.17.
 */
public class InitializeSection {

    public static int someInt;

    static boolean even = false;


    int nonStatic = 7;


    static {
        System.out.println("Call static anonym init method");


    }

    static {
        System.out.println("Call static2 anonym init method");


    }


    {
        System.out.println("Call anonym init method");

        if (even){
            someInt = 6;
        } else {

            someInt = 7;
        }

    }



    public InitializeSection(){
        System.out.println("Call constructor");
    }


    public static int getSomeInt() {

        System.out.println("Method invoke");

//        initSomeInt();

        if (even){
            return 6;
        } else {

            return 7;
        }
    }


    public static void initSomeInt(){
        someInt = 9;
    }

    public static void main(String[] args) {

        InitializeSection instance = new InitializeSection();

        System.out.println("=================");
        InitializeSection instance2 = new InitializeSection();

//        initSomeInt();

        System.out.println(someInt);
    }
}
