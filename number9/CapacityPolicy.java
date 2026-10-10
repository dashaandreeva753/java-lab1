package number9;

public class CapacityPolicy implements EnrollmentPolicy {

    @Override
    public boolean isAllowed(Student student, Course course) {
        return course.getEnrolled() < course.getCapacity();
    }
}