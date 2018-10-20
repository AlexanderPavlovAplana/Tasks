import java.util.Scanner;

/**
 * Task 5
 *
 * @author Pavlov Alexander
 */



public class Application {

        int firstNumber,
        secondNumber,
        res;

        String oper;



        public void getInput() {

            Scanner input = new Scanner(System.in);
            System.out.println("Введите первое число:");
            firstNumber = input.nextInt();
            System.out.println("Введите оператор:");
            oper = input.next();
            System.out.println("Введите второе число:");
            secondNumber = input.nextInt();
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


        public int divide() {
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

