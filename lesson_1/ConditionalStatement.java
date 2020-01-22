import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        System.out.println("Введите ваш возраст");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age > 20) {
            System.out.println("Ваш возраст больше 20 = "+ age);
        }

        System.out.println("Введите ваш пол M или W ");
        scanner.nextLine();
        char gender = scanner.nextLine().charAt(0);
        if (gender == 'M') {
            System.out.println("Мужской");
        }
        if (gender != 'M') {
            System.out.println("Не мужской");
        }

        System.out.println("Введите свой рост (в метрах)");
        double height = scanner.nextDouble ();
        if (height < 1.8) {
            System.out.println("Ваш рост менее 1.8");
        } else {
            System.out.println("Ваш рост более 1.8");
        }

        System.out.println("Введите первую букву вашего имени (в транскрибции) ");
        scanner.nextLine();
        char firstNameLatter = scanner.nextLine().charAt(0);
        if (firstNameLatter == 'M') {
            System.out.println("Ваше имя начинается с M");
        } else if (firstNameLatter == 'I') {
            System.out.println("Ваше имя начинается с I ");
        } else {
            System.out.println("Ваше имя начинается ни с M и не с I");
        }
    }
}
