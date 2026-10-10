package number8;

public class ReadOnlyCourseRepository implements CourseReader {

    private final Course course;

    public ReadOnlyCourseRepository(Course course) {
        this.course = course;
    }

    @Override
    public Course findById(long id) {
        if (course.id() == id) {
            return course;
        }

        return null;
    }
}