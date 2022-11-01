public abstract class Animals {
    private final int age;
    private final String name;

    public Animals(int age, String name) {
        this.age = Math.max(age, 1);
        this.name = checkDefault(name, "Информация не известна");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void move();

    public static String checkDefault(String value, String error) {
        if (value == null || value.isBlank()) {
            return error;
        } else {
            return value;
        }
    }
}
