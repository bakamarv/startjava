public class Wolf {

    private char gender;
    private String name;
    private float weigth;
    private float age;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    void go() {

    }

    void sit() {

    }

    void run() {

    }

    void howl() {
        System.out.println("Owooooooo");
    }

    void hunt() {

    }
}

