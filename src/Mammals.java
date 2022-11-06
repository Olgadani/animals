public class Mammals extends Animals{
    private final String areal;
    private final int speed;
    public Mammals(int age, String name, String areal, int speed) {
        super(age, name);
        this.areal = checkDefault(areal, "Информации нет");
        this.speed = Math.max(speed, 10);
    }

    public String getAreal() {
        return areal;
    }


    public int getSpeed() {
        return speed;
    }


    @Override
    public void eat() {
        System.out.println("При рождении пью молоко");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю.");
    }

    @Override
    public void move() {
        System.out.println("Перемещаюсь в зависимости от текущей ситуации");
    }

    public void walking() {
        System.out.println("Гулять некогда");
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "areal='" + getAreal() + '\'' +
                ", speed=" + getSpeed() +
                "} " + super.toString();
    }
}
