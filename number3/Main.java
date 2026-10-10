package number3;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(10, "Java Fundamentals", 32);
        course.completeHours(6);

        CourseFormatter[] formatters = {
                new CompactCourseFormatter(),
                new DetailedCourseFormatter(),
                new VerboseCourseFormatter()
        };

        for (CourseFormatter formatter : formatters) {
            System.out.println(formatter.format(course));
            System.out.println("");
        }
    }
}