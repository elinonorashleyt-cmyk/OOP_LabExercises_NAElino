public class EducationSystem {
    protected String name;
    protected int numberOfStudents;
    protected String location;

    public EducationSystem(String name, int numberOfStudents, String location) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.location = location;
    }

    // Runtime polymorphism: can be overridden
    public void displayInfo() {
        System.out.println("Education System: " + name);
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Location: " + location);
    }

    // Compile-time polymorphism: overloaded method
    public void displayInfo(boolean showHeader) {
        if (showHeader) {
            System.out.println("=== Education System Info ===");
        }
        displayInfo(); // call the original method
    }
}
