import java.util.Scanner;

public class Jaeger {

    private String modelName = "Bracer Phoenix";
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armot;

    public void setModelName(String modelName) {
        this.modelName =modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setMark(String mark) {
        this.mark =mark;
    }

    public String getMark() {
        return mark;
    }

    public void setOrigin(String origin) {
        this.origin =origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setHeight(float height) {
        this.height =height;
    }

    public float getHeight() {
        return height;
    }

    public void setWeight(float weight) {
        this.weight =weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setSpeed(int speed) {
        this.speed =speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setStrength(int strength) {
        this.strength =strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setArmot(int armot) {
        this.armot =armot;
    }

    public int getArmot() {
        return armot;
    }

    boolean drift() {
        return true;
    }

    void move() {
        System.out.println("вызван метод move для робота "+ modelName);
    }

    String scanKaiju() {
        System.out.println("Введите Кайдзю:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    void useVortexCannon() {
        System.out.println("вызван метод useVortexCannon для робота "+ modelName);
    }
}
