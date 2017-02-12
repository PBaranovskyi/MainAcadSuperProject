package brainsuper.singleton;

import static java.util.Arrays.copyOf;

/**
 * Created by citsym on 29.01.17.
 */
public class PasswordStorage {

    public static final PasswordStorage PASSWORD_STORAGE_ISTANCE = new PasswordStorage();

    String[] passwordArray = new String[0];

    public  String[] getPasswordArray() {
        return copyOf(passwordArray, passwordArray.length);
    }

    public void addPassword(String pass){
        passwordArray = copyOf(passwordArray, passwordArray.length+1);
        passwordArray[passwordArray.length-1] = pass;
    }


    private PasswordStorage(){

    }



}
