package brainsuper.practice15.exceptions.overrideexceptions;

/**
 * Created by citsym on 11.03.17.
 */
public class Demo extends Test {

    @Override
    public void doJob()  {
//        super.doJob();
        // more logic
        System.out.println("Additional logic");
    }
}
