public class Birds extends Animals{
    String areal;
    public Birds(int age, String name, String areal) {
        super(age, name);
        this.areal = checkDefault(areal, "Информация не указана");
    }

    public String getAreal() {
        return areal;
    }

    @Override
    public void eat() {
        System.out.println("Ем много - высокий метаболизм");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю мало - надо есть");
    }

    @Override
    public void move() {
        System.out.println("Перемещаюсь по-разному - зависит от вида");
    }

    public void hunting() {
        System.out.println("Охочусь - кушать хочется");
    }

    @Override
    public String toString() {
        return "Birds{" +
                "areal='" + getAreal() + '\'' +
                "} " + super.toString();
    }
}
