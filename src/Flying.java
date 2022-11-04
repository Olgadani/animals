import java.util.Objects;

public class Flying extends Birds{
    String movingType;
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

    public void flying() {
        System.out.println("Усиленно махать крыльями, нарушать закон гравитации");
    }

    @Override
    public String toString() {
        return "Flying{" +
                "movingType='" + movingType + '\'' +
                ", areal='" + areal + '\'' +
                "} " + super.toString();
    }
}
