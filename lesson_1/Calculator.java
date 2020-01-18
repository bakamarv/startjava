import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int firstNum;
        int secondNum;
        char oper;
        System.out.println("Введите первое число ");
        Scanner inputFigure = new Scanner (System.in);
        firstNum = inputFigure.nextInt ();
        System.out.println("Введите второе число ");
        secondNum = inputFigure.nextInt ();
        System.out.println("Введите оператор ");
        inputFigure.nextLine();
        oper = inputFigure.nextLine().charAt(0);
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
