package brainsuper.practice15.exceptions.overrideexceptions;

import java.io.IOException;

/**
 * Created by citsym on 11.03.17.
 */
public class Test {

    public void doJob() throws IOException{


        if (true){
            throw new IOException();
        }
    }
}
