package brainsuper.practice30;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by citsym on 21.05.17.
 */
public class UsePath {

    public  void  test(){
        System.out.println("TEST");
    }

    @SuppressWarnings("deprecation, unchecked")
    public static void main(String[] args) {

        ChildUsePath child = new ChildUsePath();

        child.test();

        Date date = new Date();
        date.getSeconds();


       String[] arr  =  cutTheSymbols("My name is Jorge", "ff", "ff", "ff");

        System.out.println(Arrays.toString(arr));

    }


    public static String[] cutTheSymbols(String line, String... strings){
        for (String word : strings) {
            line = line + word;
        }

        return strings;
    }
}
