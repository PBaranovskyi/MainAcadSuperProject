package brainsuper.practice31;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * Created by citsym on 10.06.17.
 */
public class FileProcessorTest {

    @BeforeClass
    public static void setUp(){
        System.out.println("NEW TEST");
    }

    @Test
    public void testRead() throws Exception {
        //Prepare data
        String filePath = "/Users/citsym/IdeaProjects/MainAcadSuperProject/module1/main/test/brainsuper/practice31/test.txt";
        String[] expectList = {"String for test", "I`m reading"};


        //execute the code
        FileProcessor fp = new FileProcessor(filePath);
        List<String> actualList = fp.read(new User("Mock"));


        System.out.println(actualList);

        // compare the result
        Assert.assertArrayEquals(expectList, actualList.toArray());

    }


    @Test(expected = NullPointerException.class)
    public void testReadNullUser() throws Exception {
        //Prepare data
        String filePath = "/Users/citsym/IdeaProjects/MainAcadSuperProject/module1/main/test/brainsuper/practice31/test.txt";
        String[] expectList = {"String for test", "I`m reading"};


        //execute the code
        FileProcessor fp = new FileProcessor(filePath);
        List<String> actualList = fp.read(null);


        System.out.println(actualList);

        // compare the result
        Assert.assertArrayEquals(expectList, actualList.toArray());

    }

    @Ignore
    public void testReadFileNotFound() throws Exception {
        //Prepare data
        String filePath = "/Users/citsym/IdeaProjects/MainAcadSuperProject/module1/main/test/brainsuper/practice31/test2.txt";


        //execute the code
        FileProcessor fp = new FileProcessor(filePath);
        List<String> actualList = fp.read(new User("Mock"));


//        System.out.println(actualList);
//
//        // compare the result
//        Assert.assertArrayEquals(expectList, actualList.toArray());

    }

    @Test
    public void testWrite() throws Exception {

        //Prepare data
        String filePath = "/Users/citsym/IdeaProjects/MainAcadSuperProject/module1/main/test/brainsuper/practice31/testForWright.txt";
        String[] expectList = {"String for test", "I`m writing"};


        //execute the code
        FileProcessor fp = new FileProcessor(filePath);
        fp.write(new User("Mock"), "String for test\nI`m writing");

        List<String> actualList = fp.read(new User("Mock"));

        System.out.println(actualList);

        // compare the result
        Assert.assertArrayEquals( expectList, actualList.toArray());

    }


}