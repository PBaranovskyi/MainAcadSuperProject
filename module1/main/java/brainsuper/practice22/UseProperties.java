package brainsuper.practice22;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Currency;
import java.util.Locale;
import java.util.Properties;

/**
 * Created by citsym on 09.04.17.
 */
public class UseProperties {

    public static void main(String[] args) throws IOException {
        String fileName = "module1/main/java/brainsuper/practice22/ourProperties.properties";
        FileInputStream fs = new FileInputStream(fileName);


        Properties properties = new Properties();
        properties.load(fs);


        String username = properties.getProperty("username");
        System.out.println(username);


        Currency cur = Currency.getInstance(Locale.US);

        System.out.println(cur.getSymbol());



    }
}
