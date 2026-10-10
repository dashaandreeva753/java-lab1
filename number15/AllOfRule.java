
package number15;

import java.util.List;

public class AllOfRule implements EnrollmentRule {
    private final List<EnrollmentRule> rules;

    public AllOfRule(List<EnrollmentRule> rules) {
        this.rules = List.copyOf(rules);
    }

    @Override
    public RuleResult check(Student student, Course course) {
        for (EnrollmentRule rule : rules) {
            RuleResult result = rule.check(student, course);

            if (result instanceof RuleFailed) {
                return result;
            }
        }

        return new RulePassed("Все правила пройдены");
    }
}
