import java.util.Random;

public class GuessNumber {
    private int number;

    public void startGame() {
        Random rnd = new Random();
        number = rnd.nextInt(101);
        System.out.println("Угадайте число от 0 до 100 ");
    }

    public boolean CheckNumber(Player player) {
        if (this.number > player.getNumber()) {
            System.out.println(player.getName() + ", введенное вами число меньше того, что загадал компьютер");
            return false;
        } else if (this.number < player.getNumber()) {
            System.out.println(player.getName() + ", введенное вами число больше того, что загадал компьютер");
            return false;
        } else {
            System.out.println(player.getName() + ", вы угадали!");
            return true;
        }
    }
}

