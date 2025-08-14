package packageconcept.package1;

public class Course {
    int courseId;
    String courseName;
    public void getCourseDetails(int c1, String name) {
        courseId = c1;
        courseName = name;
    }
    public void displayCourseDetails() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
    }
}
