public class Transportation {
    protected String name;
    protected int capacity;

    public Transportation(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void displayInfo() {
        System.out.println("Transport: " + name + ", Capacity: " + capacity);
    }
}
