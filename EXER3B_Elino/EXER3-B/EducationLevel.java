public class EducationLevel extends EducationSystem {
    protected int gradeLevels;

    public EducationLevel(String name, int numberOfStudents, String location, int gradeLevels) {
        super(name, numberOfStudents, location);
        this.gradeLevels = gradeLevels;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade Levels: " + gradeLevels);
    }
}
