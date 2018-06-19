/**
 * Task 3
 *
 * @author Pavlov Alexander
 */


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {


        //Создаем класс Scanner
        Scanner scanner = new Scanner(System.in);

        //Снимаем номер задачи введенное в консоли
        System.out.println("Выберите задачу:");
        int i = scanner.nextInt();


        //Если введено 1 - запускаем калькулятор
        if (i == 1) {

            System.out.println("Запущен калькулятор");

            //Снимаем первое число введенное в консоли
            System.out.println("Введите первое число:");
            float load1f = scanner.nextFloat();

            System.out.println("Введите оператор:");
            String a = scanner.next();

            //Снимаем первое число введенное в консоли
            System.out.println("Введите второе число:");
            float load2f = scanner.nextFloat();

            scanner.close();

            boolean retVal;

            if (retVal = a.equals("+")) {
                System.out.printf("Результат сложения равен = " + "%.4f", (load1f + load2f));
            } else if (retVal = a.equals("-")) {
                System.out.printf("Результат вычитания равен = " + "%.4f", (load1f - load2f));
            } else if (retVal = a.equals("*")) {
                System.out.printf("Результат умножения равен = " + "%.4f", (load1f * load2f));
            } else if (retVal = a.equals("/")) {
                System.out.printf("Результат деления равен = " + "%.4f", (load1f / load2f));
            }


        } else if (i == 2) {

            System.out.println("Запущен поиск максимального слова в массиве");


            //Снимаем и задаем размер массива
            System.out.println("Введите размер массива:");
            int size = scanner.nextInt();

            // Инициализируем массив
            String[] arr = new String[size];

            //Заполняем массив словами
            for (int count = 0; count < arr.length; count++) {

                System.out.println("Введите слово:");
                String text = scanner.next();
                arr[count] = text;
            }
            scanner.close();

            //Ищем самое длинное слово в массиве
            int a, sizewords = arr.length;
            int max = 0, maxLength = 0;
            for (a = 0; a < sizewords; ++a)
                if (arr[a].length() > maxLength) {
                    max = a;
                    maxLength = arr[a].length();
                }

                System.out.println(arr[max]);
            }


        }


    }
