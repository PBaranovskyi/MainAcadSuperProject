package brainsuper.practice19;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by citsym on 25.03.17.
 */
public class UseQueue {

    public static void main(String[] args) {
        Deque<String> q = new LinkedList<>();
        q.add("aa");
        q.add("bbb");
        q.add("cccc");
        q.add("dddddd");
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.poll());


    }
}
