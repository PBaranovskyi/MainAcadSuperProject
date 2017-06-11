package brainsuper.practice31;

import java.util.List;

/**
 * Created by citsym on 27.05.17.
 */
public interface CanRead {
     List<String> read(User user) throws NoSuchMethodException;
}
