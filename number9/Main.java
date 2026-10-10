package number9;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Darya", 20, true);
        Course course = new Course("Java", 2, 1);

        EnrollmentService ageService =
                new EnrollmentService(new AgePolicy());

        EnrollmentService prerequisitesService =
                new EnrollmentService(new PrerequisitesPolicy());

        EnrollmentService capacityService =
                new EnrollmentService(new CapacityPolicy());

        ageService.enroll(student, course);
        prerequisitesService.enroll(student, course);
        capacityService.enroll(student, course);
    }
}