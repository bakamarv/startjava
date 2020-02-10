import java.util.Scanner;

public class GuessNumberTest{
    public static void main(String[] args) {
        GuessNumber guess = new GuessNumber();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первого игрока");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Привет " + player1.getName());

        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(scanner.nextLine());
        System.out.println("Привет " + player2.getName());

        System.out.println("Введите имя третьего игрока");
        Player player3 = new Player(scanner.nextLine());
        System.out.println("Привет " + player3.getName());

        String nextRound;
        do {
               guess.startGame();
               do {
                System.out.println(player1.getName() + ", угадайте число от 0 до 100 ");
                player1.setNumber(scanner.nextInt());
                if (guess.CheckNumber(player1)) {
                    break;
                }

                System.out.println(player2.getName() + ", угадайте число от 0 до 100 ");
                player2.setNumber(scanner.nextInt());
                if (guess.CheckNumber(player2)) {
                    break;
                }

                System.out.println(player3.getName() + ", угадайте число от 0 до 100 ");
                player3.setNumber(scanner.nextInt());
                if (guess.CheckNumber(player3)) {
                    break;
                }
            } while (true);

            do {
                System.out.print("Хотите продолжить? [yes/no]: ");
                nextRound = scanner.nextLine();
            } while (!nextRound.equals("yes") && !nextRound.equals("no"));
        } while (nextRound.equals("yes"));
    }
}
