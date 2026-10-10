
package number15;

public class PrerequisitesRule implements EnrollmentRule {
    @Override
    public RuleResult check(Student student, Course course) {
        if (student.hasPrerequisites()) {
            return new RulePassed("Предварительные требования выполнены");
        }

        return new RuleFailed("Не выполнены предварительные требования");
    }
}
