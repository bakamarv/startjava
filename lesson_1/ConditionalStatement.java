import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        int Age;
        char  Pol;
        double Rost;
        char Name;

        System.out.print (" Введите ваш возраст ");
        Scanner inputFigure = new Scanner (System.in);
        Age = inputFigure.nextInt ();


        if (Age > 20)
        {
            System.out.println("Ваш возраст больше 20= "+ Age);
        }


        System.out.println ("Введите ваш пол M или W  ");

        inputFigure.nextLine ();
            Pol = inputFigure.nextLine().charAt(0);

        if (Pol == 'M') {System.out.println("Мужской");}
        if (Pol != 'M') {System.out.println("Не мужской");}

        System.out.print ("Введите свой рост (в метрах) ");
        Rost =  inputFigure.nextDouble ();

        if (Rost < 1.8) {System.out.println("Ваш рост менее 1.8");}
        else {System.out.println("Ваш рост более 1.8");}

        System.out.print ("Введите первую букву вашего имени (в транскрибции)");
                inputFigure.nextLine ();
                Name = inputFigure.nextLine().charAt(0);


        if (Name == 'M') {System.out.println("Ваше имя начинается с M");}
        else
            if (Name == 'I') {System.out.println("Ваше имя начинается с I ");}
            else {System.out.println("Ваше имя начинается ни с M и не с I");}

    }

}
