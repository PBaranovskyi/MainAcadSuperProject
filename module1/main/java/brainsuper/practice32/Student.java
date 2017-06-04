package brainsuper.practice32;

import java.io.Serializable;

/**
 * Created by citsym on 03.06.17.
 */
public class Student implements Serializable {
    private String name;
    private String course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
