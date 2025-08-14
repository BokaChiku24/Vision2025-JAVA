package packageconcept.package3;

import packageconcept.package1.Course;
import packageconcept.package1.Teacher;
import packageconcept.package2.Collage;

public class PackDemo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.getData(1, "John Doe");
        teacher.displayData();
        Collage collage = new Collage();
        collage.getData(2, "XYZ College");
        collage.displayData();
        Course course = new Course();
        course.getCourseDetails(3, "Java Programming");
        course.displayCourseDetails();
    }
}
