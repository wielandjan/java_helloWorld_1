package exercises.Programmieren1.SampleExam;

public class Person {
    private final String name;
    private final int age;
    private final String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "[[name=" + name + "],[age=" + age + "],[profession=" + profession + "]]";
    }
}
