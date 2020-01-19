import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        int age;
        char pol;
        double rost;
        char name;

        System.out.print(" Введите ваш возраст");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();
        if (age > 20) {
            System.out.println("Ваш возраст больше 20= "+ age);
        }

        System.out.println("Введите ваш пол M или W ");
        scanner.nextLine();
        pol = scanner.nextLine().charAt(0);
        if (pol == 'M') {
            System.out.println("Мужской");
        }
        if (pol != 'M') {
            System.out.println("Не мужской");
        }

        System.out.print("Введите свой рост (в метрах)");
        rost = scanner.nextDouble ();
        if (rost < 1.8) {
            System.out.println("Ваш рост менее 1.8");
        } else {
            System.out.println("Ваш рост более 1.8");
        }

        System.out.print("Введите первую букву вашего имени (в транскрибции)");
        scanner.nextLine();
        name = scanner.nextLine().charAt(0);
        if (name == 'M') {
            System.out.println("Ваше имя начинается с M");
        } else if (name == 'I') {
            System.out.println("Ваше имя начинается с I ");
        } else {
            System.out.println("Ваше имя начинается ни с M и не с I");
        }
    }
}
