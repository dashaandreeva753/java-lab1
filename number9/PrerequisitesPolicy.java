package number9;

public class PrerequisitesPolicy implements EnrollmentPolicy {

    @Override
    public boolean isAllowed(Student student, Course course) {
        return student.hasPrerequisites();
    }
}