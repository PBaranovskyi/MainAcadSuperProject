package brainsuper.practice32;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by citsym on 03.06.17.
 */
public class Server {
    public static void main(String[] args) {

        try (ServerSocket listener = new ServerSocket(8899)) {
            Socket socket;
            while (true) {
                socket = listener.accept();
                MyThread myThread = new MyThread(socket);
                myThread.start();
            }

//            oi.close();
//            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
