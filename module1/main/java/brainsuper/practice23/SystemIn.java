package brainsuper.practice23;

import java.io.*;

/**
 * Created by citsym on 22.04.17.
 */
public class SystemIn {

    public static void main(String[] args) throws IOException {
//        byte[] byteArr = new byte[10];
//        InputStream inputStream = System.in;
//        OutputStream stdout = System.out;
//        int read = inputStream.read(byteArr);
//        stdout.write(byteArr);
//        System.out.println("Total number of bytes: " + read);
//
//        for (byte b : byteArr) {
//            System.out.println(b);
//        }

        int byteValue = 97;
        System.out.println((char) byteValue);

        InputStream inputStream = new FileInputStream("text.txt");
        OutputStream stdout = new FileOutputStream("textCopy.txt");

        int variable;
        while ((variable = inputStream.read())!=-1){
            stdout.write(variable);
        }


//        System.out.println("Total number of bytes: " + read);
//
//        for (byte b : byteArr) {
//            System.out.println(b);
//        }

    }
}
