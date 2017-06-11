package brainsuper.practice34.singleton;

import static brainsuper.practice34.singleton.PasswordStorage.PASSWORD_STORAGE_ISTANCE;

/**
 * Created by citsym on 29.01.17.
 */
public class UsePasswordStorage {

    public static void main(String[] args) {

        PASSWORD_STORAGE_ISTANCE.addPassword("Passw1");
        PASSWORD_STORAGE_ISTANCE.addPassword("Passw2");
        PASSWORD_STORAGE_ISTANCE.addPassword("Passw3");
        PASSWORD_STORAGE_ISTANCE.addPassword("Passw4");


        PASSWORD_STORAGE_ISTANCE.getPasswordArray()[0] = "234324";
        PASSWORD_STORAGE_ISTANCE.getPasswordArray()[1] = "234324";
        PASSWORD_STORAGE_ISTANCE.getPasswordArray()[2] = "234324";
        PASSWORD_STORAGE_ISTANCE.getPasswordArray()[3] = "234324";


        UsePassStorage.main();


    }

}
