package number3;

public class DetailedCourseFormatter implements CourseFormatter {
    @Override
    public String format(Course course) {
        return "ID: " + course.id()
                + "\nНазвание: " + course.title()
                + "\nВсего часов: " + course.durationHours()
                + "\nПройдено часов: " + course.completedHours()
                + "\nОсталось часов: " + course.remainingHours()
                + "\nЗавершён: " + course.isCompleted();
    }
}