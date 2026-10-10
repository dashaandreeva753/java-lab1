package number5;

public class Course {
    private final long id;
    private final String title;

    public Course(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public long id() {
        return id;
    }

    public String title() {
        return title;
    }
}