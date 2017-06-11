package brainsuper.practice31;

import java.util.List;

/**
 * Created by citsym on 03.06.17.
 */
public interface ReadWrite {
    List<String> read(User user) throws NoSuchMethodException;
    void write(User user, String lineToWrite) throws NoSuchMethodException;
}
