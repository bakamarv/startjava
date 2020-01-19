
public class Cycle {
    public static void main(String[] args) {

        System.out.println ("Цикл for");
        for (int i = 0; i <= 20; i++) {
             System.out.println(i);
        }

        System.out.println ("Цикл while");
        int counter;
        counter = 6;
        while (counter>=-6) {
            System.out.println(counter);
            counter = counter-2;
        }

        System.out.println("Цикл do while");
        int counterNech;
        int sumNech = 0;
        counterNech = 10;
        do {
            if (counterNech % 2 > 0){
                sumNech = sumNech + counterNech;
            }
            counterNech = counterNech + 1;
        } while (counterNech< 20);
        System.out.println(sumNech);
    }
}
