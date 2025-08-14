package packageconcept.package1;

public class Teacher {
    int teacherID;
    String teacherName;
    public void getData(int id, String name) {
        teacherID = id;
        teacherName = name;
    }
    public void displayData() {
        System.out.println("Teacher ID: " + teacherID);
        System.out.println("Teacher Name: " + teacherName);
    }
}
