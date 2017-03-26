package brainsuper.practice19;

import java.util.Deque;

/**
 * Created by citsym on 25.03.17.
 */
public class UseLimitedStack {

    public static void main(String[] args) {

        Deque<Integer> deque = new LimitedStack<>(10);


        for (int i = 0; i < 20; i++) {
            deque.push(i);
        }


        System.out.println(deque);




    }





}
