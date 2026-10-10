package number9;

public class EnrollmentService {

    private final EnrollmentPolicy policy;

    public EnrollmentService(EnrollmentPolicy policy) {
        this.policy = policy;
    }

    public boolean enroll(Student student, Course course) {
        if (!policy.isAllowed(student, course)) {
            System.out.println("Запись запрещена: " + student.getName());
            return false;
        }

        course.enroll();
        System.out.println("Запись успешна: " + student.getName());
        return true;
    }
}