
public class Cycle {
    public static void main(String args[]) {
         System.out.println ("Цикл for");
         for (int i = 0; i <= 20; i++) {
             System.out.println ((i));
         }
          System.out.println ("Цикл while");
          int i;
          i = 6;
          while (i>=-6) {
            System.out.println ((i));
            i = i-2;
          }
          System.out.println ("Цикл do while");
          int j;
          j = 10;
          do {
            if (j % 2 > 0){
            System.out.println ((i));}
            j = j+1;
          } while (j<20);
    }
}
