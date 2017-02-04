package brainsuper.practice5.singleton;

import java.util.Arrays;

/**
 * Created by citsym on 29.01.17.
 */
public class PasswordStorage {

    public static final PasswordStorage PASSWORD_STORAGE_ISTANCE = new PasswordStorage();

    String[] passwordArray = new String[0];

    public  String[] getPasswordArray() {
        return Arrays.copyOf(passwordArray, passwordArray.length);
    }

    public void addPassword(String pass){
        passwordArray = Arrays.copyOf(passwordArray, passwordArray.length+1);
        passwordArray[passwordArray.length-1] = pass;
    }


    private PasswordStorage(){

    }



}
