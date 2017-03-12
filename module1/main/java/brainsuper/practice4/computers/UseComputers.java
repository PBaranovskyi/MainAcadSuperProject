package brainsuper.practice4.computers;

/**
 * Created by citsym on 28.01.17.
 */
public class UseComputers {


    private  String testString = "String";

    public static void test(String someTestString){
        System.out.println(someTestString);
    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    public static void main(String[] args) {

        UseComputers uc = new UseComputers();

        test(uc.getTestString());


        UseComputers uc2 = new UseComputers();

        test(uc2.getTestString());


        Computer[] computers = new Computer[5];

        for (int i = 0; i < 5; i++) {
            computers[i] = new Computer("Mac", i * 1500, i, 2000);
            computers[i].setPrice(100 + 100 * computers[i].getQuantityCPU());
            Computer.numberOfComputers++;
        }


        for (Computer computer : computers) {
            computer.setPrice(computer.getPrice() / 0.90F);
        }


        for (Computer computer : computers) {
            System.out.println(computer.getPrice() + " CPU amount " + computer.getQuantityCPU());
        }


        for (Computer computer : computers) {
            computer.view();
        }


        for (Computer computer : computers) {
            System.out.println(computer);
        }


        System.out.println(Computer.numberOfComputers);

    }


}
