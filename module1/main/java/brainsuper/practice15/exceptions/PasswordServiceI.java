package brainsuper.practice15.exceptions;

import brainsuper.practice15.exceptions.businessExceptions.InvalidPasswordException;

/**
 * Created by citsym on 11.03.17.
 */
public interface PasswordServiceI {

    void checkPassword(String password) throws InvalidPasswordException;

    void savePassword(String password);

    String generateRandomValidPassword();

    String getPasswordByUserName(String userName);
}
