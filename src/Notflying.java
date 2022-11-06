import java.util.Objects;

public class Notflying extends Birds{
    private final String movingType;
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
        System.out.println("Ем чего поймаю");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю как наемся");
    }

    @Override
    public void move() {
        System.out.println("Хожу пешком");
    }

    @Override
    public void hunting() {
        System.out.println("Охочусь");
    }

    public void walking() {
        System.out.println("Только гулять и остается, летать-то никак");
    }

    @Override
    public String toString() {
        return "Notflying{" +
                "movingType='" + getMovingType() + '\'' +
                ", areal='" + getAreal() + '\'' +
                "} " + super.toString();
    }
}
