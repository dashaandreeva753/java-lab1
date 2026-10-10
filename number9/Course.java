package number9;

public class Course {
    private final String title;
    private final int capacity;
    private int enrolled;

    public Course(String title, int capacity, int enrolled) {
        this.title = title;
        this.capacity = capacity;
        this.enrolled = enrolled;
    }

    public String getTitle() {
        return title;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getEnrolled() {
        return enrolled;
    }

    public void enroll() {
        enrolled++;
    }
}