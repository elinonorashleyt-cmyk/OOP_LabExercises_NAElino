public class AirTransport extends Transportation {
    protected int maxAltitude; // in meters

    public AirTransport(String name, int capacity, int maxAltitude) {
        super(name, capacity);
        this.maxAltitude = maxAltitude;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Max Altitude: " + maxAltitude + " meters");
    }
}


