public class WaterTransport extends Transportation {
    protected double tonnage; // weight it can carry in tons

    public WaterTransport(String name, int capacity, double tonnage) {
        super(name, capacity);
        this.tonnage = tonnage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tonnage: " + tonnage + " tons");
    }
}
