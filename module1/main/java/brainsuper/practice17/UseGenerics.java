package brainsuper.practice17;

import java.util.List;

import java.util.ArrayList;

/**
 * Created by citsym on 18.03.17.
 */
public class UseGenerics {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Five");
        list.add("Five");

        System.out.println(" List size " +list.size());

        int third = list.indexOf("Third");
        list.add(third+1, "Forth");

        System.out.println(third + 1 + " element in list is " +list.get(third + 1));

        System.out.println(" List size " +list.size());

        list.remove(7);
        list.remove(Integer.valueOf(5));

        for (Object element : list) {
            System.out.println(element);
        }


        soutFirsLetter(list);
    }

    private static void soutFirsLetter(List<String> list) {
        for (String element : list) {
            System.out.println(element.charAt(0));
        }
    }
}
