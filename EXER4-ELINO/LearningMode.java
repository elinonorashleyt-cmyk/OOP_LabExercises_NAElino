public class LearningMode extends EducationSystem {
    protected String mode;

    public LearningMode(String name, int numberOfStudents, String location, String mode) {
        super(name, numberOfStudents, location);
        this.mode = mode;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Learning Mode: " + mode);
    }

    // Overloaded method
    public void displayInfo(String modeDescription, boolean showMode) {
        displayInfo();
        if(showMode) {
            System.out.println("Mode Description: " + modeDescription);
        }
    }
}
