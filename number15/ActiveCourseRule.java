package number15;

public class ActiveCourseRule implements EnrollmentRule {
    @Override
    public RuleResult check(Student student, Course course) {
        if (course.isActive()) {
            return new RulePassed("Курс открыт");
        }

        return new RuleFailed("Курс неактивен");
    }
}
