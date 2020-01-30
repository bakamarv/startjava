import java.util.Scanner;

public class CalculatorTest{

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.print("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        calculator.setFirstNum(scanner.nextInt());
        System.out.print("Введите знак математической операции: ");
        System.out.print(scanner.nextLine());
        calculator.setOperator(scanner.nextLine().charAt(0));
        System.out.print("Введите второе число: ");
        calculator.setSecondNum(scanner.nextInt());
        int result = calculator.calculate();
        System.out.print("Результат: " + result);
    }
}
