package brainsuper.practice31;

/**
 * Created by citsym on 03.06.17.
 */
public interface ReadWrite {
    void read(User user) throws NoSuchMethodException;
    void write(User user, String lineToWrite) throws NoSuchMethodException;
}
