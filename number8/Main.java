package number8;

public class Main {

    public static void main(String[] args) {
        Course course = new Course(1, "Java");

        CourseReader reader = new ReadOnlyCourseRepository(course);
        System.out.println(reader.findById(1).title());

        CourseRepository repository = new InMemoryCourseRepository();
        repository.save(course);

        System.out.println(repository.findById(1).title());
    }
}