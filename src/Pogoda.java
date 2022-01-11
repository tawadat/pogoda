import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Pogoda {
    public static void main(String[] args) {

        System.out.println("Введите город");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.println("Введите дату в формате dd-MM-yyyy" );
        String userDate = scanner.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date date = formatter.parse(userDate);
            System.out.println(formatter.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
