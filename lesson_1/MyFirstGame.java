import java.util.Random;
import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        int i = -1;
        int number;

        Random rnd = new Random();
        number = rnd.nextInt(101);
        System.out.println("Угадайте число от 0 до 100 ");
        Scanner scanner = new Scanner(System.in);
        while (i != number) {
            i = scanner.nextInt();
            if (number > i) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            }
            else {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            }
        }
        System.out.println("Вы угадали!");
    }
}
