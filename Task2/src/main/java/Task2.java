/**
 * Task 2
 * Calculator
 * @author Pavlov Alexander
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //Создаем класс Scanner
        Scanner scanner = new Scanner(System.in);

        //Снимаем первое число введенное в консоли
        System.out.println("Введите первое число:");
        float load1f = scanner.nextFloat();

        //Снимаем первое число введенное в консоли
        System.out.println("Введите второе число:");
        float load2f = scanner.nextFloat();

        //Выводим сумму в консоль с округлением до 4х знаков после запятой
        System.out.printf("Сумма чисел равна = " + "%.4f", (load1f + load2f));


        scanner.close();
    }
}