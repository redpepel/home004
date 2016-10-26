import java.util.Random;

/**
 * Created by User on 25.10.2016.
 */
public class Srednee_arifmeticheskoe {
    public static void main(String[] args) {
        Random gen = new Random();
        double a[] = new double[20];
        for (int i = 0; i < a.length; i++) a[i] = gen.nextInt() % 100;
        //вывод
        for (double x : a) System.out.println(x + "");
        System.out.println();
        double result = 0;
       for (int i = 0; i < a.length; i++){

           result = result + a[i];

       }
        double srednee = result/a.length;
        System.out.println("Среднее арифметичское " + srednee);

    }
}
