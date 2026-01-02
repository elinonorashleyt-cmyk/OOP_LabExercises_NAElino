public class EducationLevel extends EducationSystem {
    protected int gradeLevels;

    public EducationLevel(String name, int numberOfStudents, String location, int gradeLevels) {
        super(name, numberOfStudents, location);
        this.gradeLevels = gradeLevels;
    }

    // Runtime polymorphism: overrides displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade Levels: " + gradeLevels);
    }

    // Compile-time polymorphism: overloaded method
    public void displayInfo(String extraDetail) {
        displayInfo(); // call the main method
        System.out.println(extraDetail);
    }
}
