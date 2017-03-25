package brainsuper;

/**
 * Created by citsym on 19.03.17.
 */
class Coord2 {
    int x, y;

    Coord2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Coord3 extends Coord2 {
    int z;

    Coord3(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

class Coord4 extends Coord3 {
    int t;

    Coord4(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }
}


class CoordM<T extends Coord2> {
    T space[];

    CoordM(T[] array) {
        space = array;
    }
}


public class Main {

    public static void main(String[] args) {
        Coord2[] arra = new Coord2[10];
        arra[0] = new Coord2(5, 20);

        CoordM<Coord2> cordM = new CoordM<>(arra);



//        CoordM<String> cordMString = new CoordM<>(new String[]{"1","10"});


//        showXY(cordM);
    }

//    static void showXY(CoordM <? extends String> obj) {
//        System.out.println("Array coordinate (x,y): ");
//        for (int i = 0; i < obj.space.length; i++)
//            System.out.print("(" + obj.space[i] + "," + obj.space[i].y + "); ");
//        System.out.println();
//    }

}
