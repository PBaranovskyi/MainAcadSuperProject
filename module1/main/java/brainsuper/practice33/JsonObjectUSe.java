package brainsuper.practice33;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by citsym on 04.06.17.
 */
public class JsonObjectUSe {
    public static void main(String[] args) throws IOException {
        String city = "Moscow";
        String url = "http://api.openweathermap.org/data/2.5/weather?q=" + city + ",uk&appid=6b240f4b248bfa146a36f2bd7c2c4e71&units=metric";


        URL oracle = new URL(url);
        java.net.URLConnection yc = oracle.openConnection();
        System.out.println(oracle.getProtocol());

        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);


            JSONObject object = new JSONObject(inputLine);
            Double o = object.getJSONObject("main").getDouble("temp");

            System.out.println(o);
        }


    }
}
