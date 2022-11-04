import java.util.Objects;

public class Amphibians extends Animals{
    String areal;
    public Amphibians(int age, String name, String areal) {
        super(age, name);
        this.areal = checkDefault(areal, "Информация не указана");
    }

    public String getAreal() {
        return areal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(areal, that.areal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areal);
    }

    @Override
    public void eat() {
        System.out.println("Ем комаров и всякую дрянь");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю когда мерзну");
    }

    @Override
    public void move() {
        System.out.println("Перемещаюсь как-то");
    }

    public void hunting() {
        System.out.println("Охочусь на что придется");
    }

    @Override
    public String toString() {
        return "Amphibians{" +
                "areal='" + areal + '\'' +
                "} " + super.toString();
    }
}
