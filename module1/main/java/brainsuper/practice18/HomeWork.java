package brainsuper.practice18;

/**
 * Created by citsym on 19.03.17.
 */


class A {

    private int i = 3;

    public int getI() {
        return i;
    }


    public int calculate() {
        return i * 10;
    }
}

class B extends A {

    B(){

    }

    B(String name){

    }

    int i = 4;


    @Override
    public int getI() {
        return i;
    }
}

public class HomeWork {

    public static  void main(String[] args) {

        A a = new B();

        B d = new B();

        System.out.print(a.calculate() + " " + d.getI());

    }


}
