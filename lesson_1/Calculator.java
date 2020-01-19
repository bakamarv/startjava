import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int firstNum;
        int secondNum;
        char oper;

        System.out.println("Введите первое число ");
        Scanner scanner = new Scanner(System.in);
        firstNum = scanner.nextInt();
        System.out.println("Введите второе число ");
        secondNum = scanner.nextInt();
        System.out.println("Введите оператор ");
        scanner.nextLine();
        oper = scanner.nextLine().charAt(0);
        System.out.println("Результат ");
        if (oper == '+') {
            System.out.println(firstNum + secondNum);
        }
        if (oper == '-') {
            System.out.println(firstNum -secondNum);
        }
        if (oper == '*') {
            System.out.println(firstNum * secondNum);
        }
        if (oper == '/') {
            System.out.println(firstNum / secondNum);
        }
        if (oper == '^') {
            System.out.println(firstNum ^ secondNum);
        }
        if (oper == '%') {
            System.out.println(firstNum % secondNum);
        }
    }
}
