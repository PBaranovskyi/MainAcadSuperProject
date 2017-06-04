package brainsuper.practice32;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by citsym on 03.06.17.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        try (Socket socket  = new Socket("10.11.1.8",8899);) {

            OutputStream outputStream = socket.getOutputStream();

            ObjectOutputStream ob = new ObjectOutputStream(outputStream);

            Scanner scanner = new Scanner(System.in);

            while (scanner.hasNextLine()){
                String nextLine = scanner.nextLine();
                if (nextLine.equals("exit")){
                    break;
                }

                String[] split = nextLine.split(" ");

                ob.writeObject(new Student(split[0], split[1]));

            }
        }


    }
}
