import java.util.Objects;

public class Notflying extends Birds{
    String movingType;
    public Notflying(int age, String name, String areal, String movingType) {
        super(age, name, areal);
        this.movingType = checkDefault(movingType, "Информация не указана");
    }

    public String getMovingType() {
        return movingType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notflying notflying = (Notflying) o;
        return Objects.equals(movingType, notflying.movingType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movingType);
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

    @Override
    public void hunting() {
    }

    public void walking() {
        System.out.println("Только гулять и остается, летать-то никак");
    }

    @Override
    public String toString() {
        return "Notflying{" +
                "movingType='" + movingType + '\'' +
                ", areal='" + areal + '\'' +
                "} " + super.toString();
    }
}
