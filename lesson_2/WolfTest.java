public class WolfTest {

    public static void main(String[] args) {

        Wolf myWolf = new Wolf();
        myWolf.name = "Misha";
        myWolf.age = 7;
        myWolf.weigth = 22;
        myWolf.color = "white";

        myWolf.go();
        myWolf.sit();
        myWolf.run();
        myWolf.hunt();
        myWolf.howl();
    }
}
