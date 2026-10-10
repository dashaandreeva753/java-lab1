package number9;

public class AgePolicy implements EnrollmentPolicy {

    @Override
    public boolean isAllowed(Student student, Course course) {
        return student.getAge() >= 18;
    }
}