package number3;

public class CompactCourseFormatter implements CourseFormatter {
    @Override
    public String format(Course course) {
        return course.title() + " ("
                + course.completedHours() + "/"
                + course.durationHours() + " ч.)";
    }
}
