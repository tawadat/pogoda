import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;

import java.util.Scanner;

public class Pogoda {
    public static void main(String[] args) throws IOException {
        UserSity sity = new UserSity();
                System.out.println("Введите город");
                Scanner scanner = new Scanner(System.in);
                String name = scanner.nextLine();

                sity.setNameSity(name);
                String userSiti = sity.getNameSity();

                URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q="+userSiti+"&appid=0d72269e54bf7322e4fa5333e8b48cc0&units=metric");
                InputStream input = url.openStream();

             byte[] buffer = input.readAllBytes();
             String str = new String(buffer);
             System.out.println(str);








    }
}
