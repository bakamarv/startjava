import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String nextCalculation;

        do {
            System.out.print("Введите первое число: ");
            calculator.setFirstNum(scanner.nextInt());

            System.out.print("Введите знак математической операции (+,-,*, /, %, ^): ");
            scanner.nextLine();
            calculator.setOperator(scanner.nextLine().charAt(0));

            System.out.print("Введите второе число: ");
            calculator.setSecondNum(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Результат: " + calculator.calculate());
            do {
                System.out.print("Хотите продолжить? [yes/no]: ");
                nextCalculation = scanner.nextLine();
            } while (!nextCalculation.equals("yes") && !nextCalculation.equals("no"));
        } while (nextCalculation.equals("yes"));
    }
}
