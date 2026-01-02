public class ProjectTester {
    public static void main(String[] args) {
        // Runtime polymorphism: superclass reference
        EducationSystem edu1 = new PrimaryEducation(300, "City A");
        EducationSystem edu2 = new InclusiveEducation(500, "City B");
        EducationSystem edu3 = new OnlineLearning(250, "City C");

        System.out.println("--- Runtime Polymorphism ---");
        edu1.displayInfo(); // calls PrimaryEducation version
        edu2.displayInfo(); // calls InclusiveEducation version
        edu3.displayInfo(); // calls OnlineLearning version

        System.out.println("\n--- Compile-time Polymorphism ---");
        PrimaryEducation primary = new PrimaryEducation(300, "City A");
        primary.displayInfo(); // original
        primary.displayInfo("Extra detail: Quality Curriculum"); // overloaded

        InclusiveEducation inclusive = new InclusiveEducation(500, "City B");
        inclusive.displayInfo(true, "Special program for disabled students");

        OnlineLearning online = new OnlineLearning(250, "City C");
        online.displayInfo("Interactive online platform", true);
    }
}
