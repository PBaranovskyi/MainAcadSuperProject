package brainsuper.practice13.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by citsym on 04.03.17.
 */
public class UseStrings {

    public static void main(String[] args) {

        String str = "My ^Киев ,Hello my darling Kiev city. Krakov ";

        String toRemove = "Kiev ";

        int beginIndex = str.indexOf(toRemove);
//        String result = str.substring(beginIndex, beginIndex + toRemove.length());

        String regexKiev = "\\^К\\p{InCyrillic}+";
        String regexKiev2 = ".*";
        String result = str.replaceAll(regexKiev, "Paris ");


        System.out.println("Is matches :" + toRemove.matches(regexKiev));
        System.out.println(result);


        int k = 5;

        Integer k2= 10;

        Long l = 15L;

        float fl = 78.34F;


        someOperation(45.3234D);

        String st = "5";


        String kString = "" + k;

        System.out.println(kString.equals("15"));
        System.out.println(st == kString);

        System.out.println("==================");

//        StringTokenizer tokenizer = new StringTokenizer(str);
//
//        while (tokenizer.hasMoreElements()){
//            System.out.println(tokenizer.nextElement());
//        }

            String[] array = str.split("Kiev");

        for (String s : array) {
            System.out.println(s);
        }

        Pattern pattern = Pattern.compile(regexKiev);

        Matcher matcher =  pattern.matcher(str);

        boolean b = matcher.matches();

        Double d = 5.0d;
        double d1 = 5D;

        someOperation(d1);
        someOperation(5);

        someOperation(new Double("5"));
        someOperation(Double.valueOf("5D"));
    }

    private static void someOperation(Number v) {

    }
}
