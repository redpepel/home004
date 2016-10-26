/**
 * Created by User on 24.10.2016.
 */

import java.util.Scanner;

public class jornal {

    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String result = in.next();

        char result1 = result.charAt(0);


        switch (result1) {
            case 'A':
                System.out.println("ОТЛИЧНО!!!");
                break;
            case 'B':
                System.out.println("{ХОРОШО ПОРАБОТАЛИ!!!");
                break;
            case 'C':
                System.out.println("ХОРОШО ПОРАБОТАЛИ!!!");
                break;
            case 'D':
                System.out.println("СДАНО");
                break;
            case 'E':
                System.out.println("ПЕРЕСДАЧА");
            default:
                System.out.println("СИМВОЛ НЕКОРРЕКТЕН!!!");

        }
        String s = "fffffNow is the time for all good men " +
                "to come to the aid of their country " +
                "and pay their due taxes.";
        System.out.println("indexOf(t) = " + s.indexOf('f'));


    }

}
