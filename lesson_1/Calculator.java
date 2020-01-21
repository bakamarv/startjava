import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите первое число ");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        System.out.println("Введите второе число ");
        int secondNum = scanner.nextInt();
        System.out.println("Введите оператор (+, -, *, ^ или %)");
        scanner.nextLine();
        char operator = scanner.nextLine().charAt(0);
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
             int result = 1;
             for (int i = 1; i <= secondNum; i++) {
                result *= firstNum;
             }
            System.out.println(result);
        } else {
            System.out.println(firstNum % secondNum);
        }
    }
}
