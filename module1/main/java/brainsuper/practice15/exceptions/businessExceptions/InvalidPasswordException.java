package brainsuper.practice15.exceptions.businessExceptions;

/**
 * Created by citsym on 11.03.17.
 */
public class InvalidPasswordException extends RuntimeException {

    public InvalidPasswordException(String message) {
        super(message);
    }
}
