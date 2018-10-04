import java.util.Arrays;
import java.util.Collections;

/**
 * Task 4.1
 *
 * @author Pavlov Alexander
 */


public class Task41 {


    public static void main(String[] args) {

        //для хранения индекса макс. элемента
        //заполняем его случайными числами
        //и выводим
        int max = 1;
        int imax = 1;
        int min = -1;
        int imin = -1;


        int[] boxnum = new int[20];
        for (int i = 0; i < boxnum.length; i++) {
            boxnum[i] = (int) Math.round((Math.random() * 31) - 15);

        }
        //в отдельном цикле ищем максимальный и минимальный элемент
        for (int i = 0; i < 20; i++) {
            if (boxnum[i] > max) {
                max = boxnum[i];
                imax = i;

            }
            {
                if (boxnum[i] < min)
                    min = boxnum[i];
                imin = i;
            }
        }

        //выводим результат
        System.out.println("max элемент = " + max + " имеет индекс " + imax);
        System.out.println("min элемент = " + min + " имеет индекс " + imin);

        //меняем местами индексы
        int temp = imax;
        imax = imin;
        imin = temp;


        //выводим результат
        System.out.println("max элемент = " + max + " имеет индекс " + imax);
        System.out.println("min элемент = " + min + " имеет индекс " + imin);

    }

}








