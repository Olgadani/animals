import java.util.Objects;

public class Predator extends Mammals {
    private final String eatType;
    public Predator(int age, String name, String areal, int speed, String eatType) {
        super(age, name, areal, speed);
        this.eatType = checkDefault(eatType, "Информация не указана");
    }

    public String getEatType() {
        return eatType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predator predator = (Predator) o;
        return Objects.equals(eatType, predator.eatType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eatType);
    }

    @Override
    public void eat() {
        System.out.println("Ем травоядных");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю после удачной охоты");
    }

    @Override
    public void move() {
        System.out.println("Во время охоты двигаюсь быстро");
    }

    @Override
    public void walking() {
        System.out.println("Когда гулять? То жрать пора, то спать охота");
    }

    public void hunting() {
        System.out.println("Когда голоден, ищу кого поймать");
    }

    @Override
    public String toString() {
        return "Predator{" +
                "eatType='" + getEatType() + '\'' +
                ", areal='" + getAreal() + '\'' +
                ", speed=" + getSpeed() +
                "} " + super.toString();
    }
}
