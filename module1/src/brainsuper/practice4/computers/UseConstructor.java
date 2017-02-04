package brainsuper.practice4.computers;

/**
 * Created by citsym on 29.01.17.
 */
public class UseConstructor {
    public static void main(String[] args) {

        Computer comp =  new Computer("Mac",  1500, 5, 2000);
        comp.setPrice(100 + 100 * comp.getQuantityCPU());
    }
}
