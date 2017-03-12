package brainsuper.practice15.exceptions;

import brainsuper.practice15.exceptions.businessExceptions.InvalidPasswordException;

/**
 * Created by citsym on 11.03.17.
 */
public class Application {

    public static void main(String[] args) {

        String password = "sdfs";

        try {
            validate(password);
            registerUser();
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
            sendErrorToUser(e);
        } catch (Exception e){
            System.out.println("Log an error " + e.getMessage() );
        }
    }

    private static void sendErrorToUser(InvalidPasswordException e) {
        System.out.println("Error is sent to user");

    }

    private static void registerUser() {
        System.out.println("user Registered");
    }

    private static void validate(String password)  {
        PasswordServiceI ps = new PasswordService();
        ps.checkPassword(password);
    }
}
