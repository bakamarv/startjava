public class JaegerTest {

    public static void main(String[] args) {
        System.out.println("Первый робот:");
        Jaeger firstJaeger = new Jaeger();
        firstJaeger.setModelName("Bracer Phoenix");

        firstJaeger.setMark("Mark-5");
        firstJaeger.setOrigin("USA");
        firstJaeger.setHeight(70.7f);
        firstJaeger.setWeight(2.1f);
        firstJaeger.setSpeed(3);
        firstJaeger.setStrength(8);
        firstJaeger.setArmot(9);

        System.out.println(firstJaeger.getMark());
        System.out.println(firstJaeger.getOrigin());
        System.out.println(firstJaeger.getHeight());
        System.out.println(firstJaeger.getWeight());
        System.out.println(firstJaeger.getSpeed());
        System.out.println(firstJaeger.getStrength());
        System.out.println(firstJaeger.getArmot());
        firstJaeger.move();
        firstJaeger.useVortexCannon();


        System.out.println("Второй робот:");
        Jaeger secondJaeger = new Jaeger();
        secondJaeger.setModelName("Coyote Tango");
        secondJaeger.setMark("Mark-1");
        secondJaeger.setOrigin("Japan");
        secondJaeger.setHeight(85.34f);
        secondJaeger.setWeight(2.3f);
        secondJaeger.setSpeed(1);
        secondJaeger.setStrength(6);
        secondJaeger.setArmot(5);

        System.out.println(secondJaeger.getMark());
        System.out.println(secondJaeger.getOrigin());
        System.out.println(secondJaeger.getHeight());
        System.out.println(secondJaeger.getWeight());
        System.out.println(secondJaeger.getSpeed());
        System.out.println(secondJaeger.getStrength());
        System.out.println(secondJaeger.getArmot());
        System.out.println(secondJaeger.scanKaiju());
        secondJaeger.move();
        secondJaeger.useVortexCannon();
    }
}
