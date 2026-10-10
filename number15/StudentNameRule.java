
package number15;

public class StudentNameRule implements EnrollmentRule {
    @Override
    public RuleResult check(Student student, Course course) {
        if (student.getName() != null
                && !student.getName().isBlank()) {
            return new RulePassed("Имя указано");
        }

        return new RuleFailed("Имя студента не указано");
    }
}

