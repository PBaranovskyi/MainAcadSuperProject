package brainsuper.practice15.exceptions;

import brainsuper.practice15.exceptions.businessExceptions.InvalidPasswordException;
import org.junit.Test;

/**
 * Created by citsym on 11.03.17.
 */
public class PasswordServiceTest {
    @Test(expected = InvalidPasswordException.class)
    public void checkPasswordInvalid() throws Exception {

        // Prepare data
        // Test data
        String preparedData1 = "dfdf";
        String preparedData2 = "111111";

        // Expacted result


        // Execute code
        PasswordService ps = new PasswordService();
        ps.checkPassword(preparedData1);
        ps.checkPassword(preparedData2);

        // Compare the result




    }

    @Test
    public void checkPasswordValid() throws Exception {

        // Prepare data
        // Test data
        String preparedData = "kslfjsldkfslf";

        // Expacted result



        // Execute code
        PasswordService ps = new PasswordService();
        ps.checkPassword(preparedData);

        // Compare the result

    }
}