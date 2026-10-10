
package number15;

public class EnrollmentService {
    private final EnrollmentRule rule;

    public EnrollmentService(EnrollmentRule rule) {
        this.rule = rule;
    }

    public RuleResult enroll(Student student, Course course) {
        RuleResult result = rule.check(student, course);

        if (result instanceof RulePassed) {
            course.enroll();

            return new RulePassed(
                    "Студент " + student.getName()
                    + " записан на курс " + course.getTitle()
            );
        }

        return result;
    }
}
