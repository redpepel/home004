import java.util.Random;

/**
 * Created by User on 25.10.2016.
 */
public class Maximum {
    public static void main(String[] args){
        Random gen = new Random();
        int a [] = new int[8];
        for (int i = 0; i<a.length;i++) a[i] = gen.nextInt()%100;
        //вывод
        for (int x : a) System.out.println(x + "");
        System.out.println();
        // Поиск минимума
        int max = a[0];
        for (int i =1; i<a.length; i++)
            if (a[i]>max)
                max = a[i];
        System.out.println("максимум == " + max);
    }
}
