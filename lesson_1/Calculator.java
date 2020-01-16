import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a;
        int b;

        char d;

        System.out.println("Введите первое число ");

        Scanner inputFigure = new Scanner (System.in);
        a = inputFigure.nextInt ();

        System.out.println("Введите второе число ");
        b = inputFigure.nextInt ();

        System.out.println("Введите оператор ");
        inputFigure.nextLine();
        d = inputFigure.nextLine().charAt(0);
        System.out.println("Результат ");

        if (d == '+') {
            System.out.println( a+b);
        }

        if (d == '-') {
            System.out.println( a-b);
        }

        if (d == '*') {
            System.out.println( a*b);
        }

        if (d == '/') {

            System.out.println( a/b);
        }
        if (d == '^') {
            System.out.println( a^b);
        }

        if (d == '%') {
            System.out.println( a%b);
        }

    }
}
