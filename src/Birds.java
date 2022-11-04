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

    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }

    public void hunting() {
    }

    @Override
    public String toString() {
        return "Birds{" +
                "areal='" + areal + '\'' +
                "} " + super.toString();
    }
}
