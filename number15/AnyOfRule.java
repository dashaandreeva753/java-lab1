
package number15;

import java.util.List;

public class AnyOfRule implements EnrollmentRule {
    private final List<EnrollmentRule> rules;

    public AnyOfRule(List<EnrollmentRule> rules) {
        this.rules = List.copyOf(rules);
    }

    @Override
    public RuleResult check(Student student, Course course) {
        StringBuilder reasons = new StringBuilder();

        for (EnrollmentRule rule : rules) {
            RuleResult result = rule.check(student, course);

            if (result instanceof RulePassed) {
                return new RulePassed(
                        "Хотя бы одно правило пройдено"
                );
            }

            if (!reasons.isEmpty()) {
                reasons.append("; ");
            }

            reasons.append(result.message());
        }

        return new RuleFailed(
                "Ни одно правило не пройдено: " + reasons
        );
    }
}
