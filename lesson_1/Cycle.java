public class Cycle {
    public static void main(String[] args) {
        System.out.println ("Цикл for");
        for (int i = 0; i <= 20; i++) {
             System.out.println(i);
        }

        System.out.println ("Цикл while");
        int counter =6;
        while (counter >=-6) {
            System.out.println(counter);
            counter -= 2;
        }

        System.out.println("Цикл do while");
        int counterOdd = 10;
        int sumOdd = 0;
        do {
            if (counterOdd % 2 > 0){
                sumOdd += counterOdd;
            }
            counterOdd++;
        } while (counterOdd < 20);
        System.out.println(sumOdd);
    }
}
