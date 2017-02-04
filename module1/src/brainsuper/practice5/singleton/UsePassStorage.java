package brainsuper.practice5.singleton;

/**
 * Created by citsym on 29.01.17.
 */
public class UsePassStorage {

    public static void main(String... args) {

        for (String password : PasswordStorage.PASSWORD_STORAGE_ISTANCE.getPasswordArray()) {
            System.out.println(password);
        }


        System.out.println(PasswordStorage.PASSWORD_STORAGE_ISTANCE.getPasswordArray().length);


    }
}
