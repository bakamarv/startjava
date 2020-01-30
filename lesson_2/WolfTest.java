public class WolfTest {

    public static void main(String[] args) {

        Wolf myWolf = new Wolf();
        /*myWolf.name = "Misha";
        myWolf.age = 7;
        myWolf.weigth = 22;
        myWolf.color = "white";*/

        myWolf.setName("Misha");
        myWolf.setAge(7);
        myWolf.setWeigth(22);
        myWolf.setColor("white");

        System.out.println(myWolf.getName());
        System.out.println(myWolf.getAge());
        System.out.println(myWolf.getWeigth());
        System.out.println(myWolf.getColor());

        myWolf.go();
        myWolf.sit();
        myWolf.run();
        myWolf.hunt();
        myWolf.howl();

    }
}
