import java.util.Objects;

public class Flying extends Birds{
    private final String movingType;
    public Flying(int age, String name, String areal,String movingType) {
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
        Flying flying = (Flying) o;
        return Objects.equals(movingType, flying.movingType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movingType);
    }

    @Override
    public void eat() {
        System.out.println("Ем");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю");
    }

    @Override
    public void move() {
        System.out.println("Летаю");
    }

    @Override
    public void hunting() {
        System.out.println("Высматриваю жертву сверху");
    }

    public void flying() {
        System.out.println("Усиленно махать крыльями, нарушать закон гравитации");
    }

    @Override
    public String toString() {
        return "Flying{" +
                "movingType='" + movingType + '\'' +
                ", areal='" + getAreal() + '\'' +
                "} " + super.toString();
    }
}
