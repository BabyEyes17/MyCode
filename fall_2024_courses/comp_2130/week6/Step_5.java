// Changing Vehicle from interface to class
class Vehicle {
    void start() {
        System.out.println("Vehicle starts.");
    }
}

// Keeping Electric as an interface
interface Electric {
    String VEHICLE_TYPE = "Electric Vehicle"; // Public static final by default
    void charge();
}

// Tesla now extends Vehicle and implements Electric
class Tesla extends Vehicle implements Electric {
    @Override
    public void charge() {
        System.out.println("Tesla is charging.");
    }
}

public class Step_5 {
    public static void main(String[] args) {
        Tesla myTesla = new Tesla();
        myTesla.start(); // Using method from Vehicle class
        myTesla.charge(); // Using method from Electric interface

        // Accessing the constant from the Electric interface
        System.out.println("Vehicle Type: " + Electric.VEHICLE_TYPE);
    }
}
