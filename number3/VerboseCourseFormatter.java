package number3;

public class VerboseCourseFormatter implements CourseFormatter {
    @Override
    public String format(Course course) {
        double progress = 100.0 * course.completedHours()
                / course.durationHours();

        return "Курс: " + course.title()
                + "\nПрогресс: " + progress + "%"
                + "\nВыполнено: " + course.completedHours()
                + " из " + course.durationHours() + " часов";
    }
}