import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int i = -1;
        int number;
        final Random rnd = new Random();
        number = min + rnd.nextInt(max - min + 1);
        System.out.println("Угадайте число от 0 до 100 ");
        Scanner inputFigure = new Scanner (System.in);
        while (i != number){
            i = inputFigure.nextInt();
            if (number > i){
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            };
            if (number < i){
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            }
            if (number == i){
                System.out.println("Вы угадали!");
            }
        }
    }
}
