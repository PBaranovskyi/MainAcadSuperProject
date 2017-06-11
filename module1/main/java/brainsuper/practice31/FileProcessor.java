package brainsuper.practice31;

import java.io.*;

/**
 * Created by citsym on 27.05.17.
 */
public class FileProcessor implements CanRead, CanWrite, ReadWrite {


    private String filePath;

    public FileProcessor(String filePath) {
        this.filePath = filePath;
    }

    @MyPermission(PermissionAction.USER_READ)
    public void read(User user) throws NoSuchMethodException {
        System.out.println(user.getName() + "Tries to Read file");
//        processPermission(getClass(), user, "read", this::readFile, User.class);
        File file = new File(filePath);
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            bufferedReader.lines().forEach(System.out::println);

        } catch (FileNotFoundException e) {
            System.out.println("File with path " + filePath + " does`nt exist");
        } catch (IOException e) {
            System.out.println("Some exeption while close");
        }
        return;
    }

    @MyPermission(value = {PermissionAction.USER_CHANGE, PermissionAction.USER_ADMIN})
    public void write(User user, String lineToWrite) throws NoSuchMethodException {
        System.out.println(user.getName() + "Tries to write into file");
        File file = new File(filePath);
        try (FileWriter outputStreamWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)) {

            bufferedWriter.write(lineToWrite);

        } catch (FileNotFoundException e) {
            System.out.println("File with path " + filePath + " does`nt exist");
        } catch (IOException e) {
            System.out.println("Some exeption while close");
        }
//        processPermission(getClass(), user, "write", () -> writeFile(lineToWrite), User.class, String.class);
    }


}
