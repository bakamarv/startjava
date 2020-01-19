import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int firstNum;
        int secondNum;
        char operator;
        int result = 1;

        System.out.println("Введите первое число ");
        Scanner scanner = new Scanner(System.in);
        firstNum = scanner.nextInt();
        System.out.println("Введите второе число ");
        secondNum = scanner.nextInt();
        System.out.println("Введите оператор (+, -, *, ^ или %)");
        scanner.nextLine();
        operator = scanner.nextLine().charAt(0);
        System.out.println("Результат ");

        if (operator == '+') {
            System.out.println(firstNum + secondNum);
        } else if (operator == '-') {
            System.out.println(firstNum -secondNum);
        } else if (operator == '*') {
            System.out.println(firstNum * secondNum);
        }else if (operator == '/') {
            System.out.println(firstNum / secondNum);
        } else if (operator == '^') {
             for (int i = 1; i <= secondNum; i++) {
                result = result * firstNum;
             }
            System.out.println(result);
        } else {
            System.out.println(firstNum % secondNum);
        }
    }
}
