package number15;

public class Course {
    private final String title;
    private final int capacity;
    private int enrolled;
    private final boolean active;

    public Course(String title, int capacity, int enrolled,
                  boolean active) {
        this.title = title;
        this.capacity = capacity;
        this.enrolled = enrolled;
        this.active = active;
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

    public boolean isActive() {
        return active;
    }

    public void enroll() {
        enrolled++;
    }
}
