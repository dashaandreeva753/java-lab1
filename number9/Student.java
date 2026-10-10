package number9;

public class Student {
    private final String name;
    private final int age;
    private final boolean hasPrerequisites;

    public Student(String name, int age, boolean hasPrerequisites) {
        this.name = name;
        this.age = age;
        this.hasPrerequisites = hasPrerequisites;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean hasPrerequisites() {
        return hasPrerequisites;
    }
}