public class Calculator {

    public static void main(String[] args) {


        Application Calculate = new Application();
            Calculate.getInput();
            switch (Calculate.oper) {
                case "+": {
                    Calculate.sum();
                    break;
                }
                case "-": {
                    Calculate.minus();
                    break;
                }
                case "*": {
                    Calculate.multiply();
                    break;
                }
                case "/": {
                    Calculate.divide();
                    break;
                }
                default:
                    System.out.println(Calculate.oper + "не равно значениям */+-");
            }
        }
    }

