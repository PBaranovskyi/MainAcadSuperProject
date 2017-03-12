package brainsuper.practice15.exceptions;

import brainsuper.practice15.exceptions.businessExceptions.InvalidPasswordException;

/**
 * Created by citsym on 11.03.17.
 */
public class PasswordService implements PasswordServiceI{

    private static final String REGEXP_PASSWORD_PATTERN = "\\w{8,}";

    @Override
    public void checkPassword(String password) throws InvalidPasswordException {
//        Object o = null;
//        o.getClass();
        if (!password.matches(REGEXP_PASSWORD_PATTERN)) {
            throw new InvalidPasswordException("Password " + password + "is invalid");
        }

    }

    @Override
    public void savePassword(String password) {

    }

    @Override
    public String generateRandomValidPassword() {
        return null;
    }

    @Override
    public String getPasswordByUserName(String userName) {
        return null;
    }

}
