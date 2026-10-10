package number15;

public class CapacityRule implements EnrollmentRule {
    @Override
    public RuleResult check(Student student, Course course) {
        if (course.getEnrolled() < course.getCapacity()) {
            return new RulePassed("Есть свободные места");
        }

        return new RuleFailed("На курсе нет свободных мест");
    }
}
