package brainsuper.practice19;

import java.util.LinkedList;

/**
 * Created by citsym on 25.03.17.
 */
public class LimitedStack<T> extends LinkedList<T> {

    private final int limit;

    public LimitedStack(int limit) {

        this.limit = limit;
    }

    @Override
    public void push(T t) {
        if (size() >= limit){
            removeLast();
        }

        super.push(t);
    }

}
