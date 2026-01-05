public class TransportationTester {
    public static void main(String[] args) {
        // Air Transport
        Helicopter helicopter = new Helicopter(5, 3000);
        Airplane airplane = new Airplane(180, 12000);
        SpaceShuttle shuttle = new SpaceShuttle(7, 200000);

        // Land Transport
        Truck truck = new Truck(2, 6);
        SUV suv = new SUV(5, 4);
        Tricycle tricycle = new Tricycle(3, 3);
        Motorcycle motorcycle = new Motorcycle(2, 2);
        Kariton kariton = new Kariton(1, 2);

        // Water Transport
        Boat boat = new Boat(10, 5.0);
        Submarine submarine = new Submarine(20, 50.0);

        // Display Info
        System.out.println("--- Air Transport ---");
        helicopter.displayInfo();
        airplane.displayInfo();
        shuttle.displayInfo();

        System.out.println("\n--- Land Transport ---");
        truck.displayInfo();
        suv.displayInfo();
        tricycle.displayInfo();
        motorcycle.displayInfo();
        kariton.displayInfo();

        System.out.println("\n--- Water Transport ---");
        boat.displayInfo();
        submarine.displayInfo();
    }
}
