public class ProjectTester {
    public static void main(String[] args) {
        // Education Level
        PrimaryEducation primary = new PrimaryEducation(300, "City A");
        SecondaryEducation secondary = new SecondaryEducation(200, "City B");
        HigherEducation higher = new HigherEducation(100, "City C");

        // Education Type
        InclusiveEducation inclusive = new InclusiveEducation(500, "City A");
        EquitableEducation equitable = new EquitableEducation(400, "City B");

        // Learning Mode
        OnlineLearning online = new OnlineLearning(250, "City A");
        InPersonLearning inPerson = new InPersonLearning(350, "City B");

        // Display Info
        System.out.println("--- Education Level ---");
        primary.displayInfo();
        secondary.displayInfo();
        higher.displayInfo();

        System.out.println("\n--- Education Type ---");
        inclusive.displayInfo();
        equitable.displayInfo();

        System.out.println("\n--- Learning Mode ---");
        online.displayInfo();
        inPerson.displayInfo();
    }
}
