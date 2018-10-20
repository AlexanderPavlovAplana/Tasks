public class Calculator {

    public static void main(String[] args) {


        Application Calculate = new Application();
        Calculate.getInput();
        switch (Calculate.oper) {
            case "+": {
                Calculate.sum(7, 8);
                break;
            }
            case "-": {
                Calculate.minus(7, 8);
                break;
            }
            case "*": {
                Calculate.multiply(7, 8);
                break;
            }
            case "/": {
                try {
                    Calculate.divide(100, 5);
                } catch (Exeption Exeption) {
                    Exeption.printStackTrace();
                }
                break;
            }
            default:
                System.out.println(Calculate.oper + "не равно значениям */+-");
        }
    }
}