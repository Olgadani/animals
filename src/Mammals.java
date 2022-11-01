public class Mammals extends Animals{
    String areal;
    int speed;
    public Mammals(int age, String name, String areal, int speed) {
        super(age, name);
        setAreal(areal);
        setSpeed(speed);
    }

    public String getAreal() {
        return areal;
    }

    public void setAreal(String areal) {
        this.areal = checkDefault(areal, "Информации нет");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = Math.max(speed, 10);
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }
}
