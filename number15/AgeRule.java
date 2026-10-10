
package number15;

public class AgeRule implements EnrollmentRule {
    @Override
    public RuleResult check(Student student, Course course) {
        if (student.getAge() >= 18) {
            return new RulePassed("Возраст подходит");
        }

        return new RuleFailed("Студенту нет 18 лет");
    }
}
