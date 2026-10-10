package number8;

import java.util.HashMap;
import java.util.Map;

public class InMemoryCourseRepository implements CourseRepository {

    private final Map<Long, Course> courses = new HashMap<>();

    @Override
    public Course findById(long id) {
        return courses.get(id);
    }

    @Override
    public void save(Course course) {
        courses.put(course.id(), course);
    }
}