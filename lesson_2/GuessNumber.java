import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int number;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        number = rnd.nextInt(101);
        System.out.println("Загадано число от 0 до 100 ");
           //guess.startGame();
        do {
            System.out.println(player1.getName() + ", угадайте число от 0 до 100 ");
            player1.setNumber(scanner.nextInt());
            if (checkNumber(player1)) {
                break;
            }

            System.out.println(player2.getName() + ", угадайте число от 0 до 100 ");
            player2.setNumber(scanner.nextInt());
            if (checkNumber(player2)) {
                break;
            }
        } while (true);
    }

    private boolean checkNumber(Player player) {
        if (number > player.getNumber()) {
            System.out.println(player.getName() + ", введенное вами число меньше того, что загадал компьютер");
        } else if (number < player.getNumber()) {
            System.out.println(player.getName() + ", введенное вами число больше того, что загадал компьютер");
        } else {
            System.out.println(player.getName() + ", вы угадали!");
            return true;
        }
        return false;
    }
}
