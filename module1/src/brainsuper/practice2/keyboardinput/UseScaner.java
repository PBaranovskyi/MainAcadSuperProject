package brainsuper.practice2.keyboardinput;

import java.util.Scanner;

/**
 * Created by citsym on 21.01.17.
 */
public class UseScaner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNextInt()){
            int number = scanner.nextInt();

            if (number == -1){
                break;
            }

            System.out.println("Received :" + number);

        }


        while (scanner.hasNextLine()){
            String line = scanner.nextLine();

            if (line.equals("exit")){
                break;
            }

            System.out.println("Received :" + line);

        }



    }
}
