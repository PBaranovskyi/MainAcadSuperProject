package brainsuper.practice32;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * Created by citsym on 03.06.17.
 */
public class MyThread extends Thread {

    private Socket socket;

    public MyThread(Socket socket) {

        this.socket = socket;
    }

    @Override
    public void run() {

        ObjectInputStream oi = null;
        try {
            oi = new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            try {
                readObject(oi);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }


    private  void readObject(ObjectInputStream oi) throws IOException, ClassNotFoundException {
        Student std = (Student) oi.readObject();
        System.out.println(std);
    }
}
