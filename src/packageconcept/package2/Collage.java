package packageconcept.package2;

public class Collage {
    int collegeId;
    String collegeName;
    public void getData(int collegeId, String collegeName) {
        this.collegeId = collegeId;
        this.collegeName = collegeName;
    }

    public void displayData() {
        System.out.println("College ID: " + collegeId);
        System.out.println("College Name: " + collegeName);
    }
}
