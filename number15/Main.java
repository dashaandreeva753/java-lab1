package number15;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Дарья", 20, true);

        Course course = new Course(
                "Java",
                30,
                10,
                true
        );

        EnrollmentRule allRules = new AllOfRule(List.of(
                new AgeRule(),
                new PrerequisitesRule(),
                new CapacityRule(),
                new ActiveCourseRule(),
                new StudentNameRule()
        ));

        EnrollmentService service =
                new EnrollmentService(allRules);

        RuleResult result = service.enroll(student, course);
        System.out.println(result.message());

        EnrollmentRule anyRule = new AnyOfRule(List.of(
                new AgeRule(),
                new PrerequisitesRule()
        ));

        RuleResult alternativeResult =
                anyRule.check(student, course);

        System.out.println(alternativeResult.message());

        System.out.println("Записано студентов: "
                + course.getEnrolled());
    }
}
