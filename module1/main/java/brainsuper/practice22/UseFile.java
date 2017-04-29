package brainsuper.practice22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by citsym on 09.04.17.
 */
public class UseFile {

    public static void main(String[] args) throws IOException {
        String fileName = "module1/main/java/brainsuper/practice22/text.txt";
        FileInputStream fs = new FileInputStream(fileName);

//        FileReader

        FileReader reader = new FileReader(new File(fileName));

        BufferedReader bf = new BufferedReader(reader);

//
//        List<String> collect = bf.lines().collect(Collectors.toList());
//
//        for (String s : collect) {
//            System.out.println(s);
//        }

        bf.lines().forEach((s) ->
                System.out.println(s)
        );


//        int k;
//
//	/*Method read() of FileInputStream class also throws
//	 * a checked exception: IOException*/
//        while(( k = fs.read() ) != -1)
//        {
//            System.out.print((char)k);
//        }
//
//        fs.close();

    }
}
