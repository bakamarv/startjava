public class JaegerTest {

    public static void main(String[] args) {
        System.out.println("Первый робот:");
        Jaeger firstJaeger = new Jaeger("Bracer Phoenix", "Mark-5","USA", 70.7f, 2.1f, 3, 8, 9);

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
        Jaeger secondJaeger = new Jaeger("Coyote Tango", "Mark-1", "Japan", 85.34f, 2.3f);
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
