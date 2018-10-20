import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Task 7
 *
 * @author Pavlov Alexander
 */



public class Application {

        int firstNumber,
        secondNumber,
        res;

        String oper;



    public void getInput() {
        boolean b = true;
        Scanner input;
        while (b) {
            input = new Scanner(System.in);
            System.out.println("Введите первое число:");
            try {
                firstNumber = input.nextInt();
                b = false;
            } catch (InputMismatchException e) {
                System.err.println("Не верное значение" + e);
                b = true;
            }
        }

        input = new Scanner(System.in);
        System.out.println("Введите оператор:");
        oper = input.next();
        b=true;
        while (b) {
            System.out.println("Введи второе число:");
            try {
                secondNumber = input.nextInt();
                b = false;
            } catch (InputMismatchException e) {
                System.err.println("Не верное значение" + e);
                b = true;
            }

        }
        input.close();
    }


        public int sum() {
            res=firstNumber + secondNumber;
            System.out.println(res);
            return res;
        }


        public int minus() {
            res=firstNumber - secondNumber;
            System.out.println(res);
            return res;
        }


    public int divide() throws Exeption {
        if(secondNumber==0){
            throw new Exeption("Деление на ноль невозможно");
        }
        res=firstNumber / secondNumber;
        System.out.println(res);
        return res;
    }


        public int multiply() {
            res=firstNumber * secondNumber;
            System.out.println(res);
            return res;
        }
    }


