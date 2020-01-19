import java.util.Random;
import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        int userNum = -1;
        int compNum;
        Random rnd = new Random();
        compNum = rnd.nextInt(101);
        System.out.println("Угадайте число от 0 до 100 ");
        Scanner scanner = new Scanner(System.in);
        while (userNum != compNum) {
            userNum = scanner.nextInt();
            if (compNum > userNum) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            }
        }
        System.out.println("Вы угадали!");
    }
}
