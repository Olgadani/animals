import java.util.Objects;

public class Herbivores extends Mammals {
    String eatType;
    public Herbivores(int age, String name, String areal, int speed, String eatType) {
        super(age, name, areal, speed);
        setEatType(eatType);
    }

    public String getEatType() {
        return eatType;
    }

    public void setEatType(String eatType) {
        this.eatType = checkDefault(eatType, "Информация не указана");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(eatType, that.eatType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eatType);
    }

    @Override
    public void eat() {
        System.out.println("Ем траву");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю настороженно");
    }

    @Override
    public void move() {
        System.out.println("Бегаю быстро");
    }

    @Override
    public void walking() {
        System.out.println("Ну так себе прогулки - все сожрать норовят");
    }

    public void graze() {
        System.out.println("Перемещаюсь по ограниченной территории и жую");
    }

    @Override
    public String toString() {
        return "Herbivores{" +
                "eatType='" + eatType + '\'' +
                ", areal='" + areal + '\'' +
                ", speed=" + speed +
                "} " + super.toString();
    }
}
