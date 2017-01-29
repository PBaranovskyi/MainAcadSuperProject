package brainsuper.practice4.computers;

/**
 * Created by citsym on 28.01.17.
 */
public class UseComputers {

    public static void main(String[] args) {

        Computer[] computers = new Computer[5];

        for (int i = 0; i < 5; i++) {
            computers[i] = new Computer("Mac", i * 1500, i, 2000);
            computers[i].setPrice(100 + 100 * computers[i].getQuantityCPU());
        }


        for (Computer computer : computers) {
            computer.setPrice(computer.getPrice() / 0.90F);
        }


        for (Computer computer : computers) {
            System.out.println(computer.getPrice() + " CPU amount " + computer.getQuantityCPU());
        }

    }
}
