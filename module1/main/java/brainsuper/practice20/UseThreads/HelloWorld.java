package brainsuper.practice20.UseThreads;

/**
 * Created by citsym on 26.03.17.
 */
public class HelloWorld {

    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(new Runnable() {

            public void run() {
                while (true) {
                    try {
                        while (true) {
                            Thread.sleep(5000);
                            System.out.println("Hello World!");
                        }
                    } catch (InterruptedException e) {
                        System.out.println("INTERRUPTED");
//                        Thread.currentThread().interrupt();
                        Thread.currentThread().stop();
                    }


                    System.out.println("Other work");
                }
            }
        });



        thread.start();
        System.out.println("press enter to quit");
        System.in.read();



        thread.interrupt();
    }
}